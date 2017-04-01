/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md582b5a07626dd05129629b576a190027d;

import android.os.Bundle;
import java.util.ArrayList;
import md588b4372146f31ccd801d92fafbfc6466.gda;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SGaugeDigitalDesignerActivity
extends gda
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Gauges.Designer.SGaugeDigitalDesignerActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", SGaugeDigitalDesignerActivity.class, __md_methods);
    }

    public SGaugeDigitalDesignerActivity() throws Throwable {
        if (this.getClass() == SGaugeDigitalDesignerActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Gauges.Designer.SGaugeDigitalDesignerActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onCreate(Bundle var1);

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

    @Override
    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }
}

