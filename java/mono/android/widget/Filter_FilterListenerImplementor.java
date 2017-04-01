/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.Filter
 *  android.widget.Filter$FilterListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.Filter;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Filter_FilterListenerImplementor
implements Filter.FilterListener,
IGCUserPeer {
    public static final String __md_methods = "n_onFilterComplete:(I)V:GetOnFilterComplete_IHandler:Android.Widget.Filter/IFilterListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.Filter+IFilterListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Filter_FilterListenerImplementor.class, __md_methods);
    }

    public Filter_FilterListenerImplementor() throws Throwable {
        if (this.getClass() == Filter_FilterListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.Filter+IFilterListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onFilterComplete(int var1);

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

    public void onFilterComplete(int n) {
        super.n_onFilterComplete(n);
    }
}

