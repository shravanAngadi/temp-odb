/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.SlidingDrawer
 *  android.widget.SlidingDrawer$OnDrawerOpenListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.SlidingDrawer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SlidingDrawer_OnDrawerOpenListenerImplementor
implements SlidingDrawer.OnDrawerOpenListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDrawerOpened:()V:GetOnDrawerOpenedHandler:Android.Widget.SlidingDrawer/IOnDrawerOpenListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.SlidingDrawer+IOnDrawerOpenListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SlidingDrawer_OnDrawerOpenListenerImplementor.class, __md_methods);
    }

    public SlidingDrawer_OnDrawerOpenListenerImplementor() throws Throwable {
        if (this.getClass() == SlidingDrawer_OnDrawerOpenListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.SlidingDrawer+IOnDrawerOpenListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onDrawerOpened();

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

    public void onDrawerOpened() {
        this.n_onDrawerOpened();
    }
}

