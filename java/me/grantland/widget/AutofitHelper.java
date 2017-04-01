/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextWatcher
 *  android.text.method.SingleLineTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package me.grantland.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import me.grantland.widget.R;

public class AutofitHelper {
    private static final int DEFAULT_MIN_TEXT_SIZE = 8;
    private static final float DEFAULT_PRECISION = 0.5f;
    private static final boolean SPEW = false;
    private static final String TAG = "AutoFitTextHelper";
    private boolean mEnabled;
    private boolean mIsAutofitting;
    private ArrayList<OnTextSizeChangeListener> mListeners;
    private int mMaxLines;
    private float mMaxTextSize;
    private float mMinTextSize;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private TextPaint mPaint;
    private float mPrecision;
    private float mTextSize;
    private TextView mTextView;
    private TextWatcher mTextWatcher;

    private AutofitHelper(TextView textView) {
        this.mTextWatcher = new AutofitTextWatcher((AutofitHelper)this, null);
        this.mOnLayoutChangeListener = new AutofitOnLayoutChangeListener((AutofitHelper)this, null);
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.mTextView = textView;
        this.mPaint = new TextPaint();
        super.setRawTextSize(textView.getTextSize());
        this.mMaxLines = AutofitHelper.getMaxLines(textView);
        this.mMinTextSize = 8.0f * f;
        this.mMaxTextSize = this.mTextSize;
        this.mPrecision = 0.5f;
    }

