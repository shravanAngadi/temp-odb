/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
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
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ColorPickerDialog
extends Dialog
implements View.OnClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onSaveInstanceState:()Landroid/os/Bundle;:GetOnSaveInstanceStateHandler\nn_onRestoreInstanceState:(Landroid/os/Bundle;)V:GetOnRestoreInstanceState_Landroid_os_Bundle_Handler\nn_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("MonoDroid.ColorPickers.ColorPickerDialog, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", ColorPickerDialog.class, __md_methods);
    }

    public ColorPickerDialog(Context context) throws Throwable {
        super(context);
        if (this.getClass() == ColorPickerDialog.class) {
            TypeManager.Activate("MonoDroid.ColorPickers.ColorPickerDialog, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    private native void n_onClick(View var1);

    private native void n_onRestoreInstanceState(Bundle var1);

    private native Bundle n_onSaveInstanceState();

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

    public void onClick(View view) {
        super.n_onClick(view);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.n_onRestoreInstanceState(bundle);
    }

    public Bundle onSaveInstanceState() {
        return this.n_onSaveInstanceState();
    }
}

