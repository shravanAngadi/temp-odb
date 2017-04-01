/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.sax.EndTextElementListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.sax;

import android.sax.EndTextElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class EndTextElementListenerImplementor
implements EndTextElementListener,
IGCUserPeer {
    public static final String __md_methods = "n_end:(Ljava/lang/String;)V:GetEnd_Ljava_lang_String_Handler:Android.Sax.IEndTextElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Sax.IEndTextElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", EndTextElementListenerImplementor.class, __md_methods);
    }

    public EndTextElementListenerImplementor() throws Throwable {
        if (this.getClass() == EndTextElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IEndTextElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_end(String var1);

    public void end(String string2) {
        super.n_end(string2);
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
}

