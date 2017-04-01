/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.PresetReverb
 *  android.media.audiofx.PresetReverb$OnParameterChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.PresetReverb;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class PresetReverb_OnParameterChangeListenerImplementor
implements PresetReverb.OnParameterChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/PresetReverb;IIS)V:GetOnParameterChange_Landroid_media_audiofx_PresetReverb_IISHandler:Android.Media.Audiofx.PresetReverb/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.PresetReverb+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", PresetReverb_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public PresetReverb_OnParameterChangeListenerImplementor() throws Throwable {
        if (this.getClass() == PresetReverb_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.PresetReverb+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onParameterChange(PresetReverb var1, int var2, int var3, short var4);

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

    public void onParameterChange(PresetReverb presetReverb, int n, int n2, short s) {
        super.n_onParameterChange(presetReverb, n, n2, s);
    }
}

