/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.TimePickerDialog
 *  android.app.TimePickerDialog$OnTimeSetListener
 *  android.widget.TimePicker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TimePickerDialog_OnTimeSetListenerImplementor
implements TimePickerDialog.OnTimeSetListener,
IGCUserPeer {
    public static final String __md_methods = "n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.TimePickerDialog+IOnTimeSetListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TimePickerDialog_OnTimeSetListenerImplementor.class, __md_methods);
    }

    public TimePickerDialog_OnTimeSetListenerImplementor() throws Throwable {
        if (this.getClass() == TimePickerDialog_OnTimeSetListenerImplementor.class) {
            TypeManager.Activate("Android.App.TimePickerDialog+IOnTimeSetListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onTimeSet(TimePicker var1, int var2, int var3);

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

    public void onTimeSet(TimePicker timePicker, int n, int n2) {
        super.n_onTimeSet(timePicker, n, n2);
    }
}

