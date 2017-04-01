/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md533709f2dd05c7cd742fb7eec7295b8a6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WifiChangedBroadcastReceiver
extends BroadcastReceiver
implements IGCUserPeer {
    public static final String __md_methods = "n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Components.WifiChangedBroadcastReceiver, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", WifiChangedBroadcastReceiver.class, __md_methods);
    }

    public WifiChangedBroadcastReceiver() throws Throwable {
        if (this.getClass() == WifiChangedBroadcastReceiver.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Components.WifiChangedBroadcastReceiver, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onReceive(Context var1, Intent var2);

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

    public void onReceive(Context context, Intent intent) {
        super.n_onReceive(context, intent);
    }
}

