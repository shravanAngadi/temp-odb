/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnGenericMotionListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class View_OnGenericMotionListenerImplementor
implements View.OnGenericMotionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGenericMotion:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnGenericMotion_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnGenericMotionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.View+IOnGenericMotionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", View_OnGenericMotionListenerImplementor.class, __md_methods);
    }

    public View_OnGenericMotionListenerImplementor() throws Throwable {
        if (this.getClass() == View_OnGenericMotionListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnGenericMotionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onGenericMotion(View var1, MotionEvent var2);

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

    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        return super.n_onGenericMotion(view, motionEvent);
    }
}

