/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AdapterView_OnItemSelectedListenerImplementor
implements AdapterView.OnItemSelectedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onItemSelected:(Landroid/widget/AdapterView;Landroid/view/View;IJ)V:GetOnItemSelected_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemSelectedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onNothingSelected:(Landroid/widget/AdapterView;)V:GetOnNothingSelected_Landroid_widget_AdapterView_Handler:Android.Widget.AdapterView/IOnItemSelectedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.AdapterView+IOnItemSelectedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AdapterView_OnItemSelectedListenerImplementor.class, __md_methods);
    }

    public AdapterView_OnItemSelectedListenerImplementor() throws Throwable {
        if (this.getClass() == AdapterView_OnItemSelectedListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.AdapterView+IOnItemSelectedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onItemSelected(AdapterView var1, View var2, int var3, long var4);

    private native void n_onNothingSelected(AdapterView var1);

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

    public void onItemSelected(AdapterView adapterView, View view, int n, long l) {
        super.n_onItemSelected(adapterView, view, n, l);
    }

    public void onNothingSelected(AdapterView adapterView) {
        super.n_onNothingSelected(adapterView);
    }
}

