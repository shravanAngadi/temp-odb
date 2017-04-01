/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.Virtualizer
 *  android.media.audiofx.Virtualizer$OnParameterChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.Virtualizer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Virtualizer_OnParameterChangeListenerImplementor
implements Virtualizer.OnParameterChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onParameterChange:(Landroid/media/audiofx/Virtualizer;IIS)V:GetOnParameterChange_Landroid_media_audiofx_Virtualizer_IISHandler:Android.Media.Audiofx.Virtualizer/IOnParameterChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.Virtualizer+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Virtualizer_OnParameterChangeListenerImplementor.class, __md_methods);
    }

    public Virtualizer_OnParameterChangeListenerImplementor() throws Throwable {
        if (this.getClass() == Virtualizer_OnParameterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.Virtualizer+IOnParameterChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onParameterChange(Virtualizer var1, int var2, int var3, short var4);

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

    public void onParameterChange(Virtualizer virtualizer, int n, int n2, short s) {
        super.n_onParameterChange(virtualizer, n, n2, s);
    }
}

