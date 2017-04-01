/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.ftdi.j2xx;

import android.util.Log;
import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.InBuffer;
import com.ftdi.j2xx.ProcessInCtrl;

class ProcessRequestWorker
implements Runnable {
    private ProcessInCtrl mInCtrl;
    int mNrBuf;

    ProcessRequestWorker(ProcessInCtrl processInCtrl) {
        this.mInCtrl = processInCtrl;
        this.mNrBuf = this.mInCtrl.getParams().getBufferNumber();
    }

    public void run() {
        int n = 0;
        try {
            do {
                InBuffer inBuffer;
                if ((inBuffer = this.mInCtrl.acquireReadableBuffer(n)).getLength() > 0) {
                    this.mInCtrl.processBulkInData(inBuffer);
                    inBuffer.purge();
                }
                this.mInCtrl.releaseWritableBuffer(n);
                n = (n + 1) % this.mNrBuf;
            } while (!Thread.interrupted());
            throw new InterruptedException();
        }
        catch (InterruptedException var4_3) {
            var4_3.printStackTrace();
            Log.d((String)"ProcessRequestThread::", (String)"Device has been closed.");
            return;
        }
        catch (Exception var2_4) {
            var2_4.printStackTrace();
            Log.e((String)"ProcessRequestThread::", (String)"Fatal error!");
            return;
        }
    }
}

