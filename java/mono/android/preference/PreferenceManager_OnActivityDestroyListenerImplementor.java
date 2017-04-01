/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.preference.PreferenceManager
 *  android.preference.PreferenceManager$OnActivityDestroyListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.preference;

import android.preference.PreferenceManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class PreferenceManager_OnActivityDestroyListenerImplementor
implements PreferenceManager.OnActivityDestroyListener,
IGCUserPeer {
    public static final String __md_methods = "n_onActivityDestroy:()V:GetOnActivityDestroyHandler:Android.Preferences.PreferenceManager/IOnActivityDestroyListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Preferences.PreferenceManager+IOnActivityDestroyListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", PreferenceManager_OnActivityDestroyListenerImplementor.class, __md_methods);
    }

    public PreferenceManager_OnActivityDestroyListenerImplementor() throws Throwable {
        if (this.getClass() == PreferenceManager_OnActivityDestroyListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.PreferenceManager+IOnActivityDestroyListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onActivityDestroy();

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

    public void onActivityDestroy() {
        this.n_onActivityDestroy();
    }
}

