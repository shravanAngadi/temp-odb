/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5d9c7dcdbb54f423705a76e65ea476b4a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RoundColorPickerDialog
extends Dialog
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("MonoDroid.ColorPickers.RoundColorPickerDialog, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", RoundColorPickerDialog.class, __md_methods);
    }

    public RoundColorPickerDialog(Context context) throws Throwable {
        super(context);
        if (this.getClass() == RoundColorPickerDialog.class) {
            TypeManager.Activate("MonoDroid.ColorPickers.RoundColorPickerDialog, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    private native void n_onCreate(Bundle var1);

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

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }
}

