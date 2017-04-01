/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuItem
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md588b4372146f31ccd801d92fafbfc6466;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.cma;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public abstract class gda
extends cma
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onBackPressed:()V:GetOnBackPressedHandler\nn_onStop:()V:GetOnStopHandler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\nn_onRestoreInstanceState:(Landroid/os/Bundle;)V:GetOnRestoreInstanceState_Landroid_os_Bundle_Handler\nn_onCreateOptionsMenu:(Landroid/view/Menu;)Z:GetOnCreateOptionsMenu_Landroid_view_Menu_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("I.gda, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", gda.class, __md_methods);
    }

    public gda() throws Throwable {
        if (this.getClass() == gda.class) {
            TypeManager.Activate("I.gda, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onBackPressed();

    private native void n_onCreate(Bundle var1);

    private native boolean n_onCreateOptionsMenu(Menu var1);

    private native void n_onDestroy();

    private native boolean n_onOptionsItemSelected(MenuItem var1);

    private native void n_onRestoreInstanceState(Bundle var1);

    private native void n_onSaveInstanceState(Bundle var1);

    private native void n_onStart();

    private native void n_onStop();

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

    public void onBackPressed() {
        this.n_onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        return super.n_onCreateOptionsMenu(menu2);
    }

    public void onDestroy() {
        this.n_onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.n_onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.n_onRestoreInstanceState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.n_onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.n_onStart();
    }

    public void onStop() {
        this.n_onStop();
    }
}

