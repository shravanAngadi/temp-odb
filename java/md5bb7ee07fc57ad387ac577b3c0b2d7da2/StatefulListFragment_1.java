/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ListFragment
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5bb7ee07fc57ad387ac577b3c0b2d7da2;

import android.app.ListFragment;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public abstract class StatefulListFragment_1
extends ListFragment
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.StatefulListFragment`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", StatefulListFragment_1.class, __md_methods);
    }

    public StatefulListFragment_1() throws Throwable {
        if (this.getClass() == StatefulListFragment_1.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.StatefulListFragment`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onCreate(Bundle var1);

    private native void n_onSaveInstanceState(Bundle var1);

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

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.n_onSaveInstanceState(bundle);
    }
}

