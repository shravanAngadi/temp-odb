/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5b3b193298007071046f124943de4ecba;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OBDLinkFirmwareLoaderActivity
extends Activity
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareLoaderActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", OBDLinkFirmwareLoaderActivity.class, __md_methods);
    }

    public OBDLinkFirmwareLoaderActivity() throws Throwable {
        if (this.getClass() == OBDLinkFirmwareLoaderActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareLoaderActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onBackPressed();

    private native void n_onCreate(Bundle var1);

    private native void n_onStart();

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

    public void onBackPressed() {
        this.n_onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onStart() {
        this.n_onStart();
    }
}

