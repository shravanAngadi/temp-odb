/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.wifi.p2p.WifiP2pInfo
 *  android.net.wifi.p2p.WifiP2pManager
 *  android.net.wifi.p2p.WifiP2pManager$ConnectionInfoListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiP2pManager_ConnectionInfoListenerImplementor
implements WifiP2pManager.ConnectionInfoListener,
IGCUserPeer {
    public static final String __md_methods = "n_onConnectionInfoAvailable:(Landroid/net/wifi/p2p/WifiP2pInfo;)V:GetOnConnectionInfoAvailable_Landroid_net_wifi_p2p_WifiP2pInfo_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IConnectionInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IConnectionInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WifiP2pManager_ConnectionInfoListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_ConnectionInfoListenerImplementor() throws Throwable {
        if (this.getClass() == WifiP2pManager_ConnectionInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IConnectionInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onConnectionInfoAvailable(WifiP2pInfo var1);

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

    public void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        super.n_onConnectionInfoAvailable(wifiP2pInfo);
    }
}

