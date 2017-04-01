/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
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

import android.app.AlertDialog;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ConnectionTypePreferenceWithHelp
extends ListPreference
implements IGCUserPeer {
    public static final String __md_methods = "n_onPrepareDialogBuilder:(Landroid/app/AlertDialog$Builder;)V:GetOnPrepareDialogBuilder_Landroid_app_AlertDialog_Builder_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.ConnectionTypePreferenceWithHelp, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", ConnectionTypePreferenceWithHelp.class, __md_methods);
    }

    public ConnectionTypePreferenceWithHelp(Context context) throws Throwable {
        super(context);
        if (this.getClass() == ConnectionTypePreferenceWithHelp.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.ConnectionTypePreferenceWithHelp, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public ConnectionTypePreferenceWithHelp(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == ConnectionTypePreferenceWithHelp.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.ConnectionTypePreferenceWithHelp, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    private native void n_onPrepareDialogBuilder(AlertDialog.Builder var1);

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

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.n_onPrepareDialogBuilder(builder);
    }
}

