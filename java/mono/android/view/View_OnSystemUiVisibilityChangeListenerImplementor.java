/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnSystemUiVisibilityChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class View_OnSystemUiVisibilityChangeListenerImplementor
implements View.OnSystemUiVisibilityChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSystemUiVisibilityChange:(I)V:GetOnSystemUiVisibilityChange_IHandler:Android.Views.View/IOnSystemUiVisibilityChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.View+IOnSystemUiVisibilityChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", View_OnSystemUiVisibilityChangeListenerImplementor.class, __md_methods);
    }

    public View_OnSystemUiVisibilityChangeListenerImplementor() throws Throwable {
        if (this.getClass() == View_OnSystemUiVisibilityChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnSystemUiVisibilityChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onSystemUiVisibilityChange(int var1);

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

    public void onSystemUiVisibilityChange(int n) {
        super.n_onSystemUiVisibilityChange(n);
    }
}

