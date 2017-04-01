/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewGroup_OnHierarchyChangeListenerImplementor
implements ViewGroup.OnHierarchyChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onChildViewAdded:(Landroid/view/View;Landroid/view/View;)V:GetOnChildViewAdded_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewGroup/IOnHierarchyChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onChildViewRemoved:(Landroid/view/View;Landroid/view/View;)V:GetOnChildViewRemoved_Landroid_view_View_Landroid_view_View_Handler:Android.Views.ViewGroup/IOnHierarchyChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.ViewGroup+IOnHierarchyChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ViewGroup_OnHierarchyChangeListenerImplementor.class, __md_methods);
    }

    public ViewGroup_OnHierarchyChangeListenerImplementor() throws Throwable {
        if (this.getClass() == ViewGroup_OnHierarchyChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewGroup+IOnHierarchyChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onChildViewAdded(View var1, View var2);

    private native void n_onChildViewRemoved(View var1, View var2);

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

    public void onChildViewAdded(View view, View view2) {
        super.n_onChildViewAdded(view, view2);
    }

    public void onChildViewRemoved(View view, View view2) {
        super.n_onChildViewRemoved(view, view2);
    }
}

