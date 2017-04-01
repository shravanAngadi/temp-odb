/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  android.os.CancellationSignal$OnCancelListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.os;

import android.os.CancellationSignal;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class CancellationSignal_OnCancelListenerImplementor
implements CancellationSignal.OnCancelListener,
IGCUserPeer {
    public static final String __md_methods = "n_onCancel:()V:GetOnCancelHandler:Android.OS.CancellationSignal/IOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", CancellationSignal_OnCancelListenerImplementor.class, __md_methods);
    }

    public CancellationSignal_OnCancelListenerImplementor() throws Throwable {
        if (this.getClass() == CancellationSignal_OnCancelListenerImplementor.class) {
            TypeManager.Activate("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onCancel();

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

    public void onCancel() {
        this.n_onCancel();
    }
}

