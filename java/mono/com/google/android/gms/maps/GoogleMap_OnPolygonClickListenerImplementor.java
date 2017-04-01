/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnPolygonClickListener
 *  com.google.android.gms.maps.model.Polygon
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GoogleMap_OnPolygonClickListenerImplementor
implements GoogleMap.OnPolygonClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPolygonClick:(Lcom/google/android/gms/maps/model/Polygon;)V:GetOnPolygonClick_Lcom_google_android_gms_maps_model_Polygon_Handler:Android.Gms.Maps.GoogleMap/IOnPolygonClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Gms.Maps.GoogleMap+IOnPolygonClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleMap_OnPolygonClickListenerImplementor.class, __md_methods);
    }

    public GoogleMap_OnPolygonClickListenerImplementor() throws Throwable {
        if (this.getClass() == GoogleMap_OnPolygonClickListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Maps.GoogleMap+IOnPolygonClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onPolygonClick(Polygon var1);

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

    public void onPolygonClick(Polygon polygon) {
        super.n_onPolygonClick(polygon);
    }
}

