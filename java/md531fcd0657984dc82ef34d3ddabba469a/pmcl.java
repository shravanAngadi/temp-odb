/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.MenuItem
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md531fcd0657984dc82ef34d3ddabba469a;

import android.app.Activity;
import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class pmcl
implements PopupMenu.OnMenuItemClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:Android.Widget.PopupMenu/IOnMenuItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("B.pmcl, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", pmcl.class, __md_methods);
    }

    public pmcl() throws Throwable {
        if (this.getClass() == pmcl.class) {
            TypeManager.Activate("B.pmcl, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public pmcl(Activity activity) throws Throwable {
        if (this.getClass() == pmcl.class) {
            TypeManager.Activate("B.pmcl, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.App.Activity, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{activity});
        }
    }

    private native boolean n_onMenuItemClick(MenuItem var1);

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

    public boolean onMenuItemClick(MenuItem menuItem) {
        return super.n_onMenuItemClick(menuItem);
    }
}

