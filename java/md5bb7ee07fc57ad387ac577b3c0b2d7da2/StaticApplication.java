/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package md5bb7ee07fc57ad387ac577b3c0b2d7da2;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import mono.MonoPackageManager;
import mono.android.IGCUserPeer;

public class StaticApplication
extends Application
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:()V:GetOnCreateHandler\nn_onTerminate:()V:GetOnTerminateHandler\nn_onLowMemory:()V:GetOnLowMemoryHandler\n";
    private ArrayList refList;

    public StaticApplication() {
        MonoPackageManager.setContext((Context)this);
    }

    private native void n_onCreate();

    private native void n_onLowMemory();

    private native void n_onTerminate();

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

    public void onCreate() {
        this.n_onCreate();
    }

    public void onLowMemory() {
        this.n_onLowMemory();
    }

    public void onTerminate() {
        this.n_onTerminate();
    }
}

