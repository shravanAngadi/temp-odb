/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.sax.StartElementListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  org.xml.sax.Attributes
 */
package mono.android.sax;

import android.sax.StartElementListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;
import org.xml.sax.Attributes;

public class StartElementListenerImplementor
implements StartElementListener,
IGCUserPeer {
    public static final String __md_methods = "n_start:(Lorg/xml/sax/Attributes;)V:GetStart_Lorg_xml_sax_Attributes_Handler:Android.Sax.IStartElementListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Sax.IStartElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", StartElementListenerImplementor.class, __md_methods);
    }

    public StartElementListenerImplementor() throws Throwable {
        if (this.getClass() == StartElementListenerImplementor.class) {
            TypeManager.Activate("Android.Sax.IStartElementListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_start(Attributes var1);

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

    public void start(Attributes attributes) {
        super.n_start(attributes);
    }
}

