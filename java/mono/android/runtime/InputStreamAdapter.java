/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.runtime;

import java.io.InputStream;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class InputStreamAdapter
extends InputStream
implements IGCUserPeer {
    public static final String __md_methods = "n_close:()V:GetCloseHandler\nn_read:()I:GetReadHandler\nn_read:([B)I:GetRead_arrayBHandler\nn_read:([BII)I:GetRead_arrayBIIHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Runtime.InputStreamAdapter, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", InputStreamAdapter.class, __md_methods);
    }

    public InputStreamAdapter() throws Throwable {
        if (this.getClass() == InputStreamAdapter.class) {
            TypeManager.Activate("Android.Runtime.InputStreamAdapter, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_close();

    private native int n_read();

    private native int n_read(byte[] var1);

    private native int n_read(byte[] var1, int var2, int var3);

    public void close() {
        this.n_close();
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

    public int read() {
        return this.n_read();
    }

    public int read(byte[] arrby) {
        return super.n_read(arrby);
    }

    public int read(byte[] arrby, int n, int n2) {
        return super.n_read(arrby, n, n2);
    }
}

