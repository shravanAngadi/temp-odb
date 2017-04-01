/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.speech.tts.TextToSpeech
 *  android.speech.tts.TextToSpeech$OnUtteranceCompletedListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.speech.tts;

import android.speech.tts.TextToSpeech;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class TextToSpeech_OnUtteranceCompletedListenerImplementor
implements TextToSpeech.OnUtteranceCompletedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onUtteranceCompleted:(Ljava/lang/String;)V:GetOnUtteranceCompleted_Ljava_lang_String_Handler:Android.Speech.Tts.TextToSpeech/IOnUtteranceCompletedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Speech.Tts.TextToSpeech+IOnUtteranceCompletedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", TextToSpeech_OnUtteranceCompletedListenerImplementor.class, __md_methods);
    }

    public TextToSpeech_OnUtteranceCompletedListenerImplementor() throws Throwable {
        if (this.getClass() == TextToSpeech_OnUtteranceCompletedListenerImplementor.class) {
            TypeManager.Activate("Android.Speech.Tts.TextToSpeech+IOnUtteranceCompletedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onUtteranceCompleted(String var1);

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

    public void onUtteranceCompleted(String string2) {
        super.n_onUtteranceCompleted(string2);
    }
}

