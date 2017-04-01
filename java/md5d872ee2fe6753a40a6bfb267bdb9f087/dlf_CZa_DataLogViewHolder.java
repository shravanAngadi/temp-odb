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
package md5d872ee2fe6753a40a6bfb267bdb9f087;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class dlf_CZa_DataLogViewHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("h.dlf+CZa+DataLogViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", dlf_CZa_DataLogViewHolder.class, __md_methods);
    }

    public dlf_CZa_DataLogViewHolder() throws Throwable {
        if (this.getClass() == dlf_CZa_DataLogViewHolder.class) {
            TypeManager.Activate("h.dlf+CZa+DataLogViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

