/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.animation.LayoutTransition$TransitionListener
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.animation;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class LayoutTransition_TransitionListenerImplementor
implements LayoutTransition.TransitionListener,
IGCUserPeer {
    public static final String __md_methods = "n_endTransition:(Landroid/animation/LayoutTransition;Landroid/view/ViewGroup;Landroid/view/View;I)V:GetEndTransition_Landroid_animation_LayoutTransition_Landroid_view_ViewGroup_Landroid_view_View_IHandler:Android.Animation.LayoutTransition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_startTransition:(Landroid/animation/LayoutTransition;Landroid/view/ViewGroup;Landroid/view/View;I)V:GetStartTransition_Landroid_animation_LayoutTransition_Landroid_view_ViewGroup_Landroid_view_View_IHandler:Android.Animation.LayoutTransition/ITransitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Animation.LayoutTransition+ITransitionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", LayoutTransition_TransitionListenerImplementor.class, __md_methods);
    }

    public LayoutTransition_TransitionListenerImplementor() throws Throwable {
        if (this.getClass() == LayoutTransition_TransitionListenerImplementor.class) {
            TypeManager.Activate("Android.Animation.LayoutTransition+ITransitionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_endTransition(LayoutTransition var1, ViewGroup var2, View var3, int var4);

    private native void n_startTransition(LayoutTransition var1, ViewGroup var2, View var3, int var4);

    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int n) {
        super.n_endTransition(layoutTransition, viewGroup, view, n);
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

    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int n) {
        super.n_startTransition(layoutTransition, viewGroup, view, n);
    }
}

