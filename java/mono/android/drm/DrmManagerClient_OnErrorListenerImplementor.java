/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.drm.DrmErrorEvent
 *  android.drm.DrmManagerClient
 *  android.drm.DrmManagerClient$OnErrorListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.drm;

import android.drm.DrmErrorEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DrmManagerClient_OnErrorListenerImplementor
implements DrmManagerClient.OnErrorListener,
IGCUserPeer {
    public static final String __md_methods = "n_onError:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmErrorEvent;)V:GetOnError_Landroid_drm_DrmManagerClient_Landroid_drm_DrmErrorEvent_Handler:Android.Drm.DrmManagerClient/IOnErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DrmManagerClient_OnErrorListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnErrorListenerImplementor() throws Throwable {
        if (this.getClass() == DrmManagerClient_OnErrorListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onError(DrmManagerClient var1, DrmErrorEvent var2);

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

    public void onError(DrmManagerClient drmManagerClient, DrmErrorEvent drmErrorEvent) {
        super.n_onError(drmManagerClient, drmErrorEvent);
    }
}

