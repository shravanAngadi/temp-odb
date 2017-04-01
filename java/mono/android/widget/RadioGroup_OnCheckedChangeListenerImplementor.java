/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.RadioGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RadioGroup_OnCheckedChangeListenerImplementor
implements RadioGroup.OnCheckedChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onCheckedChanged:(Landroid/widget/RadioGroup;I)V:GetOnCheckedChanged_Landroid_widget_RadioGroup_IHandler:Android.Widget.RadioGroup/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.RadioGroup+IOnCheckedChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RadioGroup_OnCheckedChangeListenerImplementor.class, __md_methods);
    }

    public RadioGroup_OnCheckedChangeListenerImplementor() throws Throwable {
        if (this.getClass() == RadioGroup_OnCheckedChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.RadioGroup+IOnCheckedChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onCheckedChanged(RadioGroup var1, int var2);

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

    public void onCheckedChanged(RadioGroup radioGroup, int n) {
        super.n_onCheckedChanged(radioGroup, n);
    }
}

