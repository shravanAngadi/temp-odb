/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.Equalizer
 *  android.media.audiofx.Equalizer$OnParameterChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.Equalizer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Equalizer_OnParameterChangeListenerImplementor
implements Equalizer.OnParameterChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/Equalizer;IIII)V:GetOnParameterChange_Landroid_media_audiofx_Equalizer_IIIIHandler:Android.Media.Audiofx.Equalizer/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.Equalizer+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Equalizer_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public Equalizer_OnParameterChangeListenerImplementor() throws Throwable {
        if (this.getClass() == Equalizer_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.Equalizer+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onParameterChange(Equalizer var1, int var2, int var3, int var4, int var5);

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

    public void onParameterChange(Equalizer equalizer, int n, int n2, int n3, int n4) {
        this.n_onParameterChange(equalizer, n, n2, n3, n4);
    }
}

