/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.TimePicker
 *  android.widget.TimePicker$OnTimeChangedListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.TimePicker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TimePicker_OnTimeChangedListenerImplementor
implements TimePicker.OnTimeChangedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onTimeChanged:(Landroid/widget/TimePicker;II)V:GetOnTimeChanged_Landroid_widget_TimePicker_IIHandler:Android.Widget.TimePicker/IOnTimeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.TimePicker+IOnTimeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TimePicker_OnTimeChangedListenerImplementor.class, __md_methods);
    }

    public TimePicker_OnTimeChangedListenerImplementor() throws Throwable {
        if (this.getClass() == TimePicker_OnTimeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.TimePicker+IOnTimeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onTimeChanged(TimePicker var1, int var2, int var3);

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

    public void onTimeChanged(TimePicker timePicker, int n, int n2) {
        super.n_onTimeChanged(timePicker, n, n2);
    }
}

