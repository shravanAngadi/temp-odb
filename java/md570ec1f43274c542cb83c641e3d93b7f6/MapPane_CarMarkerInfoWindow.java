/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$InfoWindowAdapter
 *  com.google.android.gms.maps.model.Marker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md570ec1f43274c542cb83c641e3d93b7f6;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MapPane_CarMarkerInfoWindow
implements GoogleMap.InfoWindowAdapter,
IGCUserPeer {
    public static final String __md_methods = "n_getInfoContents:(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;:GetGetInfoContents_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IInfoWindowAdapterInvoker, Xamarin.GooglePlayServices.Maps\nn_getInfoWindow:(Lcom/google/android/gms/maps/model/Marker;)Landroid/view/View;:GetGetInfoWindow_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IInfoWindowAdapterInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Maps.Google.MapPane+CarMarkerInfoWindow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", MapPane_CarMarkerInfoWindow.class, __md_methods);
    }

    public MapPane_CarMarkerInfoWindow() throws Throwable {
        if (this.getClass() == MapPane_CarMarkerInfoWindow.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Maps.Google.MapPane+CarMarkerInfoWindow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public MapPane_CarMarkerInfoWindow(Context context) throws Throwable {
        if (this.getClass() == MapPane_CarMarkerInfoWindow.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Maps.Google.MapPane+CarMarkerInfoWindow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    private native View n_getInfoContents(Marker var1);

    private native View n_getInfoWindow(Marker var1);

    public View getInfoContents(Marker marker) {
        return super.n_getInfoContents(marker);
    }

    public View getInfoWindow(Marker marker) {
        return super.n_getInfoWindow(marker);
    }

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
}

