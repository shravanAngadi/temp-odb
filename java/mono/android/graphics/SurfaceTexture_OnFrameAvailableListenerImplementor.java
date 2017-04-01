/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.graphics;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SurfaceTexture_OnFrameAvailableListenerImplementor
implements SurfaceTexture.OnFrameAvailableListener,
IGCUserPeer {
    public static final String __md_methods = "n_onFrameAvailable:(Landroid/graphics/SurfaceTexture;)V:GetOnFrameAvailable_Landroid_graphics_SurfaceTexture_Handler:Android.Graphics.SurfaceTexture/IOnFrameAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Graphics.SurfaceTexture+IOnFrameAvailableListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SurfaceTexture_OnFrameAvailableListenerImplementor.class, __md_methods);
    }

    public SurfaceTexture_OnFrameAvailableListenerImplementor() throws Throwable {
        if (this.getClass() == SurfaceTexture_OnFrameAvailableListenerImplementor.class) {
            TypeManager.Activate("Android.Graphics.SurfaceTexture+IOnFrameAvailableListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onFrameAvailable(SurfaceTexture var1);

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

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        super.n_onFrameAvailable(surfaceTexture);
    }
}

