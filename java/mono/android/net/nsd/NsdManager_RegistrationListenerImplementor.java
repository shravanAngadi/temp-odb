/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$RegistrationListener
 *  android.net.nsd.NsdServiceInfo
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.net.nsd;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class NsdManager_RegistrationListenerImplementor
implements NsdManager.RegistrationListener,
IGCUserPeer {
    public static final String __md_methods = "n_onRegistrationFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnRegistrationFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceRegistered:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceRegistered_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceUnregistered:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceUnregistered_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onUnregistrationFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnUnregistrationFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Nsd.NsdManager+IRegistrationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", NsdManager_RegistrationListenerImplementor.class, __md_methods);
    }

    public NsdManager_RegistrationListenerImplementor() throws Throwable {
        if (this.getClass() == NsdManager_RegistrationListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Nsd.NsdManager+IRegistrationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onRegistrationFailed(NsdServiceInfo var1, int var2);

    private native void n_onServiceRegistered(NsdServiceInfo var1);

    private native void n_onServiceUnregistered(NsdServiceInfo var1);

    private native void n_onUnregistrationFailed(NsdServiceInfo var1, int var2);

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

    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int n) {
        super.n_onRegistrationFailed(nsdServiceInfo, n);
    }

    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        super.n_onServiceRegistered(nsdServiceInfo);
    }

    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        super.n_onServiceUnregistered(nsdServiceInfo);
    }

    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int n) {
        super.n_onUnregistrationFailed(nsdServiceInfo, n);
    }
}

