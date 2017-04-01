/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5d9c7dcdbb54f423705a76e65ea476b4a;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RoundColorPickerView
extends View
implements IGCUserPeer {
    public static final String __md_methods = "n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\nn_onMeasure:(II)V:GetOnMeasure_IIHandler\nn_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n";
    private ArrayList refList;

    static {
        Runtime.register("MonoDroid.ColorPickers.RoundColorPickerView, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", RoundColorPickerView.class, __md_methods);
    }

    public RoundColorPickerView(Context context) throws Throwable {
        super(context);
        if (this.getClass() == RoundColorPickerView.class) {
            TypeManager.Activate("MonoDroid.ColorPickers.RoundColorPickerView, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public RoundColorPickerView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == RoundColorPickerView.class) {
            TypeManager.Activate("MonoDroid.ColorPickers.RoundColorPickerView, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public RoundColorPickerView(Context context, AttributeSet attributeSet, int n) throws Throwable {
        super(context, attributeSet, n);
        if (this.getClass() == RoundColorPickerView.class) {
            Object[] arrobject = new Object[]{context, attributeSet, n};
            TypeManager.Activate("MonoDroid.ColorPickers.RoundColorPickerView, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    private native void n_onDraw(Canvas var1);

    private native void n_onMeasure(int var1, int var2);

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

    public void onMeasure(int n, int n2) {
        super.n_onMeasure(n, n2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.n_onTouchEvent(motionEvent);
    }
}

