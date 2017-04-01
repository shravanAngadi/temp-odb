/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.AudioManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AudioManager_OnAudioFocusChangeListenerImplementor
implements AudioManager.OnAudioFocusChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onAudioFocusChange:(I)V:GetOnAudioFocusChange_IHandler:Android.Media.AudioManager/IOnAudioFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.AudioManager+IOnAudioFocusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AudioManager_OnAudioFocusChangeListenerImplementor.class, __md_methods);
    }

    public AudioManager_OnAudioFocusChangeListenerImplementor() throws Throwable {
        if (this.getClass() == AudioManager_OnAudioFocusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.AudioManager+IOnAudioFocusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onAudioFocusChange(int var1);

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

    public void onAudioFocusChange(int n) {
        super.n_onAudioFocusChange(n);
    }
}

