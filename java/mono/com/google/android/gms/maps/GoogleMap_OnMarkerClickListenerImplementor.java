/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnMarkerClickListener
 *  com.google.android.gms.maps.model.Marker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GoogleMap_OnMarkerClickListenerImplementor
implements GoogleMap.OnMarkerClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMarkerClick:(Lcom/google/android/gms/maps/model/Marker;)Z:GetOnMarkerClick_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnMarkerClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Gms.Maps.GoogleMap+IOnMarkerClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleMap_OnMarkerClickListenerImplementor.class, __md_methods);
    }

    public GoogleMap_OnMarkerClickListenerImplementor() throws Throwable {
        if (this.getClass() == GoogleMap_OnMarkerClickListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Maps.GoogleMap+IOnMarkerClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native boolean n_onMarkerClick(Marker var1);

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

    public boolean onMarkerClick(Marker marker) {
        return super.n_onMarkerClick(marker);
    }
}

