/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.drm.DrmEvent
 *  android.drm.DrmManagerClient
 *  android.drm.DrmManagerClient$OnEventListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.drm;

import android.drm.DrmEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DrmManagerClient_OnEventListenerImplementor
implements DrmManagerClient.OnEventListener,
IGCUserPeer {
    public static final String __md_methods = "n_onEvent:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmEvent;)V:GetOnEvent_Landroid_drm_DrmManagerClient_Landroid_drm_DrmEvent_Handler:Android.Drm.DrmManagerClient/IOnEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DrmManagerClient_OnEventListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnEventListenerImplementor() throws Throwable {
        if (this.getClass() == DrmManagerClient_OnEventListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onEvent(DrmManagerClient var1, DrmEvent var2);

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

    public void onEvent(DrmManagerClient drmManagerClient, DrmEvent drmEvent) {
        super.n_onEvent(drmManagerClient, drmEvent);
    }
}

