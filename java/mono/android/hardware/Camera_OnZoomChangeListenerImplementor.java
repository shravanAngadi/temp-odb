/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.hardware.Camera$OnZoomChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.hardware;

import android.hardware.Camera;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Camera_OnZoomChangeListenerImplementor
implements Camera.OnZoomChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onZoomChange:(IZLandroid/hardware/Camera;)V:GetOnZoomChange_IZLandroid_hardware_Camera_Handler:Android.Hardware.Camera/IOnZoomChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Hardware.Camera+IOnZoomChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Camera_OnZoomChangeListenerImplementor.class, __md_methods);
    }

    public Camera_OnZoomChangeListenerImplementor() throws Throwable {
        if (this.getClass() == Camera_OnZoomChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Camera+IOnZoomChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onZoomChange(int var1, boolean var2, Camera var3);

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

    public void onZoomChange(int n, boolean bl, Camera camera) {
        super.n_onZoomChange(n, bl, camera);
    }
}

