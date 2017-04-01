/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.hardware.display;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DisplayManager_DisplayListenerImplementor
implements DisplayManager.DisplayListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDisplayAdded:(I)V:GetOnDisplayAdded_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDisplayChanged:(I)V:GetOnDisplayChanged_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDisplayRemoved:(I)V:GetOnDisplayRemoved_IHandler:Android.Hardware.Display.DisplayManager/IDisplayListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Hardware.Display.DisplayManager+IDisplayListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DisplayManager_DisplayListenerImplementor.class, __md_methods);
    }

    public DisplayManager_DisplayListenerImplementor() throws Throwable {
        if (this.getClass() == DisplayManager_DisplayListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Display.DisplayManager+IDisplayListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDisplayAdded(int var1);

    private native void n_onDisplayChanged(int var1);

    private native void n_onDisplayRemoved(int var1);

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

    public void onDisplayAdded(int n) {
        super.n_onDisplayAdded(n);
    }

    public void onDisplayChanged(int n) {
        super.n_onDisplayChanged(n);
    }

    public void onDisplayRemoved(int n) {
        super.n_onDisplayRemoved(n);
    }
}

