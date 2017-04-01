/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.inputmethodservice.KeyboardView
 *  android.inputmethodservice.KeyboardView$OnKeyboardActionListener
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.inputmethodservice;

import android.inputmethodservice.KeyboardView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class KeyboardView_OnKeyboardActionListenerImplementor
implements KeyboardView.OnKeyboardActionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onKey:(I[I)V:GetOnKey_IarrayIHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPress:(I)V:GetOnPress_IHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRelease:(I)V:GetOnRelease_IHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onText:(Ljava/lang/CharSequence;)V:GetOnText_Ljava_lang_CharSequence_Handler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeDown:()V:GetSwipeDownHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeLeft:()V:GetSwipeLeftHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeRight:()V:GetSwipeRightHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_swipeUp:()V:GetSwipeUpHandler:Android.InputMethodServices.KeyboardView/IOnKeyboardActionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.InputMethodServices.KeyboardView+IOnKeyboardActionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", KeyboardView_OnKeyboardActionListenerImplementor.class, __md_methods);
    }

    public KeyboardView_OnKeyboardActionListenerImplementor() throws Throwable {
        if (this.getClass() == KeyboardView_OnKeyboardActionListenerImplementor.class) {
            TypeManager.Activate("Android.InputMethodServices.KeyboardView+IOnKeyboardActionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onKey(int var1, int[] var2);

    private native void n_onPress(int var1);

    private native void n_onRelease(int var1);

    private native void n_onText(CharSequence var1);

    private native void n_swipeDown();

    private native void n_swipeLeft();

    private native void n_swipeRight();

    private native void n_swipeUp();

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

    public void onKey(int n, int[] arrn) {
        super.n_onKey(n, arrn);
    }

    public void onPress(int n) {
        super.n_onPress(n);
    }

    public void onRelease(int n) {
        super.n_onRelease(n);
    }

    public void onText(CharSequence charSequence) {
        super.n_onText(charSequence);
    }

    public void swipeDown() {
        this.n_swipeDown();
    }

    public void swipeLeft() {
        this.n_swipeLeft();
    }

    public void swipeRight() {
        this.n_swipeRight();
    }

    public void swipeUp() {
        this.n_swipeUp();
    }
}

