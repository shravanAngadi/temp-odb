/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class PopupMenu_OnMenuItemClickListenerImplementor
implements PopupMenu.OnMenuItemClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:Android.Widget.PopupMenu/IOnMenuItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.PopupMenu+IOnMenuItemClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", PopupMenu_OnMenuItemClickListenerImplementor.class, __md_methods);
    }

    public PopupMenu_OnMenuItemClickListenerImplementor() throws Throwable {
        if (this.getClass() == PopupMenu_OnMenuItemClickListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.PopupMenu+IOnMenuItemClickListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
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

