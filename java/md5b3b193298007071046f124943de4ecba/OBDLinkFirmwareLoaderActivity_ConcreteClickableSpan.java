/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5b3b193298007071046f124943de4ecba;

import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OBDLinkFirmwareLoaderActivity_ConcreteClickableSpan
extends ClickableSpan
implements IGCUserPeer {
    public static final String __md_methods = "n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareLoaderActivity+ConcreteClickableSpan, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", OBDLinkFirmwareLoaderActivity_ConcreteClickableSpan.class, __md_methods);
    }

    public OBDLinkFirmwareLoaderActivity_ConcreteClickableSpan() throws Throwable {
        if (this.getClass() == OBDLinkFirmwareLoaderActivity_ConcreteClickableSpan.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareLoaderActivity+ConcreteClickableSpan, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onClick(View var1);

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

    public void onClick(View view) {
        super.n_onClick(view);
    }
}

