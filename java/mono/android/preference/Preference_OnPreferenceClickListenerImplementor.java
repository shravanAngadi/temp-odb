/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.preference.Preference
 *  android.preference.Preference$OnPreferenceClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.preference;

import android.preference.Preference;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Preference_OnPreferenceClickListenerImplementor
implements Preference.OnPreferenceClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPreferenceClick:(Landroid/preference/Preference;)Z:GetOnPreferenceClick_Landroid_preference_Preference_Handler:Android.Preferences.Preference/IOnPreferenceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Preferences.Preference+IOnPreferenceClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Preference_OnPreferenceClickListenerImplementor.class, __md_methods);
    }

    public Preference_OnPreferenceClickListenerImplementor() throws Throwable {
        if (this.getClass() == Preference_OnPreferenceClickListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.Preference+IOnPreferenceClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onPreferenceClick(Preference var1);

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

    public boolean onPreferenceClick(Preference preference) {
        return super.n_onPreferenceClick(preference);
    }
}

