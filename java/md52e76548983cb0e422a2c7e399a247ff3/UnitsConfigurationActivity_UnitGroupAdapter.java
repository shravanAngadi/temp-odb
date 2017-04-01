/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package md52e76548983cb0e422a2c7e399a247ff3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class UnitsConfigurationActivity_UnitGroupAdapter
extends ArrayAdapter
implements AdapterView.OnItemSelectedListener,
IGCUserPeer {
    public static final String __md_methods = "n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\nn_onItemSelected:(Landroid/widget/AdapterView;Landroid/view/View;IJ)V:GetOnItemSelected_Landroid_widget_AdapterView_Landroid_view_View_IJHandler:Android.Widget.AdapterView/IOnItemSelectedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onNothingSelected:(Landroid/widget/AdapterView;)V:GetOnNothingSelected_Landroid_widget_AdapterView_Handler:Android.Widget.AdapterView/IOnItemSelectedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.UnitsConfigurationActivity+UnitGroupAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", UnitsConfigurationActivity_UnitGroupAdapter.class, __md_methods);
    }

    public UnitsConfigurationActivity_UnitGroupAdapter(Context context, int n, List list) throws Throwable {
        super(context, n, list);
        if (this.getClass() == UnitsConfigurationActivity_UnitGroupAdapter.class) {
            Object[] arrobject = new Object[]{context, n, list};
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.UnitsConfigurationActivity+UnitGroupAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    public UnitsConfigurationActivity_UnitGroupAdapter(Context context, int n, Object[] arrobject) throws Throwable {
        super(context, n, arrobject);
        if (this.getClass() == UnitsConfigurationActivity_UnitGroupAdapter.class) {
            Object[] arrobject2 = new Object[]{context, n, arrobject};
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.UnitsConfigurationActivity+UnitGroupAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, arrobject2);
        }
    }

    private native View n_getView(int var1, View var2, ViewGroup var3);

    private native void n_onItemSelected(AdapterView var1, View var2, int var3, long var4);

    private native void n_onNothingSelected(AdapterView var1);

    public View getView(int n, View view, ViewGroup viewGroup) {
        return super.n_getView(n, view, viewGroup);
    }

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

