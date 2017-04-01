/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.support.v4.view.ViewPager
 *  android.support.v4.view.ViewPager$OnPageChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.support.v4.view;

import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewPager_OnPageChangeListenerImplementor
implements ViewPager.OnPageChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\nn_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\nn_onPageSelected:(I)V:GetOnPageSelected_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Support.V4.View.ViewPager+IOnPageChangeListenerImplementor, Xamarin.Android.Support.v4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ViewPager_OnPageChangeListenerImplementor.class, __md_methods);
    }

    public ViewPager_OnPageChangeListenerImplementor() throws Throwable {
        if (this.getClass() == ViewPager_OnPageChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.View.ViewPager+IOnPageChangeListenerImplementor, Xamarin.Android.Support.v4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    private native void n_onPageScrollStateChanged(int var1);

    private native void n_onPageScrolled(int var1, float var2, int var3);

    private native void n_onPageSelected(int var1);

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

    public void onPageScrollStateChanged(int n) {
        super.n_onPageScrollStateChanged(n);
    }

    public void onPageScrolled(int n, float f, int n2) {
        super.n_onPageScrolled(n, f, n2);
    }

    public void onPageSelected(int n) {
        super.n_onPageSelected(n);
    }
}

