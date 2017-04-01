/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package opentk_1_0.platform.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;
import opentk_1_0.GameViewBase;

public class AndroidGameView
extends GameViewBase
implements SurfaceHolder.Callback,
IGCUserPeer {
    public static final String __md_methods = "n_surfaceChanged:(Landroid/view/SurfaceHolder;III)V:GetSurfaceChanged_Landroid_view_SurfaceHolder_IIIHandler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_surfaceCreated:(Landroid/view/SurfaceHolder;)V:GetSurfaceCreated_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_surfaceDestroyed:(Landroid/view/SurfaceHolder;)V:GetSurfaceDestroyed_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("OpenTK.Platform.Android.AndroidGameView, OpenTK-1.0, Version=1.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AndroidGameView.class, __md_methods);
    }

    public AndroidGameView(Context context) throws Throwable {
        super(context);
        if (this.getClass() == AndroidGameView.class) {
            TypeManager.Activate("OpenTK.Platform.Android.AndroidGameView, OpenTK-1.0, Version=1.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public AndroidGameView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == AndroidGameView.class) {
            TypeManager.Activate("OpenTK.Platform.Android.AndroidGameView, OpenTK-1.0, Version=1.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public AndroidGameView(Context context, AttributeSet attributeSet, int n) throws Throwable {
        super(context, attributeSet, n);
        if (this.getClass() == AndroidGameView.class) {
            Object[] arrobject = new Object[]{context, attributeSet, n};
            TypeManager.Activate("OpenTK.Platform.Android.AndroidGameView, OpenTK-1.0, Version=1.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    private native void n_surfaceChanged(SurfaceHolder var1, int var2, int var3, int var4);

    private native void n_surfaceCreated(SurfaceHolder var1);

    private native void n_surfaceDestroyed(SurfaceHolder var1);

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

    public void surfaceChanged(SurfaceHolder surfaceHolder, int n, int n2, int n3) {
        super.n_surfaceChanged(surfaceHolder, n, n2, n3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.n_surfaceCreated(surfaceHolder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.n_surfaceDestroyed(surfaceHolder);
    }
}

