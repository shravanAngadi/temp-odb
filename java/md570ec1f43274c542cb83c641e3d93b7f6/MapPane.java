/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnInfoWindowClickListener
 *  com.google.android.gms.maps.OnMapReadyCallback
 *  com.google.android.gms.maps.model.Marker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md570ec1f43274c542cb83c641e3d93b7f6;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.cma;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MapPane
extends cma
implements GoogleMap.OnInfoWindowClickListener,
OnMapReadyCallback,
IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onStop:()V:GetOnStopHandler\nn_onResume:()V:GetOnResumeHandler\nn_onPause:()V:GetOnPauseHandler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V:GetOnCreateContextMenu_Landroid_view_ContextMenu_Landroid_view_View_Landroid_view_ContextMenu_ContextMenuInfo_Handler\nn_onContextItemSelected:(Landroid/view/MenuItem;)Z:GetOnContextItemSelected_Landroid_view_MenuItem_Handler\nn_onCreateOptionsMenu:(Landroid/view/Menu;)Z:GetOnCreateOptionsMenu_Landroid_view_Menu_Handler\nn_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\nn_onMapReady:(Lcom/google/android/gms/maps/GoogleMap;)V:GetOnMapReady_Lcom_google_android_gms_maps_GoogleMap_Handler:Android.Gms.Maps.IOnMapReadyCallbackInvoker, Xamarin.GooglePlayServices.Maps\nn_onInfoWindowClick:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnInfoWindowClick_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnInfoWindowClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Maps.Google.MapPane, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", MapPane.class, __md_methods);
    }

    public MapPane() throws Throwable {
        if (this.getClass() == MapPane.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Maps.Google.MapPane, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native boolean n_onContextItemSelected(MenuItem var1);

    private native void n_onCreate(Bundle var1);

    private native void n_onCreateContextMenu(ContextMenu var1, View var2, ContextMenu.ContextMenuInfo var3);

    private native boolean n_onCreateOptionsMenu(Menu var1);

    private native void n_onDestroy();

    private native void n_onInfoWindowClick(Marker var1);

    private native void n_onMapReady(GoogleMap var1);

    private native boolean n_onOptionsItemSelected(MenuItem var1);

    private native void n_onPause();

    private native void n_onResume();

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

    public boolean onContextItemSelected(MenuItem menuItem) {
        return super.n_onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.n_onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        return super.n_onCreateOptionsMenu(menu2);
    }

    public void onDestroy() {
        this.n_onDestroy();
    }

    public void onInfoWindowClick(Marker marker) {
        super.n_onInfoWindowClick(marker);
    }

    public void onMapReady(GoogleMap googleMap) {
        super.n_onMapReady(googleMap);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.n_onOptionsItemSelected(menuItem);
    }

    @Override
    public void onPause() {
        this.n_onPause();
    }

    @Override
    public void onResume() {
        this.n_onResume();
    }

    public void onStart() {
        this.n_onStart();
    }

    public void onStop() {
        this.n_onStop();
    }
}

