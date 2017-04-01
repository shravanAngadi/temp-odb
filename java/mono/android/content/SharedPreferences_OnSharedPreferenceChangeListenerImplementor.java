/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.content;

import android.content.SharedPreferences;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SharedPreferences_OnSharedPreferenceChangeListenerImplementor
implements SharedPreferences.OnSharedPreferenceChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSharedPreferenceChanged:(Landroid/content/SharedPreferences;Ljava/lang/String;)V:GetOnSharedPreferenceChanged_Landroid_content_SharedPreferences_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SharedPreferences_OnSharedPreferenceChangeListenerImplementor.class, __md_methods);
    }

    public SharedPreferences_OnSharedPreferenceChangeListenerImplementor() throws Throwable {
        if (this.getClass() == SharedPreferences_OnSharedPreferenceChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onSharedPreferenceChanged(SharedPreferences var1, String var2);

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

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string2) {
        super.n_onSharedPreferenceChanged(sharedPreferences, string2);
    }
}

