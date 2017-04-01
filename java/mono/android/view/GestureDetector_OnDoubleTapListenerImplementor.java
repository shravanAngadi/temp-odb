/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.MotionEvent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GestureDetector_OnDoubleTapListenerImplementor
implements GestureDetector.OnDoubleTapListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDoubleTapEvent:(Landroid/view/MotionEvent;)Z:GetOnDoubleTapEvent_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z:GetOnSingleTapConfirmed_Landroid_view_MotionEvent_Handler:Android.Views.GestureDetector/IOnDoubleTapListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.GestureDetector+IOnDoubleTapListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", GestureDetector_OnDoubleTapListenerImplementor.class, __md_methods);
    }

    public GestureDetector_OnDoubleTapListenerImplementor() throws Throwable {
        if (this.getClass() == GestureDetector_OnDoubleTapListenerImplementor.class) {
            TypeManager.Activate("Android.Views.GestureDetector+IOnDoubleTapListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onDoubleTap(MotionEvent var1);

    private native boolean n_onDoubleTapEvent(MotionEvent var1);

    private native boolean n_onSingleTapConfirmed(MotionEvent var1);

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

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return super.n_onDoubleTap(motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return super.n_onDoubleTapEvent(motionEvent);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return super.n_onSingleTapConfirmed(motionEvent);
    }
}

