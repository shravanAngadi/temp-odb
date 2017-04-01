/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.CompoundButton;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class CompoundButton_OnCheckedChangeListenerImplementor
implements CompoundButton.OnCheckedChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.CompoundButton+IOnCheckedChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", CompoundButton_OnCheckedChangeListenerImplementor.class, __md_methods);
    }

    public CompoundButton_OnCheckedChangeListenerImplementor() throws Throwable {
        if (this.getClass() == CompoundButton_OnCheckedChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.CompoundButton+IOnCheckedChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onCheckedChanged(CompoundButton var1, boolean var2);

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

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        super.n_onCheckedChanged(compoundButton, bl);
    }
}

