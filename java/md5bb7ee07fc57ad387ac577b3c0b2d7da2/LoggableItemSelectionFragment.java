/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ListFragment
 *  android.os.Bundle
 *  android.view.MenuItem
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5bb7ee07fc57ad387ac577b3c0b2d7da2;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class LoggableItemSelectionFragment
extends ListFragment
implements IGCUserPeer {
    public static final String __md_methods = "n_onActivityCreated:(Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_os_Bundle_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.LoggableItemSelectionFragment, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", LoggableItemSelectionFragment.class, __md_methods);
    }

    public LoggableItemSelectionFragment() throws Throwable {
        if (this.getClass() == LoggableItemSelectionFragment.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.LoggableItemSelectionFragment, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityCreated(Bundle var1);

    private native boolean n_onOptionsItemSelected(MenuItem var1);

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

    public void onActivityCreated(Bundle bundle) {
        super.n_onActivityCreated(bundle);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.n_onOptionsItemSelected(menuItem);
    }
}

