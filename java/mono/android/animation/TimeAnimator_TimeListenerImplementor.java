/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.TimeAnimator
 *  android.animation.TimeAnimator$TimeListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.animation;

import android.animation.TimeAnimator;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TimeAnimator_TimeListenerImplementor
implements TimeAnimator.TimeListener,
IGCUserPeer {
    public static final String __md_methods = "n_onTimeUpdate:(Landroid/animation/TimeAnimator;JJ)V:GetOnTimeUpdate_Landroid_animation_TimeAnimator_JJHandler:Android.Animation.TimeAnimator/ITimeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Animation.TimeAnimator+ITimeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TimeAnimator_TimeListenerImplementor.class, __md_methods);
    }

    public TimeAnimator_TimeListenerImplementor() throws Throwable {
        if (this.getClass() == TimeAnimator_TimeListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.TimeAnimator+ITimeListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onTimeUpdate(TimeAnimator var1, long var2, long var4);

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

    public void onTimeUpdate(TimeAnimator timeAnimator, long l, long l2) {
        super.n_onTimeUpdate(timeAnimator, l, l2);
    }
}

