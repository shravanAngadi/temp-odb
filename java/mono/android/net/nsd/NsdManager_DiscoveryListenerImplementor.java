/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$DiscoveryListener
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

public class NsdManager_DiscoveryListenerImplementor
implements NsdManager.DiscoveryListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDiscoveryStarted:(Ljava/lang/String;)V:GetOnDiscoveryStarted_Ljava_lang_String_Handler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onDiscoveryStopped:(Ljava/lang/String;)V:GetOnDiscoveryStopped_Ljava_lang_String_Handler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceFound:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceFound_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceLost:(Landroid/net/nsd/NsdServiceInfo;)V:GetOnServiceLost_Landroid_net_nsd_NsdServiceInfo_Handler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStartDiscoveryFailed:(Ljava/lang/String;I)V:GetOnStartDiscoveryFailed_Ljava_lang_String_IHandler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onStopDiscoveryFailed:(Ljava/lang/String;I)V:GetOnStopDiscoveryFailed_Ljava_lang_String_IHandler:Android.Net.Nsd.NsdManager/IDiscoveryListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Nsd.NsdManager+IDiscoveryListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", NsdManager_DiscoveryListenerImplementor.class, __md_methods);
    }

    public NsdManager_DiscoveryListenerImplementor() throws Throwable {
        if (this.getClass() == NsdManager_DiscoveryListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Nsd.NsdManager+IDiscoveryListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDiscoveryStarted(String var1);

    private native void n_onDiscoveryStopped(String var1);

    private native void n_onServiceFound(NsdServiceInfo var1);

    private native void n_onServiceLost(NsdServiceInfo var1);

    private native void n_onStartDiscoveryFailed(String var1, int var2);

    private native void n_onStopDiscoveryFailed(String var1, int var2);

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

    public void onDiscoveryStarted(String string2) {
        super.n_onDiscoveryStarted(string2);
    }

    public void onDiscoveryStopped(String string2) {
        super.n_onDiscoveryStopped(string2);
    }

    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        super.n_onServiceFound(nsdServiceInfo);
    }

    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        super.n_onServiceLost(nsdServiceInfo);
    }

    public void onStartDiscoveryFailed(String string2, int n) {
        super.n_onStartDiscoveryFailed(string2, n);
    }

    public void onStopDiscoveryFailed(String string2, int n) {
        super.n_onStopDiscoveryFailed(string2, n);
    }
}

