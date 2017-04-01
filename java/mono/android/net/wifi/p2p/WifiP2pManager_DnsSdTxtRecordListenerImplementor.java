/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.wifi.p2p.WifiP2pDevice
 *  android.net.wifi.p2p.WifiP2pManager
 *  android.net.wifi.p2p.WifiP2pManager$DnsSdTxtRecordListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Map
 */
package mono.android.net.wifi.p2p;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.ArrayList;
import java.util.Map;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiP2pManager_DnsSdTxtRecordListenerImplementor
implements WifiP2pManager.DnsSdTxtRecordListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDnsSdTxtRecordAvailable:(Ljava/lang/String;Ljava/util/Map;Landroid/net/wifi/p2p/WifiP2pDevice;)V:GetOnDnsSdTxtRecordAvailable_Ljava_lang_String_Ljava_util_Map_Landroid_net_wifi_p2p_WifiP2pDevice_Handler:Android.Net.Wifi.P2p.WifiP2pManager/IDnsSdTxtRecordListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Wifi.P2p.WifiP2pManager+IDnsSdTxtRecordListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WifiP2pManager_DnsSdTxtRecordListenerImplementor.class, __md_methods);
    }

    public WifiP2pManager_DnsSdTxtRecordListenerImplementor() throws Throwable {
        if (this.getClass() == WifiP2pManager_DnsSdTxtRecordListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Wifi.P2p.WifiP2pManager+IDnsSdTxtRecordListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDnsSdTxtRecordAvailable(String var1, Map var2, WifiP2pDevice var3);

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

    public void onDnsSdTxtRecordAvailable(String string2, Map map, WifiP2pDevice wifiP2pDevice) {
        super.n_onDnsSdTxtRecordAvailable(string2, map, wifiP2pDevice);
    }
}

