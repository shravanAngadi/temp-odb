/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewTreeObserver_OnTouchModeChangeListenerImplementor
implements ViewTreeObserver.OnTouchModeChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onTouchModeChanged:(Z)V:GetOnTouchModeChanged_ZHandler:Android.Views.ViewTreeObserver/IOnTouchModeChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnTouchModeChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ViewTreeObserver_OnTouchModeChangeListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnTouchModeChangeListenerImplementor() throws Throwable {
        if (this.getClass() == ViewTreeObserver_OnTouchModeChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnTouchModeChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onTouchModeChanged(boolean var1);

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

    public void onTouchModeChanged(boolean bl) {
        super.n_onTouchModeChanged(bl);
    }
}

