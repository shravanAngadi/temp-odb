/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package md5b3b193298007071046f124943de4ecba;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OBDLinkFirmwareVersionsActivity_VersionInformationAdapter
extends ArrayAdapter
implements View.OnClickListener,
CompoundButton.OnCheckedChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\nn_onCheckedChanged:(Landroid/widget/CompoundButton;Z)V:GetOnCheckedChanged_Landroid_widget_CompoundButton_ZHandler:Android.Widget.CompoundButton/IOnCheckedChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareVersionsActivity+VersionInformationAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", OBDLinkFirmwareVersionsActivity_VersionInformationAdapter.class, __md_methods);
    }

    public OBDLinkFirmwareVersionsActivity_VersionInformationAdapter(Context context, int n, List list) throws Throwable {
        super(context, n, list);
        if (this.getClass() == OBDLinkFirmwareVersionsActivity_VersionInformationAdapter.class) {
            Object[] arrobject = new Object[]{context, n, list};
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareVersionsActivity+VersionInformationAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    public OBDLinkFirmwareVersionsActivity_VersionInformationAdapter(Context context, int n, Object[] arrobject) throws Throwable {
        super(context, n, arrobject);
        if (this.getClass() == OBDLinkFirmwareVersionsActivity_VersionInformationAdapter.class) {
            Object[] arrobject2 = new Object[]{context, n, arrobject};
            TypeManager.Activate("OCTech.Mobile.Applications.Settings.OBDLink.OBDLinkFirmwareVersionsActivity+VersionInformationAdapter, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, arrobject2);
        }
    }

    private native View n_getView(int var1, View var2, ViewGroup var3);

    private native void n_onCheckedChanged(CompoundButton var1, boolean var2);

    private native void n_onClick(View var1);

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

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        super.n_onCheckedChanged(compoundButton, bl);
    }

    public void onClick(View view) {
        super.n_onClick(view);
    }
}

