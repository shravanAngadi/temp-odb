/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  android.widget.SearchView$OnQueryTextListener
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

public class SearchView_OnQueryTextListenerImplementor
implements SearchView.OnQueryTextListener,
IGCUserPeer {
    public static final String __md_methods = "n_onQueryTextChange:(Ljava/lang/String;)Z:GetOnQueryTextChange_Ljava_lang_String_Handler:Android.Widget.SearchView/IOnQueryTextListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onQueryTextSubmit:(Ljava/lang/String;)Z:GetOnQueryTextSubmit_Ljava_lang_String_Handler:Android.Widget.SearchView/IOnQueryTextListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.SearchView+IOnQueryTextListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SearchView_OnQueryTextListenerImplementor.class, __md_methods);
    }

    public SearchView_OnQueryTextListenerImplementor() throws Throwable {
        if (this.getClass() == SearchView_OnQueryTextListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SearchView+IOnQueryTextListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onQueryTextChange(String var1);

    private native boolean n_onQueryTextSubmit(String var1);

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

    public boolean onQueryTextChange(String string2) {
        return super.n_onQueryTextChange(string2);
    }

    public boolean onQueryTextSubmit(String string2) {
        return super.n_onQueryTextSubmit(string2);
    }
}

