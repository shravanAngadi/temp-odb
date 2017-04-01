/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActionBar
 *  android.app.ActionBar$Tab
 *  android.app.ActionBar$TabListener
 *  android.app.FragmentTransaction
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md531fcd0657984dc82ef34d3ddabba469a;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import java.util.ArrayList;
import md531fcd0657984dc82ef34d3ddabba469a.cma;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public abstract class nfa
extends cma
implements ActionBar.TabListener,
IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onStart:()V:GetOnStartHandler\nn_onStop:()V:GetOnStopHandler\nn_onDestroy:()V:GetOnDestroyHandler\nn_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\nn_onTabReselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabReselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabSelected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabSelected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTabUnselected:(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V:GetOnTabUnselected_Landroid_app_ActionBar_Tab_Landroid_app_FragmentTransaction_Handler:Android.App.ActionBar/ITabListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("B.nfa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", nfa.class, __md_methods);
    }

    public nfa() throws Throwable {
        if (this.getClass() == nfa.class) {
            TypeManager.Activate("B.nfa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onCreate(Bundle var1);

    private native void n_onDestroy();

    private native void n_onSaveInstanceState(Bundle var1);

    private native void n_onStart();

    private native void n_onStop();

    private native void n_onTabReselected(ActionBar.Tab var1, FragmentTransaction var2);

    private native void n_onTabSelected(ActionBar.Tab var1, FragmentTransaction var2);

    private native void n_onTabUnselected(ActionBar.Tab var1, FragmentTransaction var2);

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

    public void onCreate(Bundle bundle) {
        super.n_onCreate(bundle);
    }

    public void onDestroy() {
        this.n_onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.n_onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.n_onStart();
    }

    public void onStop() {
        this.n_onStop();
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        super.n_onTabReselected(tab, fragmentTransaction);
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        super.n_onTabSelected(tab, fragmentTransaction);
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        super.n_onTabUnselected(tab, fragmentTransaction);
    }
}

