/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.AutoCompleteTextView
 *  android.widget.AutoCompleteTextView$OnDismissListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.AutoCompleteTextView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AutoCompleteTextView_OnDismissListenerImplementor
implements AutoCompleteTextView.OnDismissListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDismiss:()V:GetOnDismissHandler:Android.Widget.AutoCompleteTextView/IOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.AutoCompleteTextView+IOnDismissListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AutoCompleteTextView_OnDismissListenerImplementor.class, __md_methods);
    }

    public AutoCompleteTextView_OnDismissListenerImplementor() throws Throwable {
        if (this.getClass() == AutoCompleteTextView_OnDismissListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AutoCompleteTextView+IOnDismissListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDismiss();

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

    public void onDismiss() {
        this.n_onDismiss();
    }
}

