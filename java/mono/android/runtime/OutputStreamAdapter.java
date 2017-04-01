/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.runtime;

import java.io.OutputStream;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OutputStreamAdapter
extends OutputStream
implements IGCUserPeer {
    public static final String __md_methods = "n_close:()V:GetCloseHandler\nn_flush:()V:GetFlushHandler\nn_write:([B)V:GetWrite_arrayBHandler\nn_write:([BII)V:GetWrite_arrayBIIHandler\nn_write:(I)V:GetWrite_IHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Runtime.OutputStreamAdapter, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", OutputStreamAdapter.class, __md_methods);
    }

    public OutputStreamAdapter() throws Throwable {
        if (this.getClass() == OutputStreamAdapter.class) {
            TypeManager.Activate("Android.Runtime.OutputStreamAdapter, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_close();

    private native void n_flush();

    private native void n_write(int var1);

    private native void n_write(byte[] var1);

    private native void n_write(byte[] var1, int var2, int var3);

    public void close() {
        this.n_close();
    }

    public void flush() {
        this.n_flush();
    }

    @Override
    public void monodroidAddReference(Object object) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(object);
    }

    @Override
    public void monodroidClearReferences() {
        if (this.refList != null) {
            this.refList.clear();
        }
    }

    public void write(int n) {
        super.n_write(n);
    }

    public void write(byte[] arrby) {
        super.n_write(arrby);
    }

    public void write(byte[] arrby, int n, int n2) {
        super.n_write(arrby, n, n2);
    }
}

