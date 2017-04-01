/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Criteria
 *  android.location.Location
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  com.flurry.sdk.hi
 *  com.flurry.sdk.jb
 *  com.flurry.sdk.jo
 *  com.flurry.sdk.jp
 *  com.flurry.sdk.jq
 *  com.flurry.sdk.jw
 *  com.flurry.sdk.jx
 *  com.flurry.sdk.jy
 *  com.flurry.sdk.kc
 *  com.flurry.sdk.lc
 *  com.flurry.sdk.lc$a
 *  com.flurry.sdk.ld
 *  com.flurry.sdk.lg
 *  com.flurry.sdk.lp
 *  com.flurry.sdk.lw
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Date
 *  java.util.Map
 */
package com.flurry.android;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.flurry.android.FlurryAgentListener;
import com.flurry.android.FlurryEventRecordStatus;
import com.flurry.android.FlurrySyndicationEventName;
import com.flurry.sdk.hi;
import com.flurry.sdk.jb;
import com.flurry.sdk.jo;
import com.flurry.sdk.jp;
import com.flurry.sdk.jq;
import com.flurry.sdk.jw;
import com.flurry.sdk.jx;
import com.flurry.sdk.jy;
import com.flurry.sdk.kc;
import com.flurry.sdk.lc;
import com.flurry.sdk.ld;
import com.flurry.sdk.lg;
import com.flurry.sdk.lp;
import com.flurry.sdk.lw;
import java.util.Date;
import java.util.Map;

public final class FlurryAgent {
    private static final String a = FlurryAgent.class.getSimpleName();
    private static FlurryAgentListener b;
    private static final jx<lc> c;

    static {
        c = new jx<lc>(){

            public /* synthetic */ void a(jw jw2) {
                this.a((lc)jw2);
            }

            public void a(final lc lc2) {
                jo.a().a(new Runnable(){

                    /*
                     * Enabled aggressive block sorting
                     */
                    public void run() {
                        switch (lc2.c) {
                            default: {
                                return;
                            }
                            case b: {
                                if (b == null) return;
                                b.onSessionStarted();
                                return;
                            }
                        }
                    }
                });
            }

        };
    }

    private FlurryAgent() {
    }

    public static void addOrigin(String string2, String string3) {
        FlurryAgent.addOrigin(string2, string3, null);
    }

