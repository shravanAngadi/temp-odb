/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.ftdi.j2xx;

final class FT_BaudRate {
    private static final int FT_CLOCK_RATE = 3000000;
    private static final int FT_CLOCK_RATE_HI = 12000000;
    private static final int FT_SUB_INT_0_0 = 0;
    private static final int FT_SUB_INT_0_125 = 49152;
    private static final int FT_SUB_INT_0_25 = 32768;
    private static final int FT_SUB_INT_0_375 = 0;
    private static final int FT_SUB_INT_0_5 = 16384;
    private static final int FT_SUB_INT_0_625 = 16384;
    private static final int FT_SUB_INT_0_75 = 32768;
    private static final int FT_SUB_INT_0_875 = 49152;
    private static final int FT_SUB_INT_MASK = 49152;

    private FT_BaudRate() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static final int FT_CalcBaudRate(int var0_1, int var1, boolean var2_2) {
        if (var0_1 == 0) {
            return 3000000;
        }
        var3_3 = 100 * (-49153 & var0_1);
        if (!var2_2) {
            switch (var0_1 & 49152) {
                case 49152: {
                    var3_3 += 12;
                    ** break;
                }
                case 32768: {
                    var3_3 += 25;
                }
lbl11: // 3 sources:
                default: {
                    return 300000000 / var3_3;
                }
                case 16384: 
            }
            return 300000000 / (var3_3 += 50);
        }
        if (var1 == 0) {
            switch (var0_1 & 49152) {
                default: {
                    return 300000000 / var3_3;
                }
                case 16384: {
                    return 300000000 / (var3_3 += 50);
                }
                case 49152: {
                    return 300000000 / (var3_3 += 12);
                }
                case 32768: 
            }
            return 300000000 / (var3_3 += 25);
        }
        switch (var0_1 & 49152) {
            default: {
                return 300000000 / var3_3;
            }
            case 0: {
                return 300000000 / (var3_3 += 37);
            }
            case 16384: {
                return 300000000 / (var3_3 += 62);
            }
            case 32768: {
                return 300000000 / (var3_3 += 75);
            }
            case 49152: 
        }
        return 300000000 / (var3_3 += 87);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static int FT_CalcBaudRateHi(int var0_1, int var1) {
        if (var0_1 == 0) {
            return 12000000;
        }
        if (var0_1 == 1) {
            return 8000000;
        }
        var2_2 = 100 * (-49153 & var0_1);
        if ((var1 & 65533) == 0) {
            switch (var0_1 & 49152) {
                case 49152: {
                    var2_2 += 12;
                    ** break;
                }
                case 32768: {
                    var2_2 += 25;
                }
lbl13: // 3 sources:
                default: {
                    return 1200000000 / var2_2;
                }
                case 16384: 
            }
            return 1200000000 / (var2_2 += 50);
        }
        switch (var0_1 & 49152) {
            default: {
                return 1200000000 / var2_2;
            }
            case 0: {
                return 1200000000 / (var2_2 += 37);
            }
            case 16384: {
                return 1200000000 / (var2_2 += 62);
            }
            case 32768: {
                return 1200000000 / (var2_2 += 75);
            }
            case 49152: 
        }
        return 1200000000 / (var2_2 += 87);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte FT_CalcDivisor(int n, int[] arrn, boolean bl) {
        int n2;
        byte by = 1;
        if (n == 0 || (-16384 & 3000000 / n) > 0) {
            return -1;
        }
        arrn[0] = 3000000 / n;
        arrn[1] = 0;
        if (arrn[0] == 1 && 100 * (3000000 % n) / n <= 3) {
            arrn[0] = 0;
        }
        if (arrn[0] == 0) {
            return by;
        }
        int n3 = 100 * (3000000 % n) / n;
        if (!bl) {
            if (n3 <= 6) {
                n2 = 0;
            } else if (n3 <= 18) {
                n2 = 49152;
            } else if (n3 <= 37) {
                n2 = 32768;
            } else if (n3 <= 75) {
                n2 = 16384;
            } else {
                n2 = 0;
                by = 0;
            }
        } else if (n3 <= 6) {
            n2 = 0;
        } else if (n3 <= 18) {
            n2 = 49152;
        } else if (n3 <= 31) {
            n2 = 32768;
        } else if (n3 <= 43) {
            arrn[1] = 1;
            n2 = 0;
        } else if (n3 <= 56) {
            n2 = 16384;
        } else if (n3 <= 68) {
            n2 = 16384;
            arrn[1] = 1;
        } else if (n3 <= 81) {
            n2 = 32768;
            arrn[1] = 1;
        } else if (n3 <= 93) {
            n2 = 49152;
            arrn[1] = 1;
        } else {
            n2 = 0;
            by = 0;
        }
        arrn[0] = n2 | arrn[0];
        return by;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte FT_CalcDivisorHi(int n, int[] arrn) {
        int n2;
        byte by = 1;
        if (n == 0 || (-16384 & 12000000 / n) > 0) {
            return -1;
        }
        arrn[1] = 2;
        if (n >= 11640000 && n <= 12360000) {
            arrn[0] = 0;
            return by;
        }
        if (n >= 7760000 && n <= 8240000) {
            arrn[0] = 1;
            return by;
        }
        arrn[0] = 12000000 / n;
        arrn[1] = 2;
        if (arrn[0] == 1 && 100 * (12000000 % n) / n <= 3) {
            arrn[0] = 0;
        }
        if (arrn[0] == 0) {
            return by;
        }
        int n3 = 100 * (12000000 % n) / n;
        if (n3 <= 6) {
            n2 = 0;
        } else if (n3 <= 18) {
            n2 = 49152;
        } else if (n3 <= 31) {
            n2 = 32768;
        } else if (n3 <= 43) {
            arrn[1] = 1 | arrn[1];
            n2 = 0;
        } else if (n3 <= 56) {
            n2 = 16384;
        } else if (n3 <= 68) {
            n2 = 16384;
            arrn[1] = 1 | arrn[1];
        } else if (n3 <= 81) {
            n2 = 32768;
            arrn[1] = 1 | arrn[1];
        } else if (n3 <= 93) {
            n2 = 49152;
            arrn[1] = 1 | arrn[1];
        } else {
            n2 = 0;
            by = 0;
        }
        arrn[0] = n2 | arrn[0];
        return by;
    }

    /*
     * Enabled aggressive block sorting
     */
    static byte FT_GetDivisor(int n, int[] arrn, boolean bl) {
        int n2;
        int n3;
        int n4;
        byte by = FT_BaudRate.FT_CalcDivisor(n, arrn, bl);
        if (by == -1) {
            return -1;
        }
        if (by == 0) {
            arrn[0] = 1 + (-49153 & arrn[0]);
        }
        if (n > (n3 = FT_BaudRate.FT_CalcBaudRate(arrn[0], arrn[1], bl))) {
            n2 = -100 + n * 100 / n3;
            n4 = 100 * (n % n3) % n3;
        } else {
            n2 = -100 + n3 * 100 / n;
            n4 = 100 * (n3 % n) % n;
        }
        if (n2 < 3) {
            return 1;
        }
        if (n2 != 3) return 0;
        if (n4 != 0) return 0;
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static final byte FT_GetDivisorHi(int n, int[] arrn) {
        int n2;
        int n3;
        int n4;
        byte by = FT_BaudRate.FT_CalcDivisorHi(n, arrn);
        if (by == -1) {
            return -1;
        }
        if (by == 0) {
            arrn[0] = 1 + (-49153 & arrn[0]);
        }
        if (n > (n2 = FT_BaudRate.FT_CalcBaudRateHi(arrn[0], arrn[1]))) {
            n4 = -100 + n * 100 / n2;
            n3 = 100 * (n % n2) % n2;
        } else {
            n4 = -100 + n2 * 100 / n;
            n3 = 100 * (n2 % n) % n;
        }
        if (n4 < 3) {
            return 1;
        }
        if (n4 != 3) return 0;
        if (n3 != 0) return 0;
        return 1;
    }
}

