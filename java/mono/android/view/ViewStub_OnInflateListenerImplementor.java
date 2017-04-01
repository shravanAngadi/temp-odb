/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewStub
 *  android.view.ViewStub$OnInflateListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.View;
import android.view.ViewStub;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewStub_OnInflateListenerImplementor
implements ViewStub.OnInflateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onInflate:(Landroid/view/ViewStub;Landroid/view/View;)V:GetOnInflate_Landroid_view_ViewStub_Landroid_view_View_Handler:Android.Views.ViewStub/IOnInflateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.ViewStub+IOnInflateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ViewStub_OnInflateListenerImplementor.class, __md_methods);
    }

    public ViewStub_OnInflateListenerImplementor() throws Throwable {
        if (this.getClass() == ViewStub_OnInflateListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewStub+IOnInflateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onInflate(ViewStub var1, View var2);

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

    public void onInflate(ViewStub viewStub, View view) {
        super.n_onInflate(viewStub, view);
    }
}

