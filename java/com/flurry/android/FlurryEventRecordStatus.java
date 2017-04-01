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

public final class FlurryEventRecordStatus
extends Enum<FlurryEventRecordStatus> {
    private static final /* synthetic */ FlurryEventRecordStatus[] a;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventAnalyticsDisabled;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventFailed;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventLogCountExceeded;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventLoggingDelayed;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventParamsCountExceeded;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventRecorded;
    public static final /* enum */ FlurryEventRecordStatus kFlurryEventUniqueCountExceeded;

    static {
        kFlurryEventFailed = new FlurryEventRecordStatus();
        kFlurryEventRecorded = new FlurryEventRecordStatus();
        kFlurryEventUniqueCountExceeded = new FlurryEventRecordStatus();
        kFlurryEventParamsCountExceeded = new FlurryEventRecordStatus();
        kFlurryEventLogCountExceeded = new FlurryEventRecordStatus();
        kFlurryEventLoggingDelayed = new FlurryEventRecordStatus();
        kFlurryEventAnalyticsDisabled = new FlurryEventRecordStatus();
        FlurryEventRecordStatus[] arrflurryEventRecordStatus = new FlurryEventRecordStatus[]{kFlurryEventFailed, kFlurryEventRecorded, kFlurryEventUniqueCountExceeded, kFlurryEventParamsCountExceeded, kFlurryEventLogCountExceeded, kFlurryEventLoggingDelayed, kFlurryEventAnalyticsDisabled};
        a = arrflurryEventRecordStatus;
    }

    private FlurryEventRecordStatus() {
        super(string2, n);
    }

    public static FlurryEventRecordStatus valueOf(String string2) {
        return (FlurryEventRecordStatus)Enum.valueOf((Class)FlurryEventRecordStatus.class, (String)string2);
    }

    public static FlurryEventRecordStatus[] values() {
        return (FlurryEventRecordStatus[])a.clone();
    }
}

