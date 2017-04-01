/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.preference.Preference
 *  android.preference.Preference$OnPreferenceChangeListener
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

public class Preference_OnPreferenceChangeListenerImplementor
implements Preference.OnPreferenceChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPreferenceChange:(Landroid/preference/Preference;Ljava/lang/Object;)Z:GetOnPreferenceChange_Landroid_preference_Preference_Ljava_lang_Object_Handler:Android.Preferences.Preference/IOnPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Preferences.Preference+IOnPreferenceChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Preference_OnPreferenceChangeListenerImplementor.class, __md_methods);
    }

    public Preference_OnPreferenceChangeListenerImplementor() throws Throwable {
        if (this.getClass() == Preference_OnPreferenceChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Preferences.Preference+IOnPreferenceChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onPreferenceChange(Preference var1, Object var2);

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

    public boolean onPreferenceChange(Preference preference, Object object) {
        return super.n_onPreferenceChange(preference, object);
    }
}

