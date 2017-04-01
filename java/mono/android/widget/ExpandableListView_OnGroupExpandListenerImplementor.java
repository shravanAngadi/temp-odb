/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnGroupExpandListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.ExpandableListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ExpandableListView_OnGroupExpandListenerImplementor
implements ExpandableListView.OnGroupExpandListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGroupExpand:(I)V:GetOnGroupExpand_IHandler:Android.Widget.ExpandableListView/IOnGroupExpandListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.ExpandableListView+IOnGroupExpandListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ExpandableListView_OnGroupExpandListenerImplementor.class, __md_methods);
    }

    public ExpandableListView_OnGroupExpandListenerImplementor() throws Throwable {
        if (this.getClass() == ExpandableListView_OnGroupExpandListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ExpandableListView+IOnGroupExpandListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onGroupExpand(int var1);

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

    public void onGroupExpand(int n) {
        super.n_onGroupExpand(n);
    }
}

