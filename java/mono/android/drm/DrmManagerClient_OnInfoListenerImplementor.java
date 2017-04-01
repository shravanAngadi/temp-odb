/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.drm.DrmInfoEvent
 *  android.drm.DrmManagerClient
 *  android.drm.DrmManagerClient$OnInfoListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.drm;

import android.drm.DrmInfoEvent;
import android.drm.DrmManagerClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DrmManagerClient_OnInfoListenerImplementor
implements DrmManagerClient.OnInfoListener,
IGCUserPeer {
    public static final String __md_methods = "n_onInfo:(Landroid/drm/DrmManagerClient;Landroid/drm/DrmInfoEvent;)V:GetOnInfo_Landroid_drm_DrmManagerClient_Landroid_drm_DrmInfoEvent_Handler:Android.Drm.DrmManagerClient/IOnInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Drm.DrmManagerClient+IOnInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DrmManagerClient_OnInfoListenerImplementor.class, __md_methods);
    }

    public DrmManagerClient_OnInfoListenerImplementor() throws Throwable {
        if (this.getClass() == DrmManagerClient_OnInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Drm.DrmManagerClient+IOnInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onInfo(DrmManagerClient var1, DrmInfoEvent var2);

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

    public void onInfo(DrmManagerClient drmManagerClient, DrmInfoEvent drmInfoEvent) {
        super.n_onInfo(drmManagerClient, drmInfoEvent);
    }
}

