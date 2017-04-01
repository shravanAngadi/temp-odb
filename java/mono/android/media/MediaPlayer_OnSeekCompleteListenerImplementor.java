/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaPlayer_OnSeekCompleteListenerImplementor
implements MediaPlayer.OnSeekCompleteListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSeekComplete:(Landroid/media/MediaPlayer;)V:GetOnSeekComplete_Landroid_media_MediaPlayer_Handler:Android.Media.MediaPlayer/IOnSeekCompleteListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnSeekCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaPlayer_OnSeekCompleteListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnSeekCompleteListenerImplementor() throws Throwable {
        if (this.getClass() == MediaPlayer_OnSeekCompleteListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnSeekCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onSeekComplete(MediaPlayer var1);

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

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        super.n_onSeekComplete(mediaPlayer);
    }
}

