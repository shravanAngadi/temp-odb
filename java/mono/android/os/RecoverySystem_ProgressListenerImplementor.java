/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.RecoverySystem
 *  android.os.RecoverySystem$ProgressListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.os;

import android.os.RecoverySystem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RecoverySystem_ProgressListenerImplementor
implements RecoverySystem.ProgressListener,
IGCUserPeer {
    public static final String __md_methods = "n_onProgress:(I)V:GetOnProgress_IHandler:Android.OS.RecoverySystem/IProgressListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.OS.RecoverySystem+IProgressListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RecoverySystem_ProgressListenerImplementor.class, __md_methods);
    }

    public RecoverySystem_ProgressListenerImplementor() throws Throwable {
        if (this.getClass() == RecoverySystem_ProgressListenerImplementor.class) {
            TypeManager.Activate("Android.OS.RecoverySystem+IProgressListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onProgress(int var1);

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

    public void onProgress(int n) {
        super.n_onProgress(n);
    }
}

