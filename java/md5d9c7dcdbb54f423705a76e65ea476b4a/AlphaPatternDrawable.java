/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5d9c7dcdbb54f423705a76e65ea476b4a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AlphaPatternDrawable
extends Drawable
implements IGCUserPeer {
    public static final String __md_methods = "n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\nn_onBoundsChange:(Landroid/graphics/Rect;)V:GetOnBoundsChange_Landroid_graphics_Rect_Handler\nn_setAlpha:(I)V:GetSetAlpha_IHandler\nn_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\nn_getOpacity:()I:GetGetOpacityHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("MonoDroid.ColorPickers.AlphaPatternDrawable, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", AlphaPatternDrawable.class, __md_methods);
    }

    public AlphaPatternDrawable() throws Throwable {
        if (this.getClass() == AlphaPatternDrawable.class) {
            TypeManager.Activate("MonoDroid.ColorPickers.AlphaPatternDrawable, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public AlphaPatternDrawable(int n) throws Throwable {
        if (this.getClass() == AlphaPatternDrawable.class) {
            Object[] arrobject = new Object[]{n};
            TypeManager.Activate("MonoDroid.ColorPickers.AlphaPatternDrawable, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    private native void n_draw(Canvas var1);

    private native int n_getOpacity();

    private native void n_onBoundsChange(Rect var1);

    private native void n_setAlpha(int var1);

    private native void n_setColorFilter(ColorFilter var1);

    public void draw(Canvas canvas) {
        super.n_draw(canvas);
    }

    public int getOpacity() {
        return this.n_getOpacity();
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

    public void onBoundsChange(Rect rect) {
        super.n_onBoundsChange(rect);
    }

    public void setAlpha(int n) {
        super.n_setAlpha(n);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.n_setColorFilter(colorFilter);
    }
}

