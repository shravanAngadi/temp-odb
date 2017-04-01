/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.animation;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ValueAnimator_AnimatorUpdateListenerImplementor
implements ValueAnimator.AnimatorUpdateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onAnimationUpdate:(Landroid/animation/ValueAnimator;)V:GetOnAnimationUpdate_Landroid_animation_ValueAnimator_Handler:Android.Animation.ValueAnimator/IAnimatorUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Animation.ValueAnimator+IAnimatorUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ValueAnimator_AnimatorUpdateListenerImplementor.class, __md_methods);
    }

    public ValueAnimator_AnimatorUpdateListenerImplementor() throws Throwable {
        if (this.getClass() == ValueAnimator_AnimatorUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.ValueAnimator+IAnimatorUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onAnimationUpdate(ValueAnimator var1);

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

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        super.n_onAnimationUpdate(valueAnimator);
    }
}

