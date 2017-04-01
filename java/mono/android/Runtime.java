/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package mono.android;

public class Runtime {
    private Runtime() {
    }

    public static native int createNewContext(String[] var0, String[] var1, ClassLoader var2);

    public static native void destroyContexts(int[] var0);

    public static native void init(String var0, String[] var1, String var2, String[] var3, ClassLoader var4, String var5, String[] var6, String var7);

    public static native void notifyTimeZoneChanged();

    public static native void propagateUncaughtException(Thread var0, Throwable var1);

    public static native void register(String var0, Class var1, String var2);

    public static native void switchToContext(int var0);
}

