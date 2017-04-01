/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TextureView_SurfaceTextureListenerImplementor
implements TextureView.SurfaceTextureListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSurfaceTextureAvailable:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureAvailable_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureDestroyed:(Landroid/graphics/SurfaceTexture;)Z:GetOnSurfaceTextureDestroyed_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureSizeChanged:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureSizeChanged_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSurfaceTextureUpdated:(Landroid/graphics/SurfaceTexture;)V:GetOnSurfaceTextureUpdated_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.TextureView+ISurfaceTextureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TextureView_SurfaceTextureListenerImplementor.class, __md_methods);
    }

    public TextureView_SurfaceTextureListenerImplementor() throws Throwable {
        if (this.getClass() == TextureView_SurfaceTextureListenerImplementor.class) {
            TypeManager.Activate("Android.Views.TextureView+ISurfaceTextureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onSurfaceTextureAvailable(SurfaceTexture var1, int var2, int var3);

    private native boolean n_onSurfaceTextureDestroyed(SurfaceTexture var1);

    private native void n_onSurfaceTextureSizeChanged(SurfaceTexture var1, int var2, int var3);

    private native void n_onSurfaceTextureUpdated(SurfaceTexture var1);

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

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n, int n2) {
        super.n_onSurfaceTextureAvailable(surfaceTexture, n, n2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return super.n_onSurfaceTextureDestroyed(surfaceTexture);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n, int n2) {
        super.n_onSurfaceTextureSizeChanged(surfaceTexture, n, n2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        super.n_onSurfaceTextureUpdated(surfaceTexture);
    }
}

