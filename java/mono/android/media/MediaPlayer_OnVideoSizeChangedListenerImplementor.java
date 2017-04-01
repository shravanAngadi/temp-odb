/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
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

public class MediaPlayer_OnVideoSizeChangedListenerImplementor
implements MediaPlayer.OnVideoSizeChangedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onVideoSizeChanged:(Landroid/media/MediaPlayer;II)V:GetOnVideoSizeChanged_Landroid_media_MediaPlayer_IIHandler:Android.Media.MediaPlayer/IOnVideoSizeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaPlayer_OnVideoSizeChangedListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnVideoSizeChangedListenerImplementor() throws Throwable {
        if (this.getClass() == MediaPlayer_OnVideoSizeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onVideoSizeChanged(MediaPlayer var1, int var2, int var3);

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

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int n, int n2) {
        super.n_onVideoSizeChanged(mediaPlayer, n, n2);
    }
}

