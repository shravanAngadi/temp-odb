/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5bb7ee07fc57ad387ac577b3c0b2d7da2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class StaticApplication_CZa
implements Application.ActivityLifecycleCallbacks,
IGCUserPeer {
    public static final String __md_methods = "n_onActivityCreated:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivityDestroyed:(Landroid/app/Activity;)V:GetOnActivityDestroyed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivityPaused:(Landroid/app/Activity;)V:GetOnActivityPaused_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivityResumed:(Landroid/app/Activity;)V:GetOnActivityResumed_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivitySaveInstanceState:(Landroid/app/Activity;Landroid/os/Bundle;)V:GetOnActivitySaveInstanceState_Landroid_app_Activity_Landroid_os_Bundle_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivityStarted:(Landroid/app/Activity;)V:GetOnActivityStarted_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onActivityStopped:(Landroid/app/Activity;)V:GetOnActivityStopped_Landroid_app_Activity_Handler:Android.App.Application/IActivityLifecycleCallbacksInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.StaticApplication+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", StaticApplication_CZa.class, __md_methods);
    }

    public StaticApplication_CZa() throws Throwable {
        if (this.getClass() == StaticApplication_CZa.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.StaticApplication+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onActivityCreated(Activity var1, Bundle var2);

    private native void n_onActivityDestroyed(Activity var1);

    private native void n_onActivityPaused(Activity var1);

    private native void n_onActivityResumed(Activity var1);

    private native void n_onActivitySaveInstanceState(Activity var1, Bundle var2);

    private native void n_onActivityStarted(Activity var1);

    private native void n_onActivityStopped(Activity var1);

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

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.n_onActivityCreated(activity, bundle);
    }

    public void onActivityDestroyed(Activity activity) {
        super.n_onActivityDestroyed(activity);
    }

    public void onActivityPaused(Activity activity) {
        super.n_onActivityPaused(activity);
    }

    public void onActivityResumed(Activity activity) {
        super.n_onActivityResumed(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        super.n_onActivitySaveInstanceState(activity, bundle);
    }

    public void onActivityStarted(Activity activity) {
        super.n_onActivityStarted(activity);
    }

    public void onActivityStopped(Activity activity) {
        super.n_onActivityStopped(activity);
    }
}

