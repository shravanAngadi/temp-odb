/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.support.v4.content.LocalBroadcastManager
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.channels.Pipe
 *  java.nio.channels.Pipe$SinkChannel
 *  java.nio.channels.Pipe$SourceChannel
 *  java.util.concurrent.Semaphore
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReentrantLock
 */
package com.ftdi.j2xx;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.InBuffer;
import com.ftdi.j2xx.TFtEventNotify;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProcessInCtrl {
    private static final byte FT_MODEM_STATUS_SIZE = 2;
    private static final byte FT_PACKET_SIZE = 64;
    private static final int FT_PACKET_SIZE_HI = 512;
    private static final int MAX_PACKETS = 256;
    private int mBufInCounter;
    private ByteBuffer[] mBuffers;
    private Object mCounterLock;
    private FT_Device mDevice;
    private Condition mFullCon;
    private Lock mInFullLock;
    private InBuffer[] mInputBufs;
    private ByteBuffer mMainBuf;
    private Pipe mMainPipe;
    private Pipe.SinkChannel mMainSink;
    private Pipe.SourceChannel mMainSource;
    private int mMaxPacketSize;
    private int mNrBuf;
    private D2xxManager.DriverParameters mParams;
    private Condition mReadInCon;
    private Lock mReadInLock;
    private Semaphore[] mReadable;
    private boolean mSinkFull;
    private Semaphore[] mWritable;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ProcessInCtrl(FT_Device fT_Device) {
        this.mDevice = fT_Device;
        this.mParams = this.mDevice.getDriverParameters();
        this.mNrBuf = this.mParams.getBufferNumber();
        int n = this.mParams.getMaxBufferSize();
        this.mMaxPacketSize = this.mDevice.getMaxPacketSize();
        this.mWritable = new Semaphore[this.mNrBuf];
        this.mReadable = new Semaphore[this.mNrBuf];
        this.mInputBufs = new InBuffer[this.mNrBuf];
        this.mBuffers = new ByteBuffer[256];
        this.mInFullLock = new ReentrantLock();
        this.mFullCon = this.mInFullLock.newCondition();
        this.mSinkFull = false;
        this.mReadInLock = new ReentrantLock();
        this.mReadInCon = this.mReadInLock.newCondition();
        this.mCounterLock = new Object();
        super.resetBufCount();
        this.mMainBuf = ByteBuffer.allocateDirect((int)n);
        try {
            this.mMainPipe = Pipe.open();
            this.mMainSink = this.mMainPipe.sink();
            this.mMainSource = this.mMainPipe.source();
        }
        catch (IOException var3_3) {
            var3_3.printStackTrace();
            Log.d((String)"ProcessInCtrl", (String)"Create mMainPipe failed!");
        }
        int n2 = 0;
        while (n2 < this.mNrBuf) {
            this.mInputBufs[n2] = new InBuffer(n);
            this.mReadable[n2] = new Semaphore(1);
            this.mWritable[n2] = new Semaphore(1);
            try {
                this.acquireReadableBuffer(n2);
            }
            catch (Exception var6_5) {
                var6_5.printStackTrace();
                Log.d((String)"ProcessInCtrl", (String)("Acquire read buffer " + n2 + " failed!"));
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int decBufCount(int n) {
        Object object;
        Object object2 = object = this.mCounterLock;
        synchronized (object2) {
            this.mBufInCounter -= n;
            return this.mBufInCounter;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private void extractReadData(InBuffer var1) throws InterruptedException {
        var2_2 = 0;
        var3_3 = 0;
        var4_4 = 0;
        var5_5 = var1.getInputBuffer();
        var6_6 = var1.getLength();
        if (var6_6 <= 0) ** GOTO lbl28
        var7_7 = var6_6 / this.mMaxPacketSize;
        if (var6_6 % this.mMaxPacketSize > 0) {
            var8_8 = 1;
lbl10: // 2 sources:
            do {
                var9_9 = var7_7 + var8_8;
                var10_10 = 0;
lbl13: // 2 sources:
                if (var10_10 >= var9_9) {
                    var11_16 = false;
                    if (var2_2 != 0) {
                        var11_16 = true;
                        var16_17 = this.mMainSink.write(this.mBuffers, 0, var9_9);
                        if (var16_17 != (long)var2_2) {
                            Log.d((String)"extractReadData::", (String)("written != totalData, written= " + var16_17 + " totalData=" + var2_2));
                        }
                        super.incBufCount((int)var16_17);
                        this.mReadInLock.lock();
                        this.mReadInCon.signalAll();
                        this.mReadInLock.unlock();
                    }
lbl25: // 4 sources:
                    do {
                        var5_5.clear();
                        this.processEventChars(var11_16, var3_3, var4_4);
lbl28: // 2 sources:
                        return;
                        break;
                    } while (true);
                }
                break;
                break;
            } while (true);
        } else {
            var8_8 = 0;
            ** continue;
        }
        if (var10_10 != var9_9 - 1) ** GOTO lbl52
        var20_15 = var6_6;
        var5_5.limit(var20_15);
        var25_14 = var10_10 * this.mMaxPacketSize;
        var5_5.position(var25_14);
        var27_13 = var5_5.get();
        var3_3 = (short)(this.mDevice.mDeviceInfoNode.modemStatus ^ (short)(var27_13 & 240));
        this.mDevice.mDeviceInfoNode.modemStatus = (short)(var27_13 & 240);
        var28_12 = var5_5.get();
        this.mDevice.mDeviceInfoNode.lineStatus = (short)(var28_12 & 255);
        var22_11 = var25_14 + 2;
        if (!var5_5.hasRemaining()) ** GOTO lbl50
        var4_4 = (short)(30 & this.mDevice.mDeviceInfoNode.lineStatus);
lbl45: // 3 sources:
        do {
            var2_2 += var20_15 - var22_11;
            this.mBuffers[var10_10] = var5_5.slice();
            ++var10_10;
            ** GOTO lbl13
            break;
        } while (true);
lbl50: // 1 sources:
        var4_4 = 0;
        ** GOTO lbl45
lbl52: // 1 sources:
        var20_15 = (var10_10 + 1) * this.mMaxPacketSize;
        var5_5.limit(var20_15);
        var22_11 = 2 + var10_10 * this.mMaxPacketSize;
        var5_5.position(var22_11);
        ** while (true)
        catch (Exception var14_18) {
            Log.d((String)"extractReadData::", (String)"Write data to sink failed!!");
            var14_18.printStackTrace();
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int incBufCount(int n) {
        Object object;
        Object object2 = object = this.mCounterLock;
        synchronized (object2) {
            this.mBufInCounter = n + this.mBufInCounter;
            return this.mBufInCounter;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void resetBufCount() {
        Object object;
        Object object2 = object = this.mCounterLock;
        synchronized (object2) {
            this.mBufInCounter = 0;
            return;
        }
    }

    InBuffer acquireReadableBuffer(int n) throws InterruptedException {
        this.mReadable[n].acquire();
        return this.getBuffer(n);
    }

    InBuffer acquireWritableBuffer(int n) throws InterruptedException {
        this.mWritable[n].acquire();
        InBuffer inBuffer = this.getBuffer(n);
        if (inBuffer.acquire(n) == null) {
            inBuffer = null;
        }
        return inBuffer;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    void close() {
        int n = 0;
        do {
            if (n >= this.mNrBuf) break;
            try {
                this.releaseReadableBuffer(n);
            }
            catch (Exception var2_2) {
                var2_2.printStackTrace();
                Log.d((String)"ProcessInCtrl", (String)("Acquire read buffer " + n + " failed!"));
            }
            this.mInputBufs[n] = null;
            this.mReadable[n] = null;
            this.mWritable[n] = null;
            ++n;
        } while (true);
        int n2 = 0;
        do {
            if (n2 >= 256) {
                this.mWritable = null;
                this.mReadable = null;
                this.mInputBufs = null;
                this.mBuffers = null;
                this.mMainBuf = null;
                if (this.mSinkFull) {
                    this.mInFullLock.lock();
                    this.mFullCon.signalAll();
                    this.mInFullLock.unlock();
                }
                this.mReadInLock.lock();
                this.mReadInCon.signalAll();
                this.mReadInLock.unlock();
                this.mInFullLock = null;
                this.mFullCon = null;
                this.mCounterLock = null;
                this.mReadInLock = null;
                this.mReadInCon = null;
                this.mMainSink.close();
                this.mMainSink = null;
                this.mMainSource.close();
                this.mMainSource = null;
                this.mMainPipe = null;
            }
            this.mBuffers[n2] = null;
            ++n2;
        } while (true);
        catch (IOException iOException) {
            iOException.printStackTrace();
            Log.d((String)"ProcessInCtrl", (String)"Close mMainPipe failed!");
        }
        this.mDevice = null;
        this.mParams = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    InBuffer getBuffer(int n) {
        InBuffer[] arrinBuffer;
        InBuffer[] arrinBuffer2 = arrinBuffer = this.mInputBufs;
        synchronized (arrinBuffer2) {
            InBuffer inBuffer = null;
            if (n < 0) return inBuffer;
            int n2 = this.mNrBuf;
            inBuffer = null;
            if (n >= n2) return inBuffer;
            return this.mInputBufs[n];
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getBytesAvailable() {
        Object object;
        Object object2 = object = this.mCounterLock;
        synchronized (object2) {
            return this.mBufInCounter;
        }
    }

    public int getFreeSpace() {
        return -1 + (this.mParams.getMaxBufferSize() - this.getBytesAvailable());
    }

    D2xxManager.DriverParameters getParams() {
        return this.mParams;
    }

    boolean isSinkFull() {
        return this.mSinkFull;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void processBulkInData(InBuffer inBuffer) throws D2xxManager.D2xxException {
        try {
            int n = inBuffer.getLength();
            if (n < 2) {
                inBuffer.getInputBuffer().clear();
                return;
            }
            if (this.getFreeSpace() < n - 2) {
                Log.d((String)"ProcessBulkIn::", (String)" Buffer is full, waiting for read....");
                this.processEventChars(false, 0, 0);
                this.mInFullLock.lock();
                this.mSinkFull = true;
                this.mFullCon.await();
                this.mInFullLock.unlock();
                this.processBulkInData(inBuffer);
            }
            super.extractReadData(inBuffer);
            return;
        }
        catch (InterruptedException var4_3) {
            var4_3.printStackTrace();
            this.mInFullLock.unlock();
            Log.e((String)"ProcessInCtrl", (String)"Exception in Full await!");
            return;
        }
        catch (Exception var2_4) {
            var2_4.printStackTrace();
            Log.e((String)"ProcessInCtrl", (String)"Exception in ProcessBulkIN");
            throw new D2xxManager.D2xxException("Fatal error in BulkIn.");
        }
    }

    public int processEventChars(boolean bl, short s, short s2) throws InterruptedException {
        TFtEventNotify tFtEventNotify = new TFtEventNotify();
        tFtEventNotify.Mask = this.mDevice.mEventNotification.Mask;
        if (bl && (1 & tFtEventNotify.Mask) != 0 && (1 ^ this.mDevice.mEventMask) == 1) {
            FT_Device fT_Device = this.mDevice;
            fT_Device.mEventMask = 1 | fT_Device.mEventMask;
            Intent intent = new Intent("FT_EVENT_RXCHAR");
            intent.putExtra("message", "FT_EVENT_RXCHAR");
            LocalBroadcastManager.getInstance((Context)this.mDevice.mContext).sendBroadcast(intent);
        }
        if (s != 0 && (2 & tFtEventNotify.Mask) != 0 && (2 ^ this.mDevice.mEventMask) == 2) {
            FT_Device fT_Device = this.mDevice;
            fT_Device.mEventMask = 2 | fT_Device.mEventMask;
            Intent intent = new Intent("FT_EVENT_MODEM_STATUS");
            intent.putExtra("message", "FT_EVENT_MODEM_STATUS");
            LocalBroadcastManager.getInstance((Context)this.mDevice.mContext).sendBroadcast(intent);
        }
        if (s2 != 0 && (4 & tFtEventNotify.Mask) != 0 && (4 ^ this.mDevice.mEventMask) == 4) {
            FT_Device fT_Device = this.mDevice;
            fT_Device.mEventMask = 4 | fT_Device.mEventMask;
            Intent intent = new Intent("FT_EVENT_LINE_STATUS");
            intent.putExtra("message", "FT_EVENT_LINE_STATUS");
            LocalBroadcastManager.getInstance((Context)this.mDevice.mContext).sendBroadcast(intent);
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public int purgeINData() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.util.ConcurrentModificationException
        // java.util.LinkedList$ReverseLinkIterator.next(LinkedList.java:217)
        // org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.extractLabelledBlocks(Block.java:212)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement$LabelledBlockExtractor.transform(Op04StructuredStatement.java:485)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.transform(Op04StructuredStatement.java:639)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.insertLabelledBlocks(Op04StructuredStatement.java:649)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:816)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public int readBulkInData(byte[] arrby, int n, long l) {
        this.mParams.getMaxBufferSize();
        long l2 = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])arrby, (int)0, (int)n);
        if (l == 0) {
            l = this.mParams.getReadTimeout();
        }
        do {
            if (!this.mDevice.isOpen()) {
                return 0;
            }
            if (this.getBytesAvailable() >= n) {
                Pipe.SourceChannel sourceChannel;
                Pipe.SourceChannel sourceChannel2 = sourceChannel = this.mMainSource;
                // MONITORENTER : sourceChannel2
                try {
                    this.mMainSource.read(byteBuffer);
                    super.decBufCount(n);
                    // MONITOREXIT : sourceChannel2
                }
                catch (Exception var14_9) {
                    Log.d((String)"readBulkInData::", (String)"Cannot read data from Source!!");
                }
                if (!this.mSinkFull) return n;
                Log.i((String)"FTDI debug::", (String)" buffer is full , and also re start buffer");
                this.mInFullLock.lock();
                this.mFullCon.signalAll();
                this.mSinkFull = false;
                this.mInFullLock.unlock();
                return n;
            }
            try {
                this.mReadInLock.lock();
                this.mReadInCon.await(System.currentTimeMillis() - l2, TimeUnit.MILLISECONDS);
                this.mReadInLock.unlock();
                continue;
            }
            catch (InterruptedException var9_6) {
                var9_6.printStackTrace();
                Log.d((String)"readBulkInData::", (String)"Cannot wait to read data!!");
                this.mReadInLock.unlock();
            }
        } while (System.currentTimeMillis() - l2 < l);
        return 0;
    }

    public void releaseReadableBuffer(int n) throws InterruptedException {
        this.mReadable[n].release();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void releaseWritableBuffer(int n) throws InterruptedException {
        InBuffer[] arrinBuffer;
        InBuffer[] arrinBuffer2 = arrinBuffer = this.mInputBufs;
        synchronized (arrinBuffer2) {
            this.mInputBufs[n].release(n);
        }
        this.mWritable[n].release();
    }

    public void releaseWritableBuffers() throws InterruptedException {
        int n = this.mParams.getBufferNumber();
        int n2 = 0;
        while (n2 < n) {
            if (this.getBuffer(n2).acquired()) {
                this.releaseWritableBuffer(n2);
            }
            ++n2;
        }
        return;
    }
}

