/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.CalendarView
 *  android.widget.CalendarView$OnDateChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.CalendarView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class CalendarView_OnDateChangeListenerImplementor
implements CalendarView.OnDateChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSelectedDayChange:(Landroid/widget/CalendarView;III)V:GetOnSelectedDayChange_Landroid_widget_CalendarView_IIIHandler:Android.Widget.CalendarView/IOnDateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.CalendarView+IOnDateChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", CalendarView_OnDateChangeListenerImplementor.class, __md_methods);
    }

    public CalendarView_OnDateChangeListenerImplementor() throws Throwable {
        if (this.getClass() == CalendarView_OnDateChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.CalendarView+IOnDateChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onSelectedDayChange(CalendarView var1, int var2, int var3, int var4);

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

    public void onSelectedDayChange(CalendarView calendarView, int n, int n2, int n3) {
        super.n_onSelectedDayChange(calendarView, n, n2, n3);
    }
}

