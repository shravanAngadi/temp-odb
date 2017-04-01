/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package com.ftdi.j2xx;

class FtVidPid {
    private int mProductId;
    private int mVendorId;

    FtVidPid() {
        this.mVendorId = 0;
        this.mProductId = 0;
    }

    FtVidPid(int n, int n2) {
        this.mVendorId = n;
        this.mProductId = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof FtVidPid)) {
            return false;
        }
        FtVidPid ftVidPid = (FtVidPid)object;
        if (this.mVendorId != ftVidPid.mVendorId) {
            return false;
        }
        if (this.mProductId == ftVidPid.mProductId) return true;
        return false;
    }

    public int getPid() {
        return this.mProductId;
    }

    public int getVid() {
        return this.mVendorId;
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public void setPid(int n) {
        this.mProductId = n;
    }

    public void setVid(int n) {
        this.mVendorId = n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Vendor: ");
        Object[] arrobject = new Object[]{this.mVendorId};
        StringBuilder stringBuilder2 = stringBuilder.append(String.format((String)"%04x", (Object[])arrobject)).append(", Product: ");
        Object[] arrobject2 = new Object[]{this.mProductId};
        return stringBuilder2.append(String.format((String)"%04x", (Object[])arrobject2)).toString();
    }
}

