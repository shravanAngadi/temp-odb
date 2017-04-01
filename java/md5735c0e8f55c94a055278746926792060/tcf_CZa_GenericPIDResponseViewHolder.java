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
package md5735c0e8f55c94a055278746926792060;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class tcf_CZa_GenericPIDResponseViewHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("H.tcf+CZa+GenericPIDResponseViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", tcf_CZa_GenericPIDResponseViewHolder.class, __md_methods);
    }

    public tcf_CZa_GenericPIDResponseViewHolder() throws Throwable {
        if (this.getClass() == tcf_CZa_GenericPIDResponseViewHolder.class) {
            TypeManager.Activate("H.tcf+CZa+GenericPIDResponseViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

