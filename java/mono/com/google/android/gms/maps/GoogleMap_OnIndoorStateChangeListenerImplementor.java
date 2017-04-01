/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.GoogleMap$OnIndoorStateChangeListener
 *  com.google.android.gms.maps.model.IndoorBuilding
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.IndoorBuilding;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class GoogleMap_OnIndoorStateChangeListenerImplementor
implements GoogleMap.OnIndoorStateChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onIndoorBuildingFocused:()V:GetOnIndoorBuildingFocusedHandler:Android.Gms.Maps.GoogleMap/IOnIndoorStateChangeListenerInvoker, Xamarin.GooglePlayServices.Maps\nn_onIndoorLevelActivated:(Lcom/google/android/gms/maps/model/IndoorBuilding;)V:GetOnIndoorLevelActivated_Lcom_google_android_gms_maps_model_IndoorBuilding_Handler:Android.Gms.Maps.GoogleMap/IOnIndoorStateChangeListenerInvoker, Xamarin.GooglePlayServices.Maps\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Gms.Maps.GoogleMap+IOnIndoorStateChangeListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GoogleMap_OnIndoorStateChangeListenerImplementor.class, __md_methods);
    }

    public GoogleMap_OnIndoorStateChangeListenerImplementor() throws Throwable {
        if (this.getClass() == GoogleMap_OnIndoorStateChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Gms.Maps.GoogleMap+IOnIndoorStateChangeListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onIndoorBuildingFocused();

    private native void n_onIndoorLevelActivated(IndoorBuilding var1);

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

    public void onIndoorBuildingFocused() {
        this.n_onIndoorBuildingFocused();
    }

    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        super.n_onIndoorLevelActivated(indoorBuilding);
    }
}

