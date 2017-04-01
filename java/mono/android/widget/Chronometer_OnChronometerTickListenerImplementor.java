/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.Chronometer
 *  android.widget.Chronometer$OnChronometerTickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.Chronometer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Chronometer_OnChronometerTickListenerImplementor
implements Chronometer.OnChronometerTickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onChronometerTick:(Landroid/widget/Chronometer;)V:GetOnChronometerTick_Landroid_widget_Chronometer_Handler:Android.Widget.Chronometer/IOnChronometerTickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.Chronometer+IOnChronometerTickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Chronometer_OnChronometerTickListenerImplementor.class, __md_methods);
    }

    public Chronometer_OnChronometerTickListenerImplementor() throws Throwable {
        if (this.getClass() == Chronometer_OnChronometerTickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.Chronometer+IOnChronometerTickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onChronometerTick(Chronometer var1);

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

    public void onChronometerTick(Chronometer chronometer) {
        super.n_onChronometerTick(chronometer);
    }
}

