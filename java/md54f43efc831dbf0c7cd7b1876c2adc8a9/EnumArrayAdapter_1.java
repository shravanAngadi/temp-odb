/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package md54f43efc831dbf0c7cd7b1876c2adc8a9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class EnumArrayAdapter_1
extends ArrayAdapter
implements IGCUserPeer {
    public static final String __md_methods = "n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\nn_getDropDownView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetDropDownView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Adapters.EnumArrayAdapter`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", EnumArrayAdapter_1.class, __md_methods);
    }

    public EnumArrayAdapter_1(Context context, int n, List list) throws Throwable {
        super(context, n, list);
        if (this.getClass() == EnumArrayAdapter_1.class) {
            Object[] arrobject = new Object[]{context, n, list};
            TypeManager.Activate("OCTech.Mobile.Applications.Adapters.EnumArrayAdapter`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    public EnumArrayAdapter_1(Context context, int n, Object[] arrobject) throws Throwable {
        super(context, n, arrobject);
        if (this.getClass() == EnumArrayAdapter_1.class) {
            Object[] arrobject2 = new Object[]{context, n, arrobject};
            TypeManager.Activate("OCTech.Mobile.Applications.Adapters.EnumArrayAdapter`1, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, arrobject2);
        }
    }

    private native View n_getDropDownView(int var1, View var2, ViewGroup var3);

    private native View n_getView(int var1, View var2, ViewGroup var3);

    public View getDropDownView(int n, View view, ViewGroup viewGroup) {
        return super.n_getDropDownView(n, view, viewGroup);
    }

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
}

