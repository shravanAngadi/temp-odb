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
package md5044cc82689c4521324954bb67132d02e;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class nca_NameCheckboxRowViewHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("F.nca+NameCheckboxRowViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", nca_NameCheckboxRowViewHolder.class, __md_methods);
    }

    public nca_NameCheckboxRowViewHolder() throws Throwable {
        if (this.getClass() == nca_NameCheckboxRowViewHolder.class) {
            TypeManager.Activate("F.nca+NameCheckboxRowViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

