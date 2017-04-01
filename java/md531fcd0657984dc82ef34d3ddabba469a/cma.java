/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md531fcd0657984dc82ef34d3ddabba469a;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public abstract class cma
extends Activity
implements IGCUserPeer {
    public static final String __md_methods = "n_onResume:()V:GetOnResumeHandler\nn_onPause:()V:GetOnPauseHandler\nn_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("B.cma, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", cma.class, __md_methods);
    }

    public cma() throws Throwable {
        if (this.getClass() == cma.class) {
            TypeManager.Activate("B.cma, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityResult(int var1, int var2, Intent var3);

    private native void n_onPause();

    private native void n_onResume();

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

    public void onPause() {
        this.n_onPause();
    }

    public void onResume() {
        this.n_onResume();
    }
}

