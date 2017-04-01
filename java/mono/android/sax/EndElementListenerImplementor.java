/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.sax.EndElementListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.sax;

import android.sax.EndElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class EndElementListenerImplementor
implements EndElementListener,
IGCUserPeer {
    public static final String __md_methods = "n_end:()V:GetEndHandler:Android.Sax.IEndElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Sax.IEndElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", EndElementListenerImplementor.class, __md_methods);
    }

    public EndElementListenerImplementor() throws Throwable {
        if (this.getClass() == EndElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IEndElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_end();

    public void end() {
        this.n_end();
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

