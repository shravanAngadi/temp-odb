/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  javax.xml.transform.ErrorListener
 *  javax.xml.transform.TransformerException
 */
package mono.javax.xml.transform;

import java.util.ArrayList;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ErrorListenerImplementor
implements ErrorListener,
IGCUserPeer {
    public static final String __md_methods = "n_error:(Ljavax/xml/transform/TransformerException;)V:GetError_Ljavax_xml_transform_TransformerException_Handler:Javax.Xml.Transform.IErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_fatalError:(Ljavax/xml/transform/TransformerException;)V:GetFatalError_Ljavax_xml_transform_TransformerException_Handler:Javax.Xml.Transform.IErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_warning:(Ljavax/xml/transform/TransformerException;)V:GetWarning_Ljavax_xml_transform_TransformerException_Handler:Javax.Xml.Transform.IErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Javax.Xml.Transform.IErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ErrorListenerImplementor.class, __md_methods);
    }

    public ErrorListenerImplementor() throws Throwable {
        if (this.getClass() == ErrorListenerImplementor.class) {
            TypeManager.Activate("Javax.Xml.Transform.IErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_error(TransformerException var1);

    private native void n_fatalError(TransformerException var1);

    private native void n_warning(TransformerException var1);

    public void error(TransformerException transformerException) {
        super.n_error(transformerException);
    }

    public void fatalError(TransformerException transformerException) {
        super.n_fatalError(transformerException);
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

    public void warning(TransformerException transformerException) {
        super.n_warning(transformerException);
    }
}

