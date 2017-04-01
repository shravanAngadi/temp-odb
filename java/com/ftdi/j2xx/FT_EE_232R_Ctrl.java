/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.usb.UsbDeviceConnection
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.ftdi.j2xx;

import android.hardware.usb.UsbDeviceConnection;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.FT_EEPROM;
import com.ftdi.j2xx.FT_EEPROM_232R;
import com.ftdi.j2xx.FT_EE_Ctrl;

class FT_EE_232R_Ctrl
extends FT_EE_Ctrl {
    private static final short EEPROM_SIZE = 80;
    private static final short EE_MAX_SIZE = 1024;
    private static final short ENDOFUSERLOCATION = 63;
    private static final int EXTERNAL_OSCILLATOR = 2;
    private static final int HIGH_CURRENT_IO = 4;
    private static final int INVERT_CTS = 2048;
    private static final int INVERT_DCD = 16384;
    private static final int INVERT_DSR = 8192;
    private static final int INVERT_DTR = 4096;
    private static final int INVERT_RI = 32768;
    private static final int INVERT_RTS = 1024;
    private static final int INVERT_RXD = 512;
    private static final int INVERT_TXD = 256;
    private static final int LOAD_D2XX_DRIVER = 8;
    private static FT_Device ft_device;

    FT_EE_232R_Ctrl(FT_Device fT_Device) {
        super(fT_Device);
        ft_device = fT_Device;
    }

    @Override
    int getUserSize() {
        int n = ((65280 & this.readWord(7)) >> 8) / 2;
        int n2 = 1 + (((65280 & this.readWord(8)) >> 8) / 2 + (n + 12));
        int n3 = ((65280 & this.readWord(9)) >> 8) / 2;
        return 2 * (-1 + (63 - n2 - n3));
    }

    /*
     * Exception decompiling
     */
    @Override
    short programEeprom(FT_EEPROM var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[UNCONDITIONALDOLOOP]], but top level block is 11[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:394)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:446)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2859)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:805)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:220)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:165)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:91)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:354)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:751)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:683)
        // org.benf.cfr.reader.Main.doJar(Main.java:128)
        // com.njlabs.showjava.processor.JavaExtractor$1.run(JavaExtractor.java:100)
        // java.lang.Thread.run(Thread.java:818)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @Override
    FT_EEPROM readEeprom() {
        var1_1 = new FT_EEPROM_232R();
        var2_2 = new int[80];
        var3_3 = 0;
        do {
            if (var3_3 < 80) ** GOTO lbl53
            if ((4 & var2_2[0]) != 4) break;
            var1_1.HighIO = true;
lbl9: // 2 sources:
            while ((8 & var2_2[0]) == 8) {
                var1_1.LoadVCP = true;
lbl11: // 2 sources:
                while ((2 & var2_2[0]) == 2) {
                    var1_1.ExternalOscillator = true;
lbl13: // 2 sources:
                    do {
                        var1_1.VendorId = (short)var2_2[1];
                        var1_1.ProductId = (short)var2_2[2];
                        this.getUSBConfig(var1_1, var2_2[4]);
                        this.getDeviceControl(var1_1, var2_2[5]);
                        if ((256 & var2_2[5]) != 256) ** GOTO lbl63
                        var1_1.InvertTXD = true;
lbl20: // 2 sources:
                        while ((512 & var2_2[5]) == 512) {
                            var1_1.InvertRXD = true;
lbl22: // 2 sources:
                            while ((1024 & var2_2[5]) == 1024) {
                                var1_1.InvertRTS = true;
lbl24: // 2 sources:
                                while ((2048 & var2_2[5]) == 2048) {
                                    var1_1.InvertCTS = true;
lbl26: // 2 sources:
                                    while ((4096 & var2_2[5]) == 4096) {
                                        var1_1.InvertDTR = true;
lbl28: // 2 sources:
                                        while ((8192 & var2_2[5]) == 8192) {
                                            var1_1.InvertDSR = true;
lbl30: // 2 sources:
                                            while ((16384 & var2_2[5]) == 16384) {
                                                var1_1.InvertDCD = true;
lbl32: // 2 sources:
                                                while ((32768 & var2_2[5]) == 32768) {
                                                    var1_1.InvertRI = true;
lbl34: // 2 sources:
                                                    do {
                                                        var1_1.CBus0 = (byte)(255 & var2_2[10]);
                                                        var1_1.CBus1 = (byte)((65280 & var2_2[10]) >> 4);
                                                        var1_1.CBus2 = (byte)((16711680 & var2_2[10]) >> 8);
                                                        var1_1.CBus3 = (byte)((-16777216 & var2_2[10]) >> 12);
                                                        var1_1.CBus4 = (byte)(255 & var2_2[11]);
                                                        var1_1.Manufacturer = this.getStringDescriptor((-128 + (255 & var2_2[7])) / 2, var2_2);
                                                        var1_1.Product = this.getStringDescriptor((-128 + (255 & var2_2[8])) / 2, var2_2);
                                                        var1_1.SerialNumber = this.getStringDescriptor((-128 + (255 & var2_2[9])) / 2, var2_2);
                                                        return var1_1;
                                                        break;
                                                    } while (true);
                                                }
                                                ** GOTO lbl77
                                            }
                                            ** GOTO lbl75
                                        }
                                        ** GOTO lbl73
                                    }
                                    ** GOTO lbl71
                                }
                                ** GOTO lbl69
                            }
                            ** GOTO lbl67
                        }
                        ** GOTO lbl65
                        break;
                    } while (true);
                }
                ** GOTO lbl61
            }
            ** GOTO lbl59
lbl53: // 1 sources:
            var2_2[var3_3] = this.readWord((short)var3_3);
            ++var3_3;
        } while (true);
        try {
            var1_1.HighIO = false;
            ** GOTO lbl9
lbl59: // 1 sources:
            var1_1.LoadVCP = false;
            ** GOTO lbl11
lbl61: // 1 sources:
            var1_1.ExternalOscillator = false;
            ** continue;
lbl63: // 1 sources:
            var1_1.InvertTXD = false;
            ** GOTO lbl20
lbl65: // 1 sources:
            var1_1.InvertRXD = false;
            ** GOTO lbl22
lbl67: // 1 sources:
            var1_1.InvertRTS = false;
            ** GOTO lbl24
lbl69: // 1 sources:
            var1_1.InvertCTS = false;
            ** GOTO lbl26
lbl71: // 1 sources:
            var1_1.InvertDTR = false;
            ** GOTO lbl28
lbl73: // 1 sources:
            var1_1.InvertDSR = false;
            ** GOTO lbl30
lbl75: // 1 sources:
            var1_1.InvertDCD = false;
            ** GOTO lbl32
lbl77: // 1 sources:
            var1_1.InvertRI = false;
            ** continue;
        }
        catch (Exception var4_4) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    byte[] readUserData(int n) {
        byte[] arrby = new byte[n];
        if (n == 0) return null;
        if (n > this.getUserSize()) {
            return null;
        }
        short s = (short)(65535 & (short)(-1 + (63 - this.getUserSize() / 2)));
        int n2 = 0;
        short s2 = s;
        while (n2 < n) {
            short s3 = (short)(s2 + 1);
            int n3 = this.readWord(s2);
            if (n2 + 1 < arrby.length) {
                byte by = (byte)(n3 & 255);
                arrby[n2 + 1] = by;
            }
            arrby[n2] = (byte)((65280 & n3) >> 8);
            n2 += 2;
            s2 = s3;
        }
        return arrby;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    int writeUserData(byte[] arrby) {
        if (arrby.length > this.getUserSize()) {
            return 0;
        }
        short s = (short)(65535 & (short)(-1 + (63 - this.getUserSize() / 2)));
        int n = 0;
        while (n < arrby.length) {
            int n2 = n + 1 < arrby.length ? 255 & arrby[n + 1] : 0;
            int n3 = n2 << 8 | 255 & arrby[n];
            short s2 = (short)(s + 1);
            this.writeWord(s, (short)n3);
            n += 2;
            s = s2;
        }
        return arrby.length;
    }

    @Override
    boolean writeWord(short s, short s2) {
        int n = s2 & 65535;
        int n2 = s & 65535;
        if (s >= 1024) {
            return false;
        }
        byte by = ft_device.getLatencyTimer();
        ft_device.setLatencyTimer(119);
        int n3 = ft_device.getConnection().controlTransfer(64, 145, n, n2, null, 0, 0);
        boolean bl = false;
        if (n3 == 0) {
            bl = true;
        }
        ft_device.setLatencyTimer(by);
        return bl;
    }
}

