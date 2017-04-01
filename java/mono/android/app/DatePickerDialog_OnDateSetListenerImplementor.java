/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.widget.DatePicker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DatePickerDialog_OnDateSetListenerImplementor
implements DatePickerDialog.OnDateSetListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDateSet:(Landroid/widget/DatePicker;III)V:GetOnDateSet_Landroid_widget_DatePicker_IIIHandler:Android.App.DatePickerDialog/IOnDateSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.DatePickerDialog+IOnDateSetListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DatePickerDialog_OnDateSetListenerImplementor.class, __md_methods);
    }

    public DatePickerDialog_OnDateSetListenerImplementor() throws Throwable {
        if (this.getClass() == DatePickerDialog_OnDateSetListenerImplementor.class) {
            TypeManager.Activate("Android.App.DatePickerDialog+IOnDateSetListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDateSet(DatePicker var1, int var2, int var3, int var4);

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

    public void onDateSet(DatePicker datePicker, int n, int n2, int n3) {
        super.n_onDateSet(datePicker, n, n2, n3);
    }
}

