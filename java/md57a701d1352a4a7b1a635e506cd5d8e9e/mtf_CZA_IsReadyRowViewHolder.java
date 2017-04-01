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
package md57a701d1352a4a7b1a635e506cd5d8e9e;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class mtf_CZA_IsReadyRowViewHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("e.mtf+CZA+IsReadyRowViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", mtf_CZA_IsReadyRowViewHolder.class, __md_methods);
    }

    public mtf_CZA_IsReadyRowViewHolder() throws Throwable {
        if (this.getClass() == mtf_CZA_IsReadyRowViewHolder.class) {
            TypeManager.Activate("e.mtf+CZA+IsReadyRowViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

