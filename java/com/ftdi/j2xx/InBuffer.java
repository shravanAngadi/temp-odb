/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package com.ftdi.j2xx;

import java.nio.Buffer;
import java.nio.ByteBuffer;

class InBuffer {
    private boolean mAcquired;
    private int mBufId;
    private ByteBuffer mBuffer;
    private int mLength;

    public InBuffer(int n) {
        this.mBuffer = ByteBuffer.allocate((int)n);
        this.setLength(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ByteBuffer acquire(int n) {
        void var5_2 = this;
        synchronized (var5_2) {
            boolean bl = this.mAcquired;
            ByteBuffer byteBuffer = null;
            if (bl) return byteBuffer;
            this.mAcquired = true;
            this.mBufId = n;
            return this.mBuffer;
        }
    }

    boolean acquired() {
        InBuffer inBuffer = this;
        synchronized (inBuffer) {
            boolean bl = this.mAcquired;
            return bl;
        }
    }

    int getBufferId() {
        return this.mBufId;
    }

    ByteBuffer getInputBuffer() {
        return this.mBuffer;
    }

    int getLength() {
        return this.mLength;
    }

    void purge() {
        InBuffer inBuffer = this;
        synchronized (inBuffer) {
            this.mBuffer.clear();
            this.setLength(0);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean release(int n) {
        void var6_2 = this;
        synchronized (var6_2) {
            boolean bl = this.mAcquired;
            boolean bl2 = false;
            if (!bl) return bl2;
            int n2 = this.mBufId;
            bl2 = false;
            if (n != n2) return bl2;
            this.mAcquired = false;
            return true;
        }
    }

    void setBufferId(int n) {
        this.mBufId = n;
    }

    void setLength(int n) {
        this.mLength = n;
    }
}

