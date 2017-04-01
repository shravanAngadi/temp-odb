/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.FragmentBreadCrumbs
 *  android.app.FragmentBreadCrumbs$OnBreadCrumbClickListener
 *  android.app.FragmentManager
 *  android.app.FragmentManager$BackStackEntry
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor
implements FragmentBreadCrumbs.OnBreadCrumbClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onBreadCrumbClick:(Landroid/app/FragmentManager$BackStackEntry;I)Z:GetOnBreadCrumbClick_Landroid_app_FragmentManager_BackStackEntry_IHandler:Android.App.FragmentBreadCrumbs/IOnBreadCrumbClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.FragmentBreadCrumbs+IOnBreadCrumbClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor.class, __md_methods);
    }

    public FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor() throws Throwable {
        if (this.getClass() == FragmentBreadCrumbs_OnBreadCrumbClickListenerImplementor.class) {
            TypeManager.Activate("Android.App.FragmentBreadCrumbs+IOnBreadCrumbClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onBreadCrumbClick(FragmentManager.BackStackEntry var1, int var2);

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

    public boolean onBreadCrumbClick(FragmentManager.BackStackEntry backStackEntry, int n) {
        return super.n_onBreadCrumbClick(backStackEntry, n);
    }
}

