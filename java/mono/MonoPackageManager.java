/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  java.io.File
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Locale
 */
package mono;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.Locale;
import mono.MonoPackageManager_Resources;
import mono.android.Runtime;
import mono.android.app.ApplicationRegistration;
import mono.android.app.NotifyTimeZoneChanges;

public class MonoPackageManager {
    static Context Context;
    static boolean initialized;
    static Object lock;

    static {
        lock = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void LoadApplication(Context context, ApplicationInfo applicationInfo, String[] arrstring) {
        Object object;
        Object object2 = object = lock;
        synchronized (object2) {
            if (context instanceof Application) {
                Context = context;
            }
            if (!initialized) {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
                context.registerReceiver((BroadcastReceiver)new NotifyTimeZoneChanges(), intentFilter);
                System.loadLibrary((String)"monodroid");
                Locale locale = Locale.getDefault();
                String string2 = locale.getLanguage() + "-" + locale.getCountry();
                String string3 = context.getFilesDir().getAbsolutePath();
                String string4 = context.getCacheDir().getAbsolutePath();
                String string5 = MonoPackageManager.getNativeLibraryPath(context);
                ClassLoader classLoader = context.getClassLoader();
                Runtime.init(string2, arrstring, MonoPackageManager.getNativeLibraryPath(applicationInfo), new String[]{string3, string4, string5}, classLoader, new File(Environment.getExternalStorageDirectory(), "Android/data/" + context.getPackageName() + "/files/.__override__").getAbsolutePath(), MonoPackageManager_Resources.Assemblies, context.getPackageName());
                ApplicationRegistration.registerApplications();
                initialized = true;
            }
            return;
        }
    }

    public static String getApiPackageName() {
        return MonoPackageManager_Resources.ApiPackageName;
    }

    public static String[] getAssemblies() {
        return MonoPackageManager_Resources.Assemblies;
    }

    public static String[] getDependencies() {
        return MonoPackageManager_Resources.Dependencies;
    }

    static String getNativeLibraryPath(Context context) {
        return MonoPackageManager.getNativeLibraryPath(context.getApplicationInfo());
    }

    static String getNativeLibraryPath(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 9) {
            return applicationInfo.nativeLibraryDir;
        }
        return applicationInfo.dataDir + "/lib";
    }

    public static void setContext(Context context) {
    }
}

