/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.ListPreference
 *  android.util.AttributeSet
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package octech.mobile.applications.settings;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class IntegerListPreference
extends ListPreference
implements IGCUserPeer {
    public static final String __md_methods = "n_persistString:(Ljava/lang/String;)Z:GetPersistString_Ljava_lang_String_Handler\nn_getPersistedString:(Ljava/lang/String;)Ljava/lang/String;:GetGetPersistedString_Ljava_lang_String_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.IntegerListPreference, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", IntegerListPreference.class, __md_methods);
    }

    public IntegerListPreference(Context context) throws Throwable {
        super(context);
        if (this.getClass() == IntegerListPreference.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.IntegerListPreference, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public IntegerListPreference(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == IntegerListPreference.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.IntegerListPreference, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    private native String n_getPersistedString(String var1);

    private native boolean n_persistString(String var1);

    public String getPersistedString(String string2) {
        return super.n_getPersistedString(string2);
    }

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

    public boolean persistString(String string2) {
        return super.n_persistString(string2);
    }
}

