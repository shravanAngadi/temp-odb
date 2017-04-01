/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.flurry.sdk.hj
 *  com.flurry.sdk.kc
 *  com.flurry.sdk.lp
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.hj;
import com.flurry.sdk.kc;
import com.flurry.sdk.lp;

public final class FlurryInstallReceiver
extends BroadcastReceiver {
    static final String a = FlurryInstallReceiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        kc.a((int)4, (String)a, (String)("Received an Install nofication of " + intent.getAction()));
        String string2 = intent.getExtras().getString("referrer");
        kc.a((int)4, (String)a, (String)("Received an Install referrer of " + string2));
        if (string2 == null || !"com.android.vending.INSTALL_REFERRER".equals((Object)intent.getAction())) {
            kc.a((int)5, (String)a, (String)"referrer is null");
            return;
        }
        if (!string2.contains((CharSequence)"=")) {
            kc.a((int)4, (String)a, (String)("referrer is before decoding: " + string2));
            string2 = lp.d((String)string2);
            kc.a((int)4, (String)a, (String)("referrer is: " + string2));
        }
        new hj(context).a(string2);
    }
}

