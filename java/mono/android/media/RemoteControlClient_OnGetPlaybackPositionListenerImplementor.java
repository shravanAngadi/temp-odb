/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.RemoteControlClient
 *  android.media.RemoteControlClient$OnGetPlaybackPositionListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.RemoteControlClient;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RemoteControlClient_OnGetPlaybackPositionListenerImplementor
implements RemoteControlClient.OnGetPlaybackPositionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGetPlaybackPosition:()J:GetOnGetPlaybackPositionHandler:Android.Media.RemoteControlClient/IOnGetPlaybackPositionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.RemoteControlClient+IOnGetPlaybackPositionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RemoteControlClient_OnGetPlaybackPositionListenerImplementor.class, __md_methods);
    }

    public RemoteControlClient_OnGetPlaybackPositionListenerImplementor() throws Throwable {
        if (this.getClass() == RemoteControlClient_OnGetPlaybackPositionListenerImplementor.class) {
            TypeManager.Activate("Android.Media.RemoteControlClient+IOnGetPlaybackPositionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native long n_onGetPlaybackPosition();

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

    public long onGetPlaybackPosition() {
        return this.n_onGetPlaybackPosition();
    }
}

