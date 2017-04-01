/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.EnvironmentalReverb
 *  android.media.audiofx.EnvironmentalReverb$OnParameterChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.EnvironmentalReverb;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class EnvironmentalReverb_OnParameterChangeListenerImplementor
implements EnvironmentalReverb.OnParameterChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/EnvironmentalReverb;III)V:GetOnParameterChange_Landroid_media_audiofx_EnvironmentalReverb_IIIHandler:Android.Media.Audiofx.EnvironmentalReverb/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.EnvironmentalReverb+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", EnvironmentalReverb_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public EnvironmentalReverb_OnParameterChangeListenerImplementor() throws Throwable {
        if (this.getClass() == EnvironmentalReverb_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.EnvironmentalReverb+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onParameterChange(EnvironmentalReverb var1, int var2, int var3, int var4);

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

    public void onParameterChange(EnvironmentalReverb environmentalReverb, int n, int n2, int n3) {
        super.n_onParameterChange(environmentalReverb, n, n2, n3);
    }
}

