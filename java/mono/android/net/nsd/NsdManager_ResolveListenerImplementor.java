/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$ResolveListener
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

public class NsdManager_ResolveListenerImplementor
implements NsdManager.ResolveListener,
IGCUserPeer {
    public static final String __md_methods = "n_onResolveFailed:(Landroid/net/nsd/NsdServiceInfo;I)V:GetOnResolveFailed_Landroid_net_nsd_NsdServiceInfo_IHandler:Android.Net.Nsd.NsdManager/IResolveListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceResolved:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceResolved_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IResolveListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Nsd.NsdManager+IResolveListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", NsdManager_ResolveListenerImplementor.class, __md_methods);
    }

    public NsdManager_ResolveListenerImplementor() throws Throwable {
        if (this.getClass() == NsdManager_ResolveListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Nsd.NsdManager+IResolveListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onResolveFailed(NsdServiceInfo var1, int var2);

    private native void n_onServiceResolved(NsdServiceInfo var1);

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

    public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int n) {
        super.n_onResolveFailed(nsdServiceInfo, n);
    }

    public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        super.n_onServiceResolved(nsdServiceInfo);
    }
}

