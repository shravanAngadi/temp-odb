/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package mono.android;

import mono.android.Runtime;

public class TypeManager {
    static {
        Runtime.register("Java.Interop.TypeManager, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", TypeManager.class, "n_activate:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V:GetActivateHandler\n");
    }

    public static void Activate(String string2, String string3, Object object, Object[] arrobject) {
        TypeManager.n_activate(string2, string3, object, arrobject);
    }

    private static native void n_activate(String var0, String var1, Object var2, Object[] var3);
}

