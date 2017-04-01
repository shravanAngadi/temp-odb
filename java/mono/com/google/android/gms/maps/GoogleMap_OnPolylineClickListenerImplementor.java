/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnPolylineClickListener
 *  com.google.android.gms.maps.model.Polyline
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GoogleMap_OnPolylineClickListenerImplementor
implements GoogleMap.OnPolylineClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPolylineClick:(Lcom/google/android/gms/maps/model/Polyline;)V:GetOnPolylineClick_Lcom_google_android_gms_maps_model_Polyline_Handler:Android.Gms.Maps.GoogleMap/IOnPolylineClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Gms.Maps.GoogleMap+IOnPolylineClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleMap_OnPolylineClickListenerImplementor.class, __md_methods);
    }

    public GoogleMap_OnPolylineClickListenerImplementor() throws Throwable {
        if (this.getClass() == GoogleMap_OnPolylineClickListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Maps.GoogleMap+IOnPolylineClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onPolylineClick(Polyline var1);

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

    public void onPolylineClick(Polyline polyline) {
        super.n_onPolylineClick(polyline);
    }
}

