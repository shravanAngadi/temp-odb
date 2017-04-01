/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ExpandableListView_OnGroupClickListenerImplementor
implements ExpandableListView.OnGroupClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGroupClick:(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z:GetOnGroupClick_Landroid_widget_ExpandableListView_Landroid_view_View_IJHandler:Android.Widget.ExpandableListView/IOnGroupClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnGroupClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ExpandableListView_OnGroupClickListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnGroupClickListenerImplementor() throws Throwable {
        if (this.getClass() == ExpandableListView_OnGroupClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnGroupClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onGroupClick(ExpandableListView var1, View var2, int var3, long var4);

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

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int n, long l) {
        return super.n_onGroupClick(expandableListView, view, n, l);
    }
}

