/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.preference.PreferenceManager
 *  android.preference.PreferenceManager$OnActivityResultListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.preference;

import android.content.Intent;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class PreferenceManager_OnActivityResultListenerImplementor
implements PreferenceManager.OnActivityResultListener,
IGCUserPeer {
    public static final String __md_methods = "n_onActivityResult:(IILandroid/content/Intent;)Z:GetOnActivityResult_IILandroid_content_Intent_Handler:Android.Preferences.PreferenceManager/IOnActivityResultListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Preferences.PreferenceManager+IOnActivityResultListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", PreferenceManager_OnActivityResultListenerImplementor.class, __md_methods);
    }

    public PreferenceManager_OnActivityResultListenerImplementor() throws Throwable {
        if (this.getClass() == PreferenceManager_OnActivityResultListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.PreferenceManager+IOnActivityResultListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onActivityResult(int var1, int var2, Intent var3);

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

    public boolean onActivityResult(int n, int n2, Intent intent) {
        return super.n_onActivityResult(n, n2, intent);
    }
}

