/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.SearchManager
 *  android.app.SearchManager$OnDismissListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.SearchManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SearchManager_OnDismissListenerImplementor
implements SearchManager.OnDismissListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDismiss:()V:GetOnDismissHandler:Android.App.SearchManager/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.SearchManager+IOnDismissListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SearchManager_OnDismissListenerImplementor.class, __md_methods);
    }

    public SearchManager_OnDismissListenerImplementor() throws Throwable {
        if (this.getClass() == SearchManager_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.App.SearchManager+IOnDismissListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDismiss();

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

    public void onDismiss() {
        this.n_onDismiss();
    }
}

