/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.flurry.sdk.ej
 *  com.flurry.sdk.ff
 *  com.flurry.sdk.gz
 *  com.flurry.sdk.hi
 *  com.flurry.sdk.jo
 *  com.flurry.sdk.kc
 *  com.flurry.sdk.lx
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.flurry.android.tumblr;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.flurry.android.FlurryEventRecordStatus;
import com.flurry.android.tumblr.Post;
import com.flurry.sdk.ej;
import com.flurry.sdk.ff;
import com.flurry.sdk.gz;
import com.flurry.sdk.hi;
import com.flurry.sdk.jo;
import com.flurry.sdk.kc;
import com.flurry.sdk.lx;
import java.util.HashMap;
import java.util.Map;

public class TumblrShare {
    private static final String a = TumblrShare.class.getName();

    public static Bitmap getTumblrImage() {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return null;
        }
        if (jo.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized.");
        }
        gz gz2 = new gz();
        gz2.r();
        return gz2.o();
    }

    public static void post(Context context, Post post) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (jo.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before posting on Tumblr");
        }
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        if (post == null) {
            throw new IllegalArgumentException("Post object cannot be null.");
        }
        if (TextUtils.isEmpty((CharSequence)ej.a())) {
            throw new IllegalArgumentException("Consumer api key cannot be null or empty. Please set consumer key using setOAuthConfig().");
        }
        if (TextUtils.isEmpty((CharSequence)ej.b())) {
            throw new IllegalArgumentException("Consumer secret cannot be null or empty. Please set consumer secret using setOAuthConfig().");
        }
        hi.a().b("ShareClick", post.d(), (Map)new HashMap());
        lx.a().a(post.g(), post);
        ff.a((Context)context, (Bundle)post.c());
    }

    public static void setOAuthConfig(String string2, String string3) {
        if (Build.VERSION.SDK_INT < 10) {
            kc.b((String)a, (String)"Device SDK Version older than 10");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            throw new IllegalArgumentException("Consumer api key cannot be null or empty.");
        }
        if (TextUtils.isEmpty((CharSequence)string3)) {
            throw new IllegalArgumentException("Consumer secret cannot be null or empty.");
        }
        ej.a((String)string2);
        ej.b((String)string3);
    }
}

