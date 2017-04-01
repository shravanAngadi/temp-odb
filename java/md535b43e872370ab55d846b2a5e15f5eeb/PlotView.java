/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md535b43e872370ab55d846b2a5e15f5eeb;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class PlotView
extends View
implements IGCUserPeer {
    public static final String __md_methods = "n_onKeyDown:(ILandroid/view/KeyEvent;)Z:GetOnKeyDown_ILandroid_view_KeyEvent_Handler\nn_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\nn_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("OxyPlot.XamarinAndroid.PlotView, OxyPlot.XamarinAndroid, Version=2014.1.546.0, Culture=neutral, PublicKeyToken=null", PlotView.class, __md_methods);
    }

    public PlotView(Context context) throws Throwable {
        super(context);
        if (this.getClass() == PlotView.class) {
            TypeManager.Activate("OxyPlot.XamarinAndroid.PlotView, OxyPlot.XamarinAndroid, Version=2014.1.546.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public PlotView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == PlotView.class) {
            TypeManager.Activate("OxyPlot.XamarinAndroid.PlotView, OxyPlot.XamarinAndroid, Version=2014.1.546.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public PlotView(Context context, AttributeSet attributeSet, int n) throws Throwable {
        super(context, attributeSet, n);
        if (this.getClass() == PlotView.class) {
            Object[] arrobject = new Object[]{context, attributeSet, n};
            TypeManager.Activate("OxyPlot.XamarinAndroid.PlotView, OxyPlot.XamarinAndroid, Version=2014.1.546.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    private native void n_onDraw(Canvas var1);

    private native boolean n_onKeyDown(int var1, KeyEvent var2);

    private native boolean n_onTouchEvent(MotionEvent var1);

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

    public void onDraw(Canvas canvas) {
        super.n_onDraw(canvas);
    }

    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        return super.n_onKeyDown(n, keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.n_onTouchEvent(motionEvent);
    }
}

