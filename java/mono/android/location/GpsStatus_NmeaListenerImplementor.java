/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.location.GpsStatus
 *  android.location.GpsStatus$NmeaListener
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

public class GpsStatus_NmeaListenerImplementor
implements GpsStatus.NmeaListener,
IGCUserPeer {
    public static final String __md_methods = "n_onNmeaReceived:(JLjava/lang/String;)V:GetOnNmeaReceived_JLjava_lang_String_Handler:Android.Locations.GpsStatus/INmeaListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Locations.GpsStatus+INmeaListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", GpsStatus_NmeaListenerImplementor.class, __md_methods);
    }

    public GpsStatus_NmeaListenerImplementor() throws Throwable {
        if (this.getClass() == GpsStatus_NmeaListenerImplementor.class) {
            TypeManager.Activate("Android.Locations.GpsStatus+INmeaListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onNmeaReceived(long var1, String var3);

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

    public void onNmeaReceived(long l, String string2) {
        super.n_onNmeaReceived(l, string2);
    }
}

