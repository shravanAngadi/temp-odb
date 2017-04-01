/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothProfile
 *  android.bluetooth.BluetoothProfile$ServiceListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.bluetooth;

import android.bluetooth.BluetoothProfile;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class BluetoothProfile_ServiceListenerImplementor
implements BluetoothProfile.ServiceListener,
IGCUserPeer {
    public static final String __md_methods = "n_onServiceConnected:(ILandroid/bluetooth/BluetoothProfile;)V:GetOnServiceConnected_ILandroid_bluetooth_BluetoothProfile_Handler:Android.Bluetooth.IBluetoothProfileServiceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onServiceDisconnected:(I)V:GetOnServiceDisconnected_IHandler:Android.Bluetooth.IBluetoothProfileServiceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Bluetooth.IBluetoothProfileServiceListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", BluetoothProfile_ServiceListenerImplementor.class, __md_methods);
    }

    public BluetoothProfile_ServiceListenerImplementor() throws Throwable {
        if (this.getClass() == BluetoothProfile_ServiceListenerImplementor.class) {
            TypeManager.Activate("Android.Bluetooth.IBluetoothProfileServiceListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onServiceConnected(int var1, BluetoothProfile var2);

    private native void n_onServiceDisconnected(int var1);

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

    public void onServiceConnected(int n, BluetoothProfile bluetoothProfile) {
        super.n_onServiceConnected(n, bluetoothProfile);
    }

    public void onServiceDisconnected(int n) {
        super.n_onServiceDisconnected(n);
    }
}

