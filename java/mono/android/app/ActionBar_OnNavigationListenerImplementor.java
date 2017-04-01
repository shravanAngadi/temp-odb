/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.ActionBar
 *  android.app.ActionBar$OnNavigationListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.ActionBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ActionBar_OnNavigationListenerImplementor
implements ActionBar.OnNavigationListener,
IGCUserPeer {
    public static final String __md_methods = "n_onNavigationItemSelected:(IJ)Z:GetOnNavigationItemSelected_IJHandler:Android.App.ActionBar/IOnNavigationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.ActionBar+IOnNavigationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ActionBar_OnNavigationListenerImplementor.class, __md_methods);
    }

    public ActionBar_OnNavigationListenerImplementor() throws Throwable {
        if (this.getClass() == ActionBar_OnNavigationListenerImplementor.class) {
            TypeManager.Activate("Android.App.ActionBar+IOnNavigationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onNavigationItemSelected(int var1, long var2);

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

    public boolean onNavigationItemSelected(int n, long l) {
        return super.n_onNavigationItemSelected(n, l);
    }
}

