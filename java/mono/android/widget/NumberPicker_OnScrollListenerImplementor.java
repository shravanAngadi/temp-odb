/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.NumberPicker
 *  android.widget.NumberPicker$OnScrollListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.NumberPicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class NumberPicker_OnScrollListenerImplementor
implements NumberPicker.OnScrollListener,
IGCUserPeer {
    public static final String __md_methods = "n_onScrollStateChange:(Landroid/widget/NumberPicker;I)V:GetOnScrollStateChange_Landroid_widget_NumberPicker_IHandler:Android.Widget.NumberPicker/IOnScrollListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.NumberPicker+IOnScrollListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", NumberPicker_OnScrollListenerImplementor.class, __md_methods);
    }

    public NumberPicker_OnScrollListenerImplementor() throws Throwable {
        if (this.getClass() == NumberPicker_OnScrollListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.NumberPicker+IOnScrollListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onScrollStateChange(NumberPicker var1, int var2);

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

    public void onScrollStateChange(NumberPicker numberPicker, int n) {
        super.n_onScrollStateChange(numberPicker, n);
    }
}

