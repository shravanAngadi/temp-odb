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
import md531fcd0657984dc82ef34d3ddabba469a.cma;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WebviewActivity
extends cma
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.WebviewActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", WebviewActivity.class, __md_methods);
    }

    public WebviewActivity() throws Throwable {
        if (this.getClass() == WebviewActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.WebviewActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

