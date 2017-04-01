/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.wifi.p2p.WifiP2pDevice
 *  android.net.wifi.p2p.WifiP2pManager
 *  android.net.wifi.p2p.WifiP2pManager$ServiceResponseListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiP2pManager_ServiceResponseListenerImplementor
implements WifiP2pManager.ServiceResponseListener,
IGCUserPeer {
    public static final String __md_methods = "n_onServiceAvailable:(I[BLandroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnServiceAvailable_IarrayBLandroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IServiceResponseListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IServiceResponseListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WifiP2pManager_ServiceResponseListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_ServiceResponseListenerImplementor() throws Throwable {
        if (this.getClass() == WifiP2pManager_ServiceResponseListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IServiceResponseListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onServiceAvailable(int var1, byte[] var2, WifiP2pDevice var3);

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

    public void onServiceAvailable(int n, byte[] arrby, WifiP2pDevice wifiP2pDevice) {
        super.n_onServiceAvailable(n, arrby, wifiP2pDevice);
    }
}

