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
package md5b3b193298007071046f124943de4ecba;

import java.util.ArrayList;
import md533709f2dd05c7cd742fb7eec7295b8a6.JavaObjectWrapper_1;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OBDLinkFirmwareUpdatesActivity_OBDLinkUpdateAdapter_CZa
extends JavaObjectWrapper_1
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareUpdatesActivity+OBDLinkUpdateAdapter+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", OBDLinkFirmwareUpdatesActivity_OBDLinkUpdateAdapter_CZa.class, __md_methods);
    }

    public OBDLinkFirmwareUpdatesActivity_OBDLinkUpdateAdapter_CZa() throws Throwable {
        if (this.getClass() == OBDLinkFirmwareUpdatesActivity_OBDLinkUpdateAdapter_CZa.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareUpdatesActivity+OBDLinkUpdateAdapter+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
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