    public static void addOrigin(String string2, String string3, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null || string2.length() == 0) {
            throw new IllegalArgumentException("originName not specified");
        }
        if (string3 == null || string3.length() == 0) {
            throw new IllegalArgumentException("originVersion not specified");
        }
        try {
            jq.a().a(string2, string3, map);
            return;
        }
        catch (Throwable var3_3) {
            kc.a((String)a, (String)"", (Throwable)var3_3);
            return;
        }
    }

    public static void addSessionProperty(String string2, String string3) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3)) {
            kc.b((String)a, (String)"String name or value passed to addSessionProperty was null or empty.");
            return;
        }
        jb.a().a(string2, string3);
    }

    public static void clearLocation() {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        lg.a().a("ExplicitLocation", (Object)null);
    }

    public static void endTimedEvent(String string2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to endTimedEvent was null.");
            return;
        }
        try {
            hi.a().b(string2);
            return;
        }
        catch (Throwable var1_1) {
            kc.a((String)a, (String)("Failed to signify the end of event: " + string2), (Throwable)var1_1);
            return;
        }
    }

    public static void endTimedEvent(String string2, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to endTimedEvent was null.");
            return;
        }
        if (map == null) {
            kc.b((String)a, (String)"String eventId passed to endTimedEvent was null.");
            return;
        }
        try {
            hi.a().b(string2, map);
            return;
        }
        catch (Throwable var2_2) {
            kc.a((String)a, (String)("Failed to signify the end of event: " + string2), (Throwable)var2_2);
            return;
        }
    }

    public static int getAgentVersion() {
        return jp.a();
    }

    public static String getReleaseVersion() {
        return jp.f();
    }

    public static String getSessionId() {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return null;
        }
        try {
            String string2 = jb.a().c();
            return string2;
        }
        catch (Throwable var0_1) {
            kc.a((String)a, (String)"", (Throwable)var0_1);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void init(Context context, String string2) {
        reference var4_2 = FlurryAgent.class;
        synchronized (FlurryAgent.class) {
            if (Build.VERSION.SDK_INT < 10) {
                kc.b((String)a, (String)"Device SDK Version older than 10");
            } else {
                if (context == null) {
                    throw new NullPointerException("Null context");
                }
                if (string2 == null || string2.length() == 0) {
                    throw new IllegalArgumentException("apiKey not specified");
                }
                try {
                    lw.a();
                    jo.a((Context)context, (String)string2);
                }
                catch (Throwable var3_3) {
                    kc.a((String)a, (String)"", (Throwable)var3_3);
                }
            }
            // ** MonitorExit[var4_2] (shouldn't be in output)
            return;
        }
    }

    public static boolean isSessionActive() {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return false;
        }
        try {
            boolean bl = ld.a().f();
            return bl;
        }
        catch (Throwable var0_1) {
            kc.a((String)a, (String)"", (Throwable)var0_1);
            return false;
        }
    }

    public static FlurryEventRecordStatus logEvent(FlurrySyndicationEventName flurrySyndicationEventName, String string2, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return flurryEventRecordStatus;
        }
        if (flurrySyndicationEventName == null) {
            kc.b((String)a, (String)"String eventName passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            kc.b((String)a, (String)"String syndicationId passed to logEvent was null or empty.");
            return flurryEventRecordStatus;
        }
        if (map == null) {
            kc.b((String)a, (String)"String parameters passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        try {
            FlurryEventRecordStatus flurryEventRecordStatus2 = hi.a().a(flurrySyndicationEventName.toString(), string2, map);
            return flurryEventRecordStatus2;
        }
        catch (Throwable var4_5) {
            kc.a((String)a, (String)("Failed to log event: " + flurrySyndicationEventName.toString()), (Throwable)var4_5);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String string2) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return flurryEventRecordStatus;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        try {
            FlurryEventRecordStatus flurryEventRecordStatus2 = hi.a().a(string2);
            return flurryEventRecordStatus2;
        }
        catch (Throwable var2_3) {
            kc.a((String)a, (String)("Failed to log event: " + string2), (Throwable)var2_3);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String string2, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return flurryEventRecordStatus;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        if (map == null) {
            kc.b((String)a, (String)"String parameters passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        try {
            FlurryEventRecordStatus flurryEventRecordStatus2 = hi.a().a(string2, map);
            return flurryEventRecordStatus2;
        }
        catch (Throwable var3_4) {
            kc.a((String)a, (String)("Failed to log event: " + string2), (Throwable)var3_4);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String string2, Map<String, String> map, boolean bl) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return flurryEventRecordStatus;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        if (map == null) {
            kc.b((String)a, (String)"String parameters passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        try {
            FlurryEventRecordStatus flurryEventRecordStatus2 = hi.a().a(string2, map, bl);
            return flurryEventRecordStatus2;
        }
        catch (Throwable var4_5) {
            kc.a((String)a, (String)("Failed to log event: " + string2), (Throwable)var4_5);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String string2, boolean bl) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return flurryEventRecordStatus;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to logEvent was null.");
            return flurryEventRecordStatus;
        }
        try {
            FlurryEventRecordStatus flurryEventRecordStatus2 = hi.a().a(string2, bl);
            return flurryEventRecordStatus2;
        }
        catch (Throwable var3_4) {
            kc.a((String)a, (String)("Failed to log event: " + string2), (Throwable)var3_4);
            return flurryEventRecordStatus;
        }
    }

    public static void onEndSession(Context context) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (jo.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before ending a session");
        }
        try {
            ld.a().c(context);
            return;
        }
        catch (Throwable var1_1) {
            kc.a((String)a, (String)"", (Throwable)var1_1);
            return;
        }
    }

    @Deprecated
    public static void onError(String string2, String string3, String string4) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String errorId passed to onError was null.");
            return;
        }
        if (string3 == null) {
            kc.b((String)a, (String)"String message passed to onError was null.");
            return;
        }
        if (string4 == null) {
            kc.b((String)a, (String)"String errorClass passed to onError was null.");
            return;
        }
        try {
            hi.a().a(string2, string3, string4);
            return;
        }
        catch (Throwable var3_3) {
            kc.a((String)a, (String)"", (Throwable)var3_3);
            return;
        }
    }

    public static void onError(String string2, String string3, Throwable throwable) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String errorId passed to onError was null.");
            return;
        }
        if (string3 == null) {
            kc.b((String)a, (String)"String message passed to onError was null.");
            return;
        }
        if (throwable == null) {
            kc.b((String)a, (String)"Throwable passed to onError was null.");
            return;
        }
        try {
            hi.a().a(string2, string3, throwable);
            return;
        }
        catch (Throwable var3_3) {
            kc.a((String)a, (String)"", (Throwable)var3_3);
            return;
        }
    }

    @Deprecated
    public static void onEvent(String string2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to onEvent was null.");
            return;
        }
        try {
            hi.a().c(string2);
            return;
        }
        catch (Throwable var1_1) {
            kc.a((String)a, (String)"", (Throwable)var1_1);
            return;
        }
    }

    @Deprecated
    public static void onEvent(String string2, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String eventId passed to onEvent was null.");
            return;
        }
        if (map == null) {
            kc.b((String)a, (String)"Parameters Map passed to onEvent was null.");
            return;
        }
        try {
            hi.a().c(string2, map);
            return;
        }
        catch (Throwable var2_2) {
            kc.a((String)a, (String)"", (Throwable)var2_2);
            return;
        }
    }

    public static void onPageView() {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        try {
            hi.a().g();
            return;
        }
        catch (Throwable var0) {
            kc.a((String)a, (String)"", (Throwable)var0);
            return;
        }
    }

    public static void onStartSession(Context context) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (jo.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try {
            ld.a().b(context);
            return;
        }
        catch (Throwable var1_1) {
            kc.a((String)a, (String)"", (Throwable)var1_1);
            return;
        }
    }

    @Deprecated
    public static void onStartSession(Context context, String string2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (string2 == null || string2.length() == 0) {
            throw new IllegalArgumentException("Api key not specified");
        }
        if (jo.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
        try {
            ld.a().b(context);
            return;
        }
        catch (Throwable var2_2) {
            kc.a((String)a, (String)"", (Throwable)var2_2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void setAge(int n) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        } else {
            if (n <= 0 || n >= 110) return;
            {
                long l = new Date(new Date(System.currentTimeMillis() - 31449600000L * (long)n).getYear(), 1, 1).getTime();
                lg.a().a("Age", (Object)l);
                return;
            }
        }
    }

    public static void setCaptureUncaughtExceptions(boolean bl) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        lg.a().a("CaptureUncaughtExceptions", (Object)bl);
    }

    public static void setContinueSessionMillis(long l) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (l < 5000) {
            kc.b((String)a, (String)("Invalid time set for session resumption: " + l));
            return;
        }
        lg.a().a("ContinueSessionMillis", (Object)l);
    }

    public static void setFlurryAgentListener(FlurryAgentListener flurryAgentListener) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (flurryAgentListener == null) {
            kc.b((String)a, (String)"Listener cannot be null");
            jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", c);
            return;
        }
        b = flurryAgentListener;
        jy.a().a("com.flurry.android.sdk.FlurrySessionEvent", c);
    }

    public static void setGender(byte by) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        switch (by) {
            default: {
                lg.a().a("Gender", (Object)Byte.valueOf((byte)-1));
                return;
            }
            case 0: 
            case 1: 
        }
        lg.a().a("Gender", (Object)Byte.valueOf((byte)by));
    }

    public static void setLocation(float f, float f2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        Location location = new Location("Explicit");
        location.setLatitude((double)f);
        location.setLongitude((double)f2);
        lg.a().a("ExplicitLocation", (Object)location);
    }

    @Deprecated
    public static void setLocationCriteria(Criteria criteria) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
        }
    }

    public static void setLogEnabled(boolean bl) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (bl) {
            kc.b();
            return;
        }
        kc.a();
    }

    public static void setLogEvents(boolean bl) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        lg.a().a("LogEvents", (Object)bl);
    }

    public static void setLogLevel(int n) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        kc.a((int)n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void setPulseEnabled(boolean bl) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        } else {
            lg.a().a("ProtonEnabled", (Object)bl);
            if (bl) return;
            {
                lg.a().a("analyticsEnabled", (Object)true);
                return;
            }
        }
    }

    public static void setReportLocation(boolean bl) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        lg.a().a("ReportLocation", (Object)bl);
    }

    public static void setSessionOrigin(String string2, String string3) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            kc.b((String)a, (String)"String originName passed to setSessionOrigin was null or empty.");
            return;
        }
        jb.a().a(string2);
        jb.a().b(string3);
    }

    public static void setUserId(String string2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String userId passed to setUserId was null.");
            return;
        }
        lg.a().a("UserId", (Object)lp.b((String)string2));
    }

    public static void setVersionName(String string2) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (string2 == null) {
            kc.b((String)a, (String)"String versionName passed to setVersionName was null.");
            return;
        }
        lg.a().a("VersionName", (Object)string2);
    }

}

