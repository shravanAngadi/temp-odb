/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnInfoWindowClickListener
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

public class GoogleMap_OnInfoWindowClickListenerImplementor
implements GoogleMap.OnInfoWindowClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onInfoWindowClick:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnInfoWindowClick_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnInfoWindowClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Gms.Maps.GoogleMap+IOnInfoWindowClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleMap_OnInfoWindowClickListenerImplementor.class, __md_methods);
    }

    public GoogleMap_OnInfoWindowClickListenerImplementor() throws Throwable {
        if (this.getClass() == GoogleMap_OnInfoWindowClickListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Maps.GoogleMap+IOnInfoWindowClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onInfoWindowClick(Marker var1);

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

    public void onInfoWindowClick(Marker marker) {
        super.n_onInfoWindowClick(marker);
    }
}

