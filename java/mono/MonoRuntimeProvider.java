/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package mono;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import mono.MonoPackageManager;

public class MonoRuntimeProvider
extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] arrstring = new String[]{context.getApplicationInfo().sourceDir};
        MonoPackageManager.LoadApplication(context, applicationInfo, arrstring);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String string2, String[] arrstring) {
        throw new RuntimeException("This operation is not supported.");
    }

    public String getType(Uri uri) {
        throw new RuntimeException("This operation is not supported.");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new RuntimeException("This operation is not supported.");
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] arrstring, String string2, String[] arrstring2, String string3) {
        throw new RuntimeException("This operation is not supported.");
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] arrstring) {
        throw new RuntimeException("This operation is not supported.");
    }
}

