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
package md54f43efc831dbf0c7cd7b1876c2adc8a9;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class LoggableItemSectionAdapter_1_ListHeaderHolder
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Adapters.LoggableItemSectionAdapter`1+ListHeaderHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", LoggableItemSectionAdapter_1_ListHeaderHolder.class, __md_methods);
    }

    public LoggableItemSectionAdapter_1_ListHeaderHolder() throws Throwable {
        if (this.getClass() == LoggableItemSectionAdapter_1_ListHeaderHolder.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Adapters.LoggableItemSectionAdapter`1+ListHeaderHolder, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

