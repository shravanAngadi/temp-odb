/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.flurry.sdk.dz
 *  com.flurry.sdk.dz$a
 *  com.flurry.sdk.ea
 *  com.flurry.sdk.jo
 *  com.flurry.sdk.jw
 *  com.flurry.sdk.jx
 *  com.flurry.sdk.jy
 *  com.flurry.sdk.kc
 *  com.flurry.sdk.lr
 *  com.flurry.sdk.lx
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.flurry.android.tumblr;

import android.os.Bundle;
import android.text.TextUtils;
import com.flurry.android.tumblr.PostListener;
import com.flurry.sdk.dz;
import com.flurry.sdk.ea;
import com.flurry.sdk.jo;
import com.flurry.sdk.jw;
import com.flurry.sdk.jx;
import com.flurry.sdk.jy;
import com.flurry.sdk.kc;
import com.flurry.sdk.lr;
import com.flurry.sdk.lx;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Post {
    private static final String a = Post.class.getName();
    private static AtomicInteger g = new AtomicInteger(0);
    private String b;
    private String c;
    private String d;
    private PostListener e;
    private int f = 0;
    private final jx<dz> h;

    Post() {
        this.h = new jx<dz>(){

            /*
             * Enabled aggressive block sorting
             */
            public void a(final dz dz2) {
                PostListener postListener;
                if (dz2.c != Post.this.f || dz2.b == null || (postListener = Post.this.e) == null) {
                    return;
                }
                jo.a().a((Runnable)new lr(){

                    public void a() {
                        switch (.a[dz2.b.ordinal()]) {
                            default: {
                                return;
                            }
                            case 1: {
                                kc.a((int)3, (String)a, (String)("Post success for " + dz2.c));
                                postListener.onPostSuccess(dz2.f);
                                jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.this.h);
                                lx.a().a(Post.this.f);
                                return;
                            }
                            case 2: 
                        }
                        String string2 = dz2.e;
                        if (TextUtils.isEmpty((CharSequence)string2)) {
                            string2 = "Internal error.";
                        }
                        kc.a((int)3, (String)a, (String)("Post failed for " + dz2.c + " with error code: " + (Object)dz2.d + "  and error message: " + string2));
                        postListener.onPostFailure(string2);
                        jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.this.h);
                        lx.a().a(Post.this.f);
                    }
                });
            }

            public /* synthetic */ void a(jw jw2) {
                this.a((dz)jw2);
            }

        };
        this.f = g.incrementAndGet();
        jy.a().a("com.flurry.android.impl.analytics.tumblr.TumblrEvents", this.h);
    }

    abstract Bundle c();

    String d() {
        return this.c;
    }

    String e() {
        return this.b;
    }

    String f() {
        return this.d;
    }

    int g() {
        return this.f;
    }

    public void setAndroidDeeplink(String string2) {
        this.c = string2;
    }

    public void setIOSDeepLink(String string2) {
        this.b = string2;
    }

    public void setPostListener(PostListener postListener) {
        this.e = postListener;
    }

    public void setWebLink(String string2) {
        this.d = string2;
    }

}

