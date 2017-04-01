/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.textservice.SentenceSuggestionsInfo
 *  android.view.textservice.SpellCheckerSession
 *  android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener
 *  android.view.textservice.SuggestionsInfo
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.view.textservice;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SpellCheckerSession_SpellCheckerSessionListenerImplementor
implements SpellCheckerSession.SpellCheckerSessionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onGetSentenceSuggestions:([Landroid/view/textservice/SentenceSuggestionsInfo;)V:GetOnGetSentenceSuggestions_arrayLandroid_view_textservice_SentenceSuggestionsInfo_Handler:Android.Views.TextService.SpellCheckerSession/ISpellCheckerSessionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onGetSuggestions:([Landroid/view/textservice/SuggestionsInfo;)V:GetOnGetSuggestions_arrayLandroid_view_textservice_SuggestionsInfo_Handler:Android.Views.TextService.SpellCheckerSession/ISpellCheckerSessionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Views.TextService.SpellCheckerSession+ISpellCheckerSessionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SpellCheckerSession_SpellCheckerSessionListenerImplementor.class, __md_methods);
    }

    public SpellCheckerSession_SpellCheckerSessionListenerImplementor() throws Throwable {
        if (this.getClass() == SpellCheckerSession_SpellCheckerSessionListenerImplementor.class) {
            TypeManager.Activate("Android.Views.TextService.SpellCheckerSession+ISpellCheckerSessionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onGetSentenceSuggestions(SentenceSuggestionsInfo[] var1);

    private native void n_onGetSuggestions(SuggestionsInfo[] var1);

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

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] arrsentenceSuggestionsInfo) {
        super.n_onGetSentenceSuggestions(arrsentenceSuggestionsInfo);
    }

    public void onGetSuggestions(SuggestionsInfo[] arrsuggestionsInfo) {
        super.n_onGetSuggestions(arrsuggestionsInfo);
    }
}

