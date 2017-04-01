/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 */
package com.flurry.android.tumblr;

import android.os.Bundle;
import android.text.TextUtils;
import com.flurry.android.tumblr.Post;

public class TextPost
extends Post {
    private String a;
    private String b;

    public TextPost(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            throw new IllegalArgumentException("Body to post cannot be null or empty");
        }
        this.b = string2;
    }

    String a() {
        return this.a;
    }

    String b() {
        return this.b;
    }

    @Override
    Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.flurry.android.post_title", this.a());
        bundle.putString("com.flurry.android.post_body", this.b());
        bundle.putString("com.flurry.android.post_ios_deeplinks", this.e());
        bundle.putString("com.flurry.android.post_android_deeplinks", this.d());
        bundle.putString("com.flurry.android.post_weblink", this.f());
        bundle.putBoolean("com.flurry.android.is_text_post", true);
        bundle.putInt("com.flurry.android.post_id", this.g());
        return bundle;
    }

    public void setTitle(String string2) {
        this.a = string2;
    }
}

