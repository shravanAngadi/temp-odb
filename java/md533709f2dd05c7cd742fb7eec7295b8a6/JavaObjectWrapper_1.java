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
package md533709f2dd05c7cd742fb7eec7295b8a6;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class JavaObjectWrapper_1
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Components.JavaObjectWrapper`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", JavaObjectWrapper_1.class, __md_methods);
    }

    public JavaObjectWrapper_1() throws Throwable {
        if (this.getClass() == JavaObjectWrapper_1.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Components.JavaObjectWrapper`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

