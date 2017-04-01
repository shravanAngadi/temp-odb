/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.ZoomButtonsController
 *  android.widget.ZoomButtonsController$OnZoomListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.ZoomButtonsController;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ZoomButtonsController_OnZoomListenerImplementor
implements ZoomButtonsController.OnZoomListener,
IGCUserPeer {
    public static final String __md_methods = "n_onVisibilityChanged:(Z)V:GetOnVisibilityChanged_ZHandler:Android.Widget.ZoomButtonsController/IOnZoomListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onZoom:(Z)V:GetOnZoom_ZHandler:Android.Widget.ZoomButtonsController/IOnZoomListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.ZoomButtonsController+IOnZoomListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ZoomButtonsController_OnZoomListenerImplementor.class, __md_methods);
    }

    public ZoomButtonsController_OnZoomListenerImplementor() throws Throwable {
        if (this.getClass() == ZoomButtonsController_OnZoomListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.ZoomButtonsController+IOnZoomListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onVisibilityChanged(boolean var1);

    private native void n_onZoom(boolean var1);

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

    public void onVisibilityChanged(boolean bl) {
        super.n_onVisibilityChanged(bl);
    }

    public void onZoom(boolean bl) {
        super.n_onZoom(bl);
    }
}

