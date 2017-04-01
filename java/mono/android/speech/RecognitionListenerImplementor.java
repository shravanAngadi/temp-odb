/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.speech.RecognitionListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.speech;

import android.os.Bundle;
import android.speech.RecognitionListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RecognitionListenerImplementor
implements RecognitionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onBeginningOfSpeech:()V:GetOnBeginningOfSpeechHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onBufferReceived:([B)V:GetOnBufferReceived_arrayBHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onEndOfSpeech:()V:GetOnEndOfSpeechHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onError:(I)V:GetOnError_IHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onEvent:(ILandroid/os/Bundle;)V:GetOnEvent_ILandroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPartialResults:(Landroid/os/Bundle;)V:GetOnPartialResults_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onReadyForSpeech:(Landroid/os/Bundle;)V:GetOnReadyForSpeech_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onResults:(Landroid/os/Bundle;)V:GetOnResults_Landroid_os_Bundle_Handler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRmsChanged:(F)V:GetOnRmsChanged_FHandler:Android.Speech.IRecognitionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Speech.IRecognitionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", RecognitionListenerImplementor.class, __md_methods);
    }

    public RecognitionListenerImplementor() throws Throwable {
        if (this.getClass() == RecognitionListenerImplementor.class) {
            TypeManager.Activate("Android.Speech.IRecognitionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onBeginningOfSpeech();

    private native void n_onBufferReceived(byte[] var1);

    private native void n_onEndOfSpeech();

    private native void n_onError(int var1);

    private native void n_onEvent(int var1, Bundle var2);

    private native void n_onPartialResults(Bundle var1);

    private native void n_onReadyForSpeech(Bundle var1);

    private native void n_onResults(Bundle var1);

    private native void n_onRmsChanged(float var1);

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

    public void onBeginningOfSpeech() {
        this.n_onBeginningOfSpeech();
    }

    public void onBufferReceived(byte[] arrby) {
        super.n_onBufferReceived(arrby);
    }

    public void onEndOfSpeech() {
        this.n_onEndOfSpeech();
    }

    public void onError(int n) {
        super.n_onError(n);
    }

    public void onEvent(int n, Bundle bundle) {
        super.n_onEvent(n, bundle);
    }

    public void onPartialResults(Bundle bundle) {
        super.n_onPartialResults(bundle);
    }

    public void onReadyForSpeech(Bundle bundle) {
        super.n_onReadyForSpeech(bundle);
    }

    public void onResults(Bundle bundle) {
        super.n_onResults(bundle);
    }

    public void onRmsChanged(float f) {
        super.n_onRmsChanged(f);
    }
}

