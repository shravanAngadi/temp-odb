/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.Bundle
 *  android.preference.Preference
 *  android.preference.PreferenceFragment
 *  android.preference.PreferenceScreen
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5377c9644ae0e3b42d34150299b296411;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class sf
extends PreferenceFragment
implements SharedPreferences.OnSharedPreferenceChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStop:()V:GetOnStopHandler\nn_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\nn_onPreferenceTreeClick:(Landroid/preference/PreferenceScreen;Landroid/preference/Preference;)Z:GetOnPreferenceTreeClick_Landroid_preference_PreferenceScreen_Landroid_preference_Preference_Handler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onSharedPreferenceChanged:(Landroid/content/SharedPreferences;Ljava/lang/String;)V:GetOnSharedPreferenceChanged_Landroid_content_SharedPreferences_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("j.sf, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", sf.class, __md_methods);
    }

    public sf() throws Throwable {
        if (this.getClass() == sf.class) {
            TypeManager.Activate("j.sf, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityResult(int var1, int var2, Intent var3);

    private native void n_onCreate(Bundle var1);

    private native void n_onDestroy();

    private native boolean n_onPreferenceTreeClick(PreferenceScreen var1, Preference var2);

    private native void n_onSharedPreferenceChanged(SharedPreferences var1, String var2);

    private native void n_onStop();

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

    public void onActivityResult(int n, int n2, Intent intent) {
        super.n_onActivityResult(n, n2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onDestroy() {
        this.n_onDestroy();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        return super.n_onPreferenceTreeClick(preferenceScreen, preference);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string2) {
        super.n_onSharedPreferenceChanged(sharedPreferences, string2);
    }

    public void onStop() {
        this.n_onStop();
    }
}

