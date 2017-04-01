/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.usb.UsbDeviceConnection
 *  android.hardware.usb.UsbEndpoint
 *  android.hardware.usb.UsbRequest
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.concurrent.Semaphore
 */
package com.ftdi.j2xx;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import android.util.Log;
import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.InBuffer;
import com.ftdi.j2xx.ProcessInCtrl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

class BulkInWorker
implements Runnable {
    UsbEndpoint mBulkIn;
    UsbDeviceConnection mConnection;
    FT_Device mDevice;
    ProcessInCtrl mInCtrl;
    int mNrBuf;
    Semaphore mPauseLock;
    boolean mPaused;
    int mReadTimeout;
    UsbRequest mRequest;
    int mTransSize;

    BulkInWorker(FT_Device fT_Device, ProcessInCtrl processInCtrl, UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint) {
        this.mDevice = fT_Device;
        this.mBulkIn = usbEndpoint;
        this.mConnection = usbDeviceConnection;
        this.mInCtrl = processInCtrl;
        this.mNrBuf = this.mInCtrl.getParams().getBufferNumber();
        this.mTransSize = this.mInCtrl.getParams().getMaxTransferSize();
        this.mReadTimeout = this.mDevice.getDriverParameters().getReadTimeout();
        this.mPauseLock = new Semaphore(1);
        this.mPaused = false;
    }

    void pause() throws InterruptedException {
        this.mPauseLock.acquire();
        this.mPaused = true;
    }

    boolean paused() {
        return this.mPaused;
    }

    void restart() {
        this.mPaused = false;
        this.mPauseLock.release();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        int n = 0;
        try {
            do {
                InBuffer inBuffer;
                if (this.mPaused) {
                    this.mPauseLock.acquire();
                    this.mPauseLock.release();
                }
                if ((inBuffer = this.mInCtrl.acquireWritableBuffer(n)).getLength() == 0) {
                    ByteBuffer byteBuffer = inBuffer.getInputBuffer();
                    byteBuffer.clear();
                    inBuffer.setBufferId(n);
                    byte[] arrby = byteBuffer.array();
                    int n2 = this.mConnection.bulkTransfer(this.mBulkIn, arrby, this.mTransSize, this.mReadTimeout);
                    if (n2 > 0) {
                        byteBuffer.position(n2);
                        byteBuffer.flip();
                        inBuffer.setLength(n2);
                        this.mInCtrl.releaseReadableBuffer(n);
                    }
                }
                n = (n + 1) % this.mNrBuf;
            } while (!Thread.interrupted());
            throw new InterruptedException();
        }
        catch (InterruptedException var4_6) {
            try {
                this.mInCtrl.releaseWritableBuffers();
                this.mInCtrl.purgeINData();
                return;
            }
            catch (Exception var5_7) {
                var5_7.printStackTrace();
                return;
            }
        }
        catch (Exception var2_8) {
            var2_8.printStackTrace();
            Log.e((String)"BulkIn::", (String)"Fatal error in BulkIn thread");
            return;
        }
    }
}

