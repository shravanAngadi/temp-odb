/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AbsListView$RecyclerListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.view.View;
import android.widget.AbsListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AbsListView_RecyclerListenerImplementor
implements AbsListView.RecyclerListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMovedToScrapHeap:(Landroid/view/View;)V:GetOnMovedToScrapHeap_Landroid_view_View_Handler:Android.Widget.AbsListView/IRecyclerListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.AbsListView+IRecyclerListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AbsListView_RecyclerListenerImplementor.class, __md_methods);
    }

    public AbsListView_RecyclerListenerImplementor() throws Throwable {
        if (this.getClass() == AbsListView_RecyclerListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AbsListView+IRecyclerListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onMovedToScrapHeap(View var1);

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

    public void onMovedToScrapHeap(View view) {
        super.n_onMovedToScrapHeap(view);
    }
}

