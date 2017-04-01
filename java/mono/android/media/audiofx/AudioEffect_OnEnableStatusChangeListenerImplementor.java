/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.AudioEffect
 *  android.media.audiofx.AudioEffect$OnEnableStatusChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.AudioEffect;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AudioEffect_OnEnableStatusChangeListenerImplementor
implements AudioEffect.OnEnableStatusChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onEnableStatusChange:(Landroid/media/audiofx/AudioEffect;Z)V:GetOnEnableStatusChange_Landroid_media_audiofx_AudioEffect_ZHandler:Android.Media.Audiofx.AudioEffect/IOnEnableStatusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.AudioEffect+IOnEnableStatusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AudioEffect_OnEnableStatusChangeListenerImplementor.class, __md_methods);
    }

    public AudioEffect_OnEnableStatusChangeListenerImplementor() throws Throwable {
        if (this.getClass() == AudioEffect_OnEnableStatusChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.AudioEffect+IOnEnableStatusChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onEnableStatusChange(AudioEffect var1, boolean var2);

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

    public void onEnableStatusChange(AudioEffect audioEffect, boolean bl) {
        super.n_onEnableStatusChange(audioEffect, bl);
    }
}

