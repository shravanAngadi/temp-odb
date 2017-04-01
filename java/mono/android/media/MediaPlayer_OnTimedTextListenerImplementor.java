/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnTimedTextListener
 *  android.media.TimedText
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.MediaPlayer;
import android.media.TimedText;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaPlayer_OnTimedTextListenerImplementor
implements MediaPlayer.OnTimedTextListener,
IGCUserPeer {
    public static final String __md_methods = "n_onTimedText:(Landroid/media/MediaPlayer;Landroid/media/TimedText;)V:GetOnTimedText_Landroid_media_MediaPlayer_Landroid_media_TimedText_Handler:Android.Media.MediaPlayer/IOnTimedTextListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnTimedTextListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaPlayer_OnTimedTextListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnTimedTextListenerImplementor() throws Throwable {
        if (this.getClass() == MediaPlayer_OnTimedTextListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnTimedTextListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onTimedText(MediaPlayer var1, TimedText var2);

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

    public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
        super.n_onTimedText(mediaPlayer, timedText);
    }
}

