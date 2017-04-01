/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.net.sip.SipRegistrationListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.net.sip;

import android.net.sip.SipRegistrationListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SipRegistrationListenerImplementor
implements SipRegistrationListener,
IGCUserPeer {
    public static final String __md_methods = "n_onRegistering:(Ljava/lang/String;)V:GetOnRegistering_Ljava_lang_String_Handler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRegistrationDone:(Ljava/lang/String;J)V:GetOnRegistrationDone_Ljava_lang_String_JHandler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRegistrationFailed:(Ljava/lang/String;ILjava/lang/String;)V:GetOnRegistrationFailed_Ljava_lang_String_ILjava_lang_String_Handler:Android.Net.Sip.ISipRegistrationListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Net.Sip.ISipRegistrationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SipRegistrationListenerImplementor.class, __md_methods);
    }

    public SipRegistrationListenerImplementor() throws Throwable {
        if (this.getClass() == SipRegistrationListenerImplementor.class) {
            TypeManager.Activate("Android.Net.Sip.ISipRegistrationListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onRegistering(String var1);

    private native void n_onRegistrationDone(String var1, long var2);

    private native void n_onRegistrationFailed(String var1, int var2, String var3);

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

    public void onRegistering(String string2) {
        super.n_onRegistering(string2);
    }

    public void onRegistrationDone(String string2, long l) {
        super.n_onRegistrationDone(string2, l);
    }

    public void onRegistrationFailed(String string2, int n, String string3) {
        super.n_onRegistrationFailed(string2, n, string3);
    }
}

