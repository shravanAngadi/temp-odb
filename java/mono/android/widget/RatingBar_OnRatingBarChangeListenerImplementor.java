/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  android.widget.RatingBar$OnRatingBarChangeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.widget;

import android.widget.RatingBar;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RatingBar_OnRatingBarChangeListenerImplementor
implements RatingBar.OnRatingBarChangeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onRatingChanged:(Landroid/widget/RatingBar;FZ)V:GetOnRatingChanged_Landroid_widget_RatingBar_FZHandler:Android.Widget.RatingBar/IOnRatingBarChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Widget.RatingBar+IOnRatingBarChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RatingBar_OnRatingBarChangeListenerImplementor.class, __md_methods);
    }

    public RatingBar_OnRatingBarChangeListenerImplementor() throws Throwable {
        if (this.getClass() == RatingBar_OnRatingBarChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Widget.RatingBar+IOnRatingBarChangeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onRatingChanged(RatingBar var1, float var2, boolean var3);

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

    public void onRatingChanged(RatingBar ratingBar, float f, boolean bl) {
        super.n_onRatingChanged(ratingBar, f, bl);
    }
}

