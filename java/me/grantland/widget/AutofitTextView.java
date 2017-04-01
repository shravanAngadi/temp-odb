/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.TextView
 */
package me.grantland.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import me.grantland.widget.AutofitHelper;

public class AutofitTextView
extends TextView
implements AutofitHelper.OnTextSizeChangeListener {
    private AutofitHelper mHelper;

    public AutofitTextView(Context context) {
        super(context);
        super.init(context, null, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.init(context, attributeSet, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        super.init(context, attributeSet, n);
    }

    private void init(Context context, AttributeSet attributeSet, int n) {
        this.mHelper = AutofitHelper.create((TextView)this, attributeSet, n).addOnTextSizeChangeListener((AutofitHelper.OnTextSizeChangeListener)this);
    }

    public AutofitHelper getAutofitHelper() {
        return this.mHelper;
    }

    public float getMaxTextSize() {
        return this.mHelper.getMaxTextSize();
    }

    public float getMinTextSize() {
        return this.mHelper.getMinTextSize();
    }

    public float getPrecision() {
        return this.mHelper.getPrecision();
    }

    public boolean isSizeToFit() {
        return this.mHelper.isEnabled();
    }

    @Override
    public void onTextSizeChange(float f, float f2) {
    }

    public void setLines(int n) {
        super.setLines(n);
        if (this.mHelper != null) {
            this.mHelper.setMaxLines(n);
        }
    }

    public void setMaxLines(int n) {
        super.setMaxLines(n);
        if (this.mHelper != null) {
            this.mHelper.setMaxLines(n);
        }
    }

    public void setMaxTextSize(float f) {
        this.mHelper.setMaxTextSize(f);
    }

    public void setMaxTextSize(int n, float f) {
        this.mHelper.setMaxTextSize(n, f);
    }

    public void setMinTextSize(int n) {
        this.mHelper.setMinTextSize(2, n);
    }

    public void setMinTextSize(int n, float f) {
        this.mHelper.setMinTextSize(n, f);
    }

    public void setPrecision(float f) {
        this.mHelper.setPrecision(f);
    }

    public void setSizeToFit() {
        this.setSizeToFit(true);
    }

    public void setSizeToFit(boolean bl) {
        this.mHelper.setEnabled(bl);
    }

    public void setTextSize(int n, float f) {
        super.setTextSize(n, f);
        if (this.mHelper != null) {
            this.mHelper.setTextSize(n, f);
        }
    }
}

