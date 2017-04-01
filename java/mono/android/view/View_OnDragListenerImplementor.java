/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.DragEvent
 *  android.view.View
 *  android.view.View$OnDragListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view;

import android.view.DragEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class View_OnDragListenerImplementor
implements View.OnDragListener,
IGCUserPeer {
    public static final String __md_methods = "n_onDrag:(Landroid/view/View;Landroid/view/DragEvent;)Z:GetOnDrag_Landroid_view_View_Landroid_view_DragEvent_Handler:Android.Views.View/IOnDragListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.View+IOnDragListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", View_OnDragListenerImplementor.class, __md_methods);
    }

    public View_OnDragListenerImplementor() throws Throwable {
        if (this.getClass() == View_OnDragListenerImplementor.class) {
            TypeManager.Activate("Android.Views.View+IOnDragListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native boolean n_onDrag(View var1, DragEvent var2);

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

    public boolean onDrag(View view, DragEvent dragEvent) {
        return super.n_onDrag(view, dragEvent);
    }
}

