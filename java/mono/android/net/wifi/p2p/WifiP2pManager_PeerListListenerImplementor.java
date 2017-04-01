/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.wifi.p2p.WifiP2pDeviceList
 *  android.net.wifi.p2p.WifiP2pManager
 *  android.net.wifi.p2p.WifiP2pManager$PeerListListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiP2pManager_PeerListListenerImplementor
implements WifiP2pManager.PeerListListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPeersAvailable:(Landroid/net/wifi/p2p/WifiP2pDeviceList;)V:GetOnPeersAvailable_Landroid_net_wifi_p2p_WifiP2pDeviceList_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IPeerListListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IPeerListListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WifiP2pManager_PeerListListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_PeerListListenerImplementor() throws Throwable {
        if (this.getClass() == WifiP2pManager_PeerListListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IPeerListListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onPeersAvailable(WifiP2pDeviceList var1);

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

    public void onPeersAvailable(WifiP2pDeviceList wifiP2pDeviceList) {
        super.n_onPeersAvailable(wifiP2pDeviceList);
    }
}

