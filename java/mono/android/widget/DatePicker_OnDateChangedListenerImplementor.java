/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.DatePicker
 *  android.widget.DatePicker$OnDateChangedListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.DatePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DatePicker_OnDateChangedListenerImplementor
implements DatePicker.OnDateChangedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDateChanged:(Landroid/widget/DatePicker;III)V:GetOnDateChanged_Landroid_widget_DatePicker_IIIHandler:Android.Widget.DatePicker/IOnDateChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.DatePicker+IOnDateChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DatePicker_OnDateChangedListenerImplementor.class, __md_methods);
    }

    public DatePicker_OnDateChangedListenerImplementor() throws Throwable {
        if (this.getClass() == DatePicker_OnDateChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.DatePicker+IOnDateChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDateChanged(DatePicker var1, int var2, int var3, int var4);

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

    public void onDateChanged(DatePicker datePicker, int n, int n2, int n3) {
        super.n_onDateChanged(datePicker, n, n2, n3);
    }
}

