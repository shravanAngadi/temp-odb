/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.Camera
 *  android.hardware.Camera$Face
 *  android.hardware.Camera$FaceDetectionListener
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

public class Camera_FaceDetectionListenerImplementor
implements Camera.FaceDetectionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onFaceDetection:([Landroid/hardware/Camera$Face;Landroid/hardware/Camera;)V:GetOnFaceDetection_arrayLandroid_hardware_Camera_Face_Landroid_hardware_Camera_Handler:Android.Hardware.Camera/IFaceDetectionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Hardware.Camera+IFaceDetectionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Camera_FaceDetectionListenerImplementor.class, __md_methods);
    }

    public Camera_FaceDetectionListenerImplementor() throws Throwable {
        if (this.getClass() == Camera_FaceDetectionListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Camera+IFaceDetectionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onFaceDetection(Camera.Face[] var1, Camera var2);

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

    public void onFaceDetection(Camera.Face[] arrface, Camera camera) {
        super.n_onFaceDetection(arrface, camera);
    }
}

