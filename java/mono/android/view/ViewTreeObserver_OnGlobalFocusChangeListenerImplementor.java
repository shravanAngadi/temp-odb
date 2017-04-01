/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewTreeObserver_OnGlobalFocusChangeListenerImplementor
implements ViewTreeObserver.OnGlobalFocusChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGlobalFocusChanged:(Landroid/view/View;Landroid/view/View;)V:GetOnGlobalFocusChanged_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewTreeObserver/IOnGlobalFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnGlobalFocusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ViewTreeObserver_OnGlobalFocusChangeListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnGlobalFocusChangeListenerImplementor() throws Throwable {
        if (this.getClass() == ViewTreeObserver_OnGlobalFocusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnGlobalFocusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onGlobalFocusChanged(View var1, View var2);

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

    public void onGlobalFocusChanged(View view, View view2) {
        super.n_onGlobalFocusChanged(view, view2);
    }
}

