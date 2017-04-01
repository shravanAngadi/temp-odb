/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  java.lang.Object
 *  java.util.WeakHashMap
 */
package me.grantland.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import me.grantland.widget.AutofitHelper;
import me.grantland.widget.R;

public class AutofitLayout
extends FrameLayout {
    private boolean mEnabled;
    private WeakHashMap<View, AutofitHelper> mHelpers = new WeakHashMap();
    private float mMinTextSize;
    private float mPrecision;

    public AutofitLayout(Context context) {
        super(context);
        super.init(context, null, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.init(context, attributeSet, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        super.init(context, attributeSet, n);
    }

    private void init(Context context, AttributeSet attributeSet, int n) {
        boolean bl = true;
        int n2 = -1;
        float f = -1.0f;
        if (attributeSet != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AutofitTextView, n, 0);
            bl = typedArray.getBoolean(R.styleable.AutofitTextView_sizeToFit, bl);
            n2 = typedArray.getDimensionPixelSize(R.styleable.AutofitTextView_minTextSize, n2);
            f = typedArray.getFloat(R.styleable.AutofitTextView_precision, f);
            typedArray.recycle();
        }
        this.mEnabled = bl;
        this.mMinTextSize = n2;
        this.mPrecision = f;
    }

    public void addView(View view, int n, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n, layoutParams);
        TextView textView = (TextView)view;
        AutofitHelper autofitHelper = AutofitHelper.create(textView).setEnabled(this.mEnabled);
        if (this.mPrecision > 0.0f) {
            autofitHelper.setPrecision(this.mPrecision);
        }
        if (this.mMinTextSize > 0.0f) {
            autofitHelper.setMinTextSize(0, this.mMinTextSize);
        }
        this.mHelpers.put((Object)textView, (Object)autofitHelper);
    }

    public AutofitHelper getAutofitHelper(int n) {
        return (AutofitHelper)this.mHelpers.get((Object)this.getChildAt(n));
    }

    public AutofitHelper getAutofitHelper(TextView textView) {
        return (AutofitHelper)this.mHelpers.get((Object)textView);
    }
}

