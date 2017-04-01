/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md52e76548983cb0e422a2c7e399a247ff3;

import android.os.Bundle;
import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.cmla;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class InformationActivity
extends cmla
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onResume:()V:GetOnResumeHandler\nn_onPause:()V:GetOnPauseHandler\nn_onStart:()V:GetOnStartHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.InformationActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", InformationActivity.class, __md_methods);
    }

    public InformationActivity() throws Throwable {
        if (this.getClass() == InformationActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.InformationActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onCreate(Bundle var1);

    private native void n_onPause();

    private native void n_onResume();

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

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    @Override
    public void onPause() {
        this.n_onPause();
    }

    @Override
    public void onResume() {
        this.n_onResume();
    }

    public void onStart() {
        this.n_onStart();
    }
}

