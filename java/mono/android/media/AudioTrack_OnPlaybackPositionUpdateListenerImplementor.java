/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$OnPlaybackPositionUpdateListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.AudioTrack;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AudioTrack_OnPlaybackPositionUpdateListenerImplementor
implements AudioTrack.OnPlaybackPositionUpdateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMarkerReached:(Landroid/media/AudioTrack;)V:GetOnMarkerReached_Landroid_media_AudioTrack_Handler:Android.Media.AudioTrack/IOnPlaybackPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPeriodicNotification:(Landroid/media/AudioTrack;)V:GetOnPeriodicNotification_Landroid_media_AudioTrack_Handler:Android.Media.AudioTrack/IOnPlaybackPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.AudioTrack+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AudioTrack_OnPlaybackPositionUpdateListenerImplementor.class, __md_methods);
    }

    public AudioTrack_OnPlaybackPositionUpdateListenerImplementor() throws Throwable {
        if (this.getClass() == AudioTrack_OnPlaybackPositionUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.AudioTrack+IOnPlaybackPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onMarkerReached(AudioTrack var1);

    private native void n_onPeriodicNotification(AudioTrack var1);

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

    public void onMarkerReached(AudioTrack audioTrack) {
        super.n_onMarkerReached(audioTrack);
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
        super.n_onPeriodicNotification(audioTrack);
    }
}

