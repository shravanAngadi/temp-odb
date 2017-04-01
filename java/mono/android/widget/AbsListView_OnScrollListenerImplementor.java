/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.AbsListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AbsListView_OnScrollListenerImplementor
implements AbsListView.OnScrollListener,
IGCUserPeer {
    public static final String __md_methods = "n_onScroll:(Landroid/widget/AbsListView;III)V:GetOnScroll_Landroid_widget_AbsListView_IIIHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onScrollStateChanged:(Landroid/widget/AbsListView;I)V:GetOnScrollStateChanged_Landroid_widget_AbsListView_IHandler:Android.Widget.AbsListView/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.AbsListView+IOnScrollListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AbsListView_OnScrollListenerImplementor.class, __md_methods);
    }

    public AbsListView_OnScrollListenerImplementor() throws Throwable {
        if (this.getClass() == AbsListView_OnScrollListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AbsListView+IOnScrollListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onScroll(AbsListView var1, int var2, int var3, int var4);

    private native void n_onScrollStateChanged(AbsListView var1, int var2);

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

    public void onScroll(AbsListView absListView, int n, int n2, int n3) {
        super.n_onScroll(absListView, n, n2, n3);
    }

    public void onScrollStateChanged(AbsListView absListView, int n) {
        super.n_onScrollStateChanged(absListView, n);
    }
}

