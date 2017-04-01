/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.content;

import android.content.DialogInterface;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DialogInterface_OnMultiChoiceClickListenerImplementor
implements DialogInterface.OnMultiChoiceClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onClick:(Landroid/content/DialogInterface;IZ)V:GetOnClick_Landroid_content_DialogInterface_IZHandler:Android.Content.IDialogInterfaceOnMultiChoiceClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Content.IDialogInterfaceOnMultiChoiceClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", DialogInterface_OnMultiChoiceClickListenerImplementor.class, __md_methods);
    }

    public DialogInterface_OnMultiChoiceClickListenerImplementor() throws Throwable {
        if (this.getClass() == DialogInterface_OnMultiChoiceClickListenerImplementor.class) {
            TypeManager.Activate("Android.Content.IDialogInterfaceOnMultiChoiceClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onClick(DialogInterface var1, int var2, boolean var3);

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

    public void onClick(DialogInterface dialogInterface, int n, boolean bl) {
        super.n_onClick(dialogInterface, n, bl);
    }
}

