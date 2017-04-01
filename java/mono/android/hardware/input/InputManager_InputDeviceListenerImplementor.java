/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.input.InputManager
 *  android.hardware.input.InputManager$InputDeviceListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.hardware.input;

import android.hardware.input.InputManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class InputManager_InputDeviceListenerImplementor
implements InputManager.InputDeviceListener,
IGCUserPeer {
    public static final String __md_methods = "n_onInputDeviceAdded:(I)V:GetOnInputDeviceAdded_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onInputDeviceChanged:(I)V:GetOnInputDeviceChanged_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onInputDeviceRemoved:(I)V:GetOnInputDeviceRemoved_IHandler:Android.Hardware.Input.InputManager/IInputDeviceListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Hardware.Input.InputManager+IInputDeviceListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", InputManager_InputDeviceListenerImplementor.class, __md_methods);
    }

    public InputManager_InputDeviceListenerImplementor() throws Throwable {
        if (this.getClass() == InputManager_InputDeviceListenerImplementor.class) {
            TypeManager.Activate("Android.Hardware.Input.InputManager+IInputDeviceListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onInputDeviceAdded(int var1);

    private native void n_onInputDeviceChanged(int var1);

    private native void n_onInputDeviceRemoved(int var1);

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

    public void onInputDeviceAdded(int n) {
        super.n_onInputDeviceAdded(n);
    }

    public void onInputDeviceChanged(int n) {
        super.n_onInputDeviceChanged(n);
    }

    public void onInputDeviceRemoved(int n) {
        super.n_onInputDeviceRemoved(n);
    }
}

