/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.location.GpsStatus
 *  android.location.GpsStatus$Listener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.location;

import android.location.GpsStatus;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GpsStatus_ListenerImplementor
implements GpsStatus.Listener,
IGCUserPeer {
    public static final String __md_methods = "n_onGpsStatusChanged:(I)V:GetOnGpsStatusChanged_IHandler:Android.Locations.GpsStatus/IListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Locations.GpsStatus+IListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", GpsStatus_ListenerImplementor.class, __md_methods);
    }

    public GpsStatus_ListenerImplementor() throws Throwable {
        if (this.getClass() == GpsStatus_ListenerImplementor.class) {
            TypeManager.Activate("Android.Locations.GpsStatus+IListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onGpsStatusChanged(int var1);

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

    public void onGpsStatusChanged(int n) {
        super.n_onGpsStatusChanged(n);
    }
}

