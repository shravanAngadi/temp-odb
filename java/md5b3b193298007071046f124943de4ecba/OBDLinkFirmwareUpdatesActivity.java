/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuItem
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5b3b193298007071046f124943de4ecba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OBDLinkFirmwareUpdatesActivity
extends Activity
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\nn_onCreateOptionsMenu:(Landroid/view/Menu;)Z:GetOnCreateOptionsMenu_Landroid_view_Menu_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareUpdatesActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", OBDLinkFirmwareUpdatesActivity.class, __md_methods);
    }

    public OBDLinkFirmwareUpdatesActivity() throws Throwable {
        if (this.getClass() == OBDLinkFirmwareUpdatesActivity.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareUpdatesActivity, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityResult(int var1, int var2, Intent var3);

    private native void n_onCreate(Bundle var1);

    private native boolean n_onCreateOptionsMenu(Menu var1);

    private native boolean n_onOptionsItemSelected(MenuItem var1);

    private native void n_onStart();

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

    public void onActivityResult(int n, int n2, Intent intent) {
        super.n_onActivityResult(n, n2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        return super.n_onCreateOptionsMenu(menu2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.n_onOptionsItemSelected(menuItem);
    }

    public void onStart() {
        this.n_onStart();
    }
}

