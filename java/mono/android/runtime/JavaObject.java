/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.runtime;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class JavaObject
implements IGCUserPeer {
    public static final String __md_methods = "n_clone:()Ljava/lang/Object;:GetCloneHandler\nn_equals:(Ljava/lang/Object;)Z:GetEquals_Ljava_lang_Object_Handler\nn_hashCode:()I:GetGetHashCodeHandler\nn_toString:()Ljava/lang/String;:GetToStringHandler\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Runtime.JavaObject, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", JavaObject.class, __md_methods);
    }

    public JavaObject() throws Throwable {
        if (this.getClass() == JavaObject.class) {
            TypeManager.Activate("Android.Runtime.JavaObject, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native Object n_clone();

    private native boolean n_equals(Object var1);

    private native int n_hashCode();

    private native String n_toString();

    public Object clone() {
        return this.n_clone();
    }

    public boolean equals(Object object) {
        return super.n_equals(object);
    }

    public int hashCode() {
        return this.n_hashCode();
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

    public String toString() {
        return this.n_toString();
    }
}

