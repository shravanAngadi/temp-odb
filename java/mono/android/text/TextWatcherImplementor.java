/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.NoCopySpan
 *  android.text.TextWatcher
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.text;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TextWatcherImplementor
implements NoCopySpan,
TextWatcher,
IGCUserPeer {
    public static final String __md_methods = "n_afterTextChanged:(Landroid/text/Editable;)V:GetAfterTextChanged_Landroid_text_Editable_Handler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_beforeTextChanged:(Ljava/lang/CharSequence;III)V:GetBeforeTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onTextChanged:(Ljava/lang/CharSequence;III)V:GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler:Android.Text.ITextWatcherInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Text.TextWatcherImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TextWatcherImplementor.class, __md_methods);
    }

    public TextWatcherImplementor() throws Throwable {
        if (this.getClass() == TextWatcherImplementor.class) {
            TypeManager.Activate("Android.Text.TextWatcherImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_afterTextChanged(Editable var1);

    private native void n_beforeTextChanged(CharSequence var1, int var2, int var3, int var4);

    private native void n_onTextChanged(CharSequence var1, int var2, int var3, int var4);

    public void afterTextChanged(Editable editable) {
        super.n_afterTextChanged(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
        super.n_beforeTextChanged(charSequence, n, n2, n3);
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

    public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
        super.n_onTextChanged(charSequence, n, n2, n3);
    }
}