    private void autofit() {
        float f = this.mTextView.getTextSize();
        this.mIsAutofitting = true;
        AutofitHelper.autofit(this.mTextView, this.mPaint, this.mMinTextSize, this.mMaxTextSize, this.mMaxLines, this.mPrecision);
        this.mIsAutofitting = false;
        float f2 = this.mTextView.getTextSize();
        if (f2 != f) {
            this.sendTextSizeChange(f2, f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void autofit(TextView textView, TextPaint textPaint, float f, float f2, int n, float f3) {
        int n2;
        float f4;
        if (n <= 0 || n == Integer.MAX_VALUE || (n2 = textView.getWidth() - textView.getPaddingLeft() - textView.getPaddingRight()) <= 0) {
            return;
        }
        CharSequence charSequence = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, (View)textView);
        }
        Context context = textView.getContext();
        Resources resources = Resources.getSystem();
        float f5 = f4 = f2;
        if (context != null) {
            resources = context.getResources();
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f4);
        if (n == 1 && textPaint.measureText(charSequence, 0, charSequence.length()) > (float)n2 || AutofitHelper.getLineCount(charSequence, textPaint, f4, n2, displayMetrics) > n) {
            f4 = AutofitHelper.getAutofitTextSize(charSequence, textPaint, n2, n, 0.0f, f5, f3, displayMetrics);
        }
        if (f4 < f) {
            f4 = f;
        }
        textView.setTextSize(0, f4);
    }

    public static AutofitHelper create(TextView textView) {
        return AutofitHelper.create(textView, null, 0);
    }

    public static AutofitHelper create(TextView textView, AttributeSet attributeSet) {
        return AutofitHelper.create(textView, attributeSet, 0);
    }

    public static AutofitHelper create(TextView textView, AttributeSet attributeSet, int n) {
        AutofitHelper autofitHelper = new AutofitHelper(textView);
        boolean bl = true;
        if (attributeSet != null) {
            Context context = textView.getContext();
            int n2 = (int)autofitHelper.getMinTextSize();
            float f = autofitHelper.getPrecision();
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AutofitTextView, n, 0);
            bl = typedArray.getBoolean(R.styleable.AutofitTextView_sizeToFit, bl);
            int n3 = typedArray.getDimensionPixelSize(R.styleable.AutofitTextView_minTextSize, n2);
            float f2 = typedArray.getFloat(R.styleable.AutofitTextView_precision, f);
            typedArray.recycle();
            autofitHelper.setMinTextSize(0, n3).setPrecision(f2);
        }
        autofitHelper.setEnabled(bl);
        return autofitHelper;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float getAutofitTextSize(CharSequence charSequence, TextPaint textPaint, float f, int n, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        float f5 = (f2 + f3) / 2.0f;
        int n2 = 1;
        textPaint.setTextSize(TypedValue.applyDimension((int)0, (float)f5, (DisplayMetrics)displayMetrics));
        StaticLayout staticLayout = null;
        if (n != 1) {
            staticLayout = new StaticLayout(charSequence, textPaint, (int)f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            n2 = staticLayout.getLineCount();
        }
        if (n2 > n) {
            if (f3 - f2 < f4) return f2;
            return AutofitHelper.getAutofitTextSize(charSequence, textPaint, f, n, f2, f5, f4, displayMetrics);
        }
        if (n2 < n) {
            return AutofitHelper.getAutofitTextSize(charSequence, textPaint, f, n, f5, f3, f4, displayMetrics);
        }
        float f6 = 0.0f;
        if (n == 1) {
            f6 = textPaint.measureText(charSequence, 0, charSequence.length());
        } else {
            for (int i = 0; i < n2; ++i) {
                if (staticLayout.getLineWidth(i) <= f6) continue;
                f6 = staticLayout.getLineWidth(i);
            }
        }
        if (f3 - f2 < f4) {
            return f2;
        }
        if (f6 > f) {
            return AutofitHelper.getAutofitTextSize(charSequence, textPaint, f, n, f2, f5, f4, displayMetrics);
        }
        if (f6 >= f) return f5;
        return AutofitHelper.getAutofitTextSize(charSequence, textPaint, f, n, f5, f3, f4, displayMetrics);
    }

    private static int getLineCount(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension((int)0, (float)f, (DisplayMetrics)displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int)f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int getMaxLines(TextView textView) {
        int n = -1;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod != null && transformationMethod instanceof SingleLineTransformationMethod) {
            return 1;
        }
        if (Build.VERSION.SDK_INT < 16) return n;
        return textView.getMaxLines();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void sendTextSizeChange(float f, float f2) {
        if (this.mListeners != null) {
            Iterator iterator = this.mListeners.iterator();
            while (iterator.hasNext()) {
                ((OnTextSizeChangeListener)iterator.next()).onTextSizeChange(f, f2);
            }
        }
    }

    private void setRawMaxTextSize(float f) {
        if (f != this.mMaxTextSize) {
            this.mMaxTextSize = f;
            super.autofit();
        }
    }

    private void setRawMinTextSize(float f) {
        if (f != this.mMinTextSize) {
            this.mMinTextSize = f;
            super.autofit();
        }
    }

    private void setRawTextSize(float f) {
        if (this.mTextSize != f) {
            this.mTextSize = f;
        }
    }

    public AutofitHelper addOnTextSizeChangeListener(OnTextSizeChangeListener onTextSizeChangeListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add((Object)onTextSizeChangeListener);
        return this;
    }

    public int getMaxLines() {
        return this.mMaxLines;
    }

    public float getMaxTextSize() {
        return this.mMaxTextSize;
    }

    public float getMinTextSize() {
        return this.mMinTextSize;
    }

    public float getPrecision() {
        return this.mPrecision;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public AutofitHelper removeOnTextSizeChangeListener(OnTextSizeChangeListener onTextSizeChangeListener) {
        if (this.mListeners != null) {
            this.mListeners.remove((Object)onTextSizeChangeListener);
        }
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public AutofitHelper setEnabled(boolean bl) {
        if (this.mEnabled == bl) return this;
        this.mEnabled = bl;
        if (bl) {
            this.mTextView.addTextChangedListener(this.mTextWatcher);
            this.mTextView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
            super.autofit();
            return this;
        }
        this.mTextView.removeTextChangedListener(this.mTextWatcher);
        this.mTextView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        this.mTextView.setTextSize(0, this.mTextSize);
        return this;
    }

    public AutofitHelper setMaxLines(int n) {
        if (this.mMaxLines != n) {
            this.mMaxLines = n;
            super.autofit();
        }
        return this;
    }

    public AutofitHelper setMaxTextSize(float f) {
        return this.setMaxTextSize(2, f);
    }

    public AutofitHelper setMaxTextSize(int n, float f) {
        Context context = this.mTextView.getContext();
        Resources resources = Resources.getSystem();
        if (context != null) {
            resources = context.getResources();
        }
        super.setRawMaxTextSize(TypedValue.applyDimension((int)n, (float)f, (DisplayMetrics)resources.getDisplayMetrics()));
        return this;
    }

    public AutofitHelper setMinTextSize(float f) {
        return this.setMinTextSize(2, f);
    }

    public AutofitHelper setMinTextSize(int n, float f) {
        Context context = this.mTextView.getContext();
        Resources resources = Resources.getSystem();
        if (context != null) {
            resources = context.getResources();
        }
        super.setRawMinTextSize(TypedValue.applyDimension((int)n, (float)f, (DisplayMetrics)resources.getDisplayMetrics()));
        return this;
    }

    public AutofitHelper setPrecision(float f) {
        if (this.mPrecision != f) {
            this.mPrecision = f;
            super.autofit();
        }
        return this;
    }

    public void setTextSize(float f) {
        this.setTextSize(2, f);
    }

    public void setTextSize(int n, float f) {
        if (this.mIsAutofitting) {
            return;
        }
        Context context = this.mTextView.getContext();
        Resources resources = Resources.getSystem();
        if (context != null) {
            resources = context.getResources();
        }
        super.setRawTextSize(TypedValue.applyDimension((int)n, (float)f, (DisplayMetrics)resources.getDisplayMetrics()));
    }

    private class AutofitOnLayoutChangeListener
    implements View.OnLayoutChangeListener {
        final /* synthetic */ AutofitHelper this$0;

        private AutofitOnLayoutChangeListener(AutofitHelper autofitHelper) {
            this.this$0 = autofitHelper;
        }

        /* synthetic */ AutofitOnLayoutChangeListener(AutofitHelper autofitHelper,  var2_2) {
            super(autofitHelper);
        }

        public void onLayoutChange(View view, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
            this.this$0.autofit();
        }
    }

    private class AutofitTextWatcher
    implements TextWatcher {
        final /* synthetic */ AutofitHelper this$0;

        private AutofitTextWatcher(AutofitHelper autofitHelper) {
            this.this$0 = autofitHelper;
        }

        /* synthetic */ AutofitTextWatcher(AutofitHelper autofitHelper,  var2_2) {
            super(autofitHelper);
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
        }

        public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
            this.this$0.autofit();
        }
    }

    public static interface OnTextSizeChangeListener {
        public void onTextSizeChange(float var1, float var2);
    }

}

