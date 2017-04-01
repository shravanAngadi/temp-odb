/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5f780b2c8d6aa401eeef08bef09e60552;

import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.nfa;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class LogsActivity
extends nfa
implements IGCUserPeer {
    public static final String __md_methods = "n_onBackPressed:()V:GetOnBackPressedHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Logs.LogsActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", LogsActivity.class, __md_methods);
    }

    public LogsActivity() throws Throwable {
        if (this.getClass() == LogsActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Logs.LogsActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onBackPressed();

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
}

