/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$OnProvideAssistDataListener
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Application_OnProvideAssistDataListenerImplementor
implements Application.OnProvideAssistDataListener,
IGCUserPeer {
    public static final String __md_methods = "n_onProvideAssistData:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnProvideAssistData_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IOnProvideAssistDataListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.Application+IOnProvideAssistDataListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Application_OnProvideAssistDataListenerImplementor.class, __md_methods);
    }

    public Application_OnProvideAssistDataListenerImplementor() throws Throwable {
        if (this.getClass() == Application_OnProvideAssistDataListenerImplementor.class) {
            TypeManager.Activate("Android.App.Application+IOnProvideAssistDataListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onProvideAssistData(Activity var1, Bundle var2);

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

    public void onProvideAssistData(Activity activity, Bundle bundle) {
        super.n_onProvideAssistData(activity, bundle);
    }
}

