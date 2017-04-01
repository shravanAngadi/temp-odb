/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  android.widget.SearchView$OnSuggestionListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.SearchView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SearchView_OnSuggestionListenerImplementor
implements SearchView.OnSuggestionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSuggestionClick:(I)Z:GetOnSuggestionClick_IHandler:Android.Widget.SearchView/IOnSuggestionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSuggestionSelect:(I)Z:GetOnSuggestionSelect_IHandler:Android.Widget.SearchView/IOnSuggestionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.SearchView+IOnSuggestionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SearchView_OnSuggestionListenerImplementor.class, __md_methods);
    }

    public SearchView_OnSuggestionListenerImplementor() throws Throwable {
        if (this.getClass() == SearchView_OnSuggestionListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SearchView+IOnSuggestionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onSuggestionClick(int var1);

    private native boolean n_onSuggestionSelect(int var1);

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

    public boolean onSuggestionClick(int n) {
        return super.n_onSuggestionClick(n);
    }

    public boolean onSuggestionSelect(int n) {
        return super.n_onSuggestionSelect(n);
    }
}

