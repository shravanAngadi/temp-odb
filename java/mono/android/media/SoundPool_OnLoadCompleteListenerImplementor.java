/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.SoundPool
 *  android.media.SoundPool$OnLoadCompleteListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.SoundPool;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SoundPool_OnLoadCompleteListenerImplementor
implements SoundPool.OnLoadCompleteListener,
IGCUserPeer {
    public static final String __md_methods = "n_onLoadComplete:(Landroid/media/SoundPool;II)V:GetOnLoadComplete_Landroid_media_SoundPool_IIHandler:Android.Media.SoundPool/IOnLoadCompleteListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.SoundPool+IOnLoadCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SoundPool_OnLoadCompleteListenerImplementor.class, __md_methods);
    }

    public SoundPool_OnLoadCompleteListenerImplementor() throws Throwable {
        if (this.getClass() == SoundPool_OnLoadCompleteListenerImplementor.class) {
            TypeManager.Activate("Android.Media.SoundPool+IOnLoadCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onLoadComplete(SoundPool var1, int var2, int var3);

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

    public void onLoadComplete(SoundPool soundPool, int n, int n2) {
        super.n_onLoadComplete(soundPool, n, n2);
    }
}

