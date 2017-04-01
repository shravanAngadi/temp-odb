/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.flurry.android;

public final class FlurrySyndicationEventName
extends Enum<FlurrySyndicationEventName> {
    public static final /* enum */ FlurrySyndicationEventName FAST_REBLOG;
    public static final /* enum */ FlurrySyndicationEventName LIKE;
    public static final /* enum */ FlurrySyndicationEventName REBLOG;
    public static final /* enum */ FlurrySyndicationEventName SOURCE_LINK;
    private static final /* synthetic */ FlurrySyndicationEventName[] b;
    private String a;

    static {
        REBLOG = new FlurrySyndicationEventName("Reblog");
        FAST_REBLOG = new FlurrySyndicationEventName("FastReblog");
        SOURCE_LINK = new FlurrySyndicationEventName("SourceClick");
        LIKE = new FlurrySyndicationEventName("Like");
        FlurrySyndicationEventName[] arrflurrySyndicationEventName = new FlurrySyndicationEventName[]{REBLOG, FAST_REBLOG, SOURCE_LINK, LIKE};
        b = arrflurrySyndicationEventName;
    }

    private FlurrySyndicationEventName(String string3) {
        super(string2, n);
        this.a = string3;
    }

    public static FlurrySyndicationEventName valueOf(String string2) {
        return (FlurrySyndicationEventName)Enum.valueOf((Class)FlurrySyndicationEventName.class, (String)string2);
    }

    public static FlurrySyndicationEventName[] values() {
        return (FlurrySyndicationEventName[])b.clone();
    }

    public String toString() {
        return this.a;
    }
}

