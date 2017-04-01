/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v4.view.PagerAdapter
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5d872ee2fe6753a40a6bfb267bdb9f087;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import java.util.ArrayList;
import md5d872ee2fe6753a40a6bfb267bdb9f087.tsf;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class tsf_CZa
extends PagerAdapter
implements IGCUserPeer {
    public static final String __md_methods = "n_getCount:()I:GetGetCountHandler\nn_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\nn_instantiateItem:(Landroid/view/View;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_View_IHandler\nn_destroyItem:(Landroid/view/View;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_View_ILjava_lang_Object_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("h.tsf+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", tsf_CZa.class, __md_methods);
    }

    public tsf_CZa() throws Throwable {
        if (this.getClass() == tsf_CZa.class) {
            TypeManager.Activate("h.tsf+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public tsf_CZa(tsf tsf2) throws Throwable {
        if (this.getClass() == tsf_CZa.class) {
            TypeManager.Activate("h.tsf+CZa, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "h.tsf, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", this, new Object[]{tsf2});
        }
    }

    private native void n_destroyItem(View var1, int var2, Object var3);

    private native int n_getCount();

    private native Object n_instantiateItem(View var1, int var2);

    private native boolean n_isViewFromObject(View var1, Object var2);

    public void destroyItem(View view, int n, Object object) {
        super.n_destroyItem(view, n, object);
    }

    public int getCount() {
        return this.n_getCount();
    }

    public Object instantiateItem(View view, int n) {
        return super.n_instantiateItem(view, n);
    }

    public boolean isViewFromObject(View view, Object object) {
        return super.n_isViewFromObject(view, object);
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

