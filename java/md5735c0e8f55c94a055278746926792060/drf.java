/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ListFragment
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ListView
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5735c0e8f55c94a055278746926792060;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class drf
extends ListFragment
implements IGCUserPeer {
    public static final String __md_methods = "n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\nn_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onActivityCreated:(Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onStop:()V:GetOnStopHandler\nn_onDetach:()V:GetOnDetachHandler\nn_onListItemClick:(Landroid/widget/ListView;Landroid/view/View;IJ)V:GetOnListItemClick_Landroid_widget_ListView_Landroid_view_View_IJHandler\nn_onCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)V:GetOnCreateOptionsMenu_Landroid_view_Menu_Landroid_view_MenuInflater_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("H.drf, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", drf.class, __md_methods);
    }

    public drf() throws Throwable {
        if (this.getClass() == drf.class) {
            TypeManager.Activate("H.drf, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityCreated(Bundle var1);

    private native void n_onCreate(Bundle var1);

    private native void n_onCreateOptionsMenu(Menu var1, MenuInflater var2);

    private native View n_onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3);

    private native void n_onDetach();

    private native void n_onListItemClick(ListView var1, View var2, int var3, long var4);

    private native boolean n_onOptionsItemSelected(MenuItem var1);

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

    public void onActivityCreated(Bundle bundle) {
        super.n_onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        super.n_onCreateOptionsMenu(menu2, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.n_onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDetach() {
        this.n_onDetach();
    }

    public void onListItemClick(ListView listView, View view, int n, long l) {
        super.n_onListItemClick(listView, view, n, l);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.n_onOptionsItemSelected(menuItem);
    }

    public void onStart() {
        this.n_onStart();
    }

    public void onStop() {
        this.n_onStop();
    }
}

