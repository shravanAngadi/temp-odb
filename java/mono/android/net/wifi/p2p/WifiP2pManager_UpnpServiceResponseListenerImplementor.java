/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.wifi.p2p.WifiP2pDevice
 *  android.net.wifi.p2p.WifiP2pManager
 *  android.net.wifi.p2p.WifiP2pManager$UpnpServiceResponseListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiP2pManager_UpnpServiceResponseListenerImplementor
implements WifiP2pManager.UpnpServiceResponseListener,
IGCUserPeer {
    public static final String __md_methods = "n_onUpnpServiceAvailable:(Ljava/util/List;Landroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnUpnpServiceAvailable_Ljava_util_List_Landroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IUpnpServiceResponseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IUpnpServiceResponseListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WifiP2pManager_UpnpServiceResponseListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_UpnpServiceResponseListenerImplementor() throws Throwable {
        if (this.getClass() == WifiP2pManager_UpnpServiceResponseListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IUpnpServiceResponseListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onUpnpServiceAvailable(List var1, WifiP2pDevice var2);

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

    public void onUpnpServiceAvailable(List list, WifiP2pDevice wifiP2pDevice) {
        super.n_onUpnpServiceAvailable(list, wifiP2pDevice);
    }
}

