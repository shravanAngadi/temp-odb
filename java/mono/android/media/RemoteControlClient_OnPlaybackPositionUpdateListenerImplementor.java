/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.RemoteControlClient
 *  android.media.RemoteControlClient$OnPlaybackPositionUpdateListener
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

public class RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor
implements RemoteControlClient.OnPlaybackPositionUpdateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPlaybackPositionUpdate:(J)V:GetOnPlaybackPositionUpdate_JHandler:Android.Media.RemoteControlClient/IOnPlaybackPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.RemoteControlClient+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor.class, __md_methods);
    }

    public RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor() throws Throwable {
        if (this.getClass() == RemoteControlClient_OnPlaybackPositionUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.RemoteControlClient+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onPlaybackPositionUpdate(long var1);

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

    public void onPlaybackPositionUpdate(long l) {
        super.n_onPlaybackPositionUpdate(l);
    }
}

