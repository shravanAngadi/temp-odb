/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md52e76548983cb0e422a2c7e399a247ff3;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.cma;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class DropboxActivity
extends cma
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onNewIntent:(Landroid/content/Intent;)V:GetOnNewIntent_Landroid_content_Intent_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.DropboxActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", DropboxActivity.class, __md_methods);
    }

    public DropboxActivity() throws Throwable {
        if (this.getClass() == DropboxActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.DropboxActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onCreate(Bundle var1);

    private native void n_onNewIntent(Intent var1);

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

    public void onNewIntent(Intent intent) {
        super.n_onNewIntent(intent);
    }
}

