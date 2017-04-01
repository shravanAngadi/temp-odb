/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnWindowAttachListener
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

public class ViewTreeObserver_OnWindowAttachListenerImplementor
implements ViewTreeObserver.OnWindowAttachListener,
IGCUserPeer {
    public static final String __md_methods = "n_onWindowAttached:()V:GetOnWindowAttachedHandler:Android.Views.ViewTreeObserver/IOnWindowAttachListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onWindowDetached:()V:GetOnWindowDetachedHandler:Android.Views.ViewTreeObserver/IOnWindowAttachListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.ViewTreeObserver+IOnWindowAttachListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ViewTreeObserver_OnWindowAttachListenerImplementor.class, __md_methods);
    }

    public ViewTreeObserver_OnWindowAttachListenerImplementor() throws Throwable {
        if (this.getClass() == ViewTreeObserver_OnWindowAttachListenerImplementor.class) {
            TypeManager.Activate("Android.Views.ViewTreeObserver+IOnWindowAttachListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onWindowAttached();

    private native void n_onWindowDetached();

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

    public void onWindowAttached() {
        this.n_onWindowAttached();
    }

    public void onWindowDetached() {
        this.n_onWindowDetached();
    }
}

