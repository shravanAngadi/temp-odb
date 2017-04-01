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
package md588b4372146f31ccd801d92fafbfc6466;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class gda_CZA_SGaugeTemplateViewHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("I.gda+CZA+SGaugeTemplateViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", gda_CZA_SGaugeTemplateViewHolder.class, __md_methods);
    }

    public gda_CZA_SGaugeTemplateViewHolder() throws Throwable {
        if (this.getClass() == gda_CZA_SGaugeTemplateViewHolder.class) {
            TypeManager.Activate("I.gda+CZA+SGaugeTemplateViewHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

