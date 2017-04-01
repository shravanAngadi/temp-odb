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
package md5066842e4e42fef50908545c889775619;

import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.nfa;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MonitorsActivity
extends nfa
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Monitors.MonitorsActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", MonitorsActivity.class, __md_methods);
    }

    public MonitorsActivity() throws Throwable {
        if (this.getClass() == MonitorsActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Monitors.MonitorsActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

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
}

