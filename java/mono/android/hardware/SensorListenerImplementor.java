/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.SensorListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.hardware;

import android.hardware.SensorListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SensorListenerImplementor
implements SensorListener,
IGCUserPeer {
    public static final String __md_methods = "n_onAccuracyChanged:(II)V:GetOnAccuracyChanged_IIHandler:Android.Hardware.ISensorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSensorChanged:(I[F)V:GetOnSensorChanged_IarrayFHandler:Android.Hardware.ISensorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Hardware.ISensorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SensorListenerImplementor.class, __md_methods);
    }

    public SensorListenerImplementor() throws Throwable {
        if (this.getClass() == SensorListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.ISensorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onAccuracyChanged(int var1, int var2);

    private native void n_onSensorChanged(int var1, float[] var2);

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

    public void onAccuracyChanged(int n, int n2) {
        super.n_onAccuracyChanged(n, n2);
    }

    public void onSensorChanged(int n, float[] arrf) {
        super.n_onSensorChanged(n, arrf);
    }
}

