/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package com.ftdi.j2xx;

import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.FT_EEPROM;
import com.ftdi.j2xx.FT_EEPROM_232H;
import com.ftdi.j2xx.FT_EE_Ctrl;

class FT_EE_232H_Ctrl
extends FT_EE_Ctrl {
    private static final int AL_DRIVE_CURRENT = 3;
    private static final int AL_FAST_SLEW = 4;
    private static final int AL_SCHMITT_INPUT = 8;
    private static final int BL_DRIVE_CURRENT = 768;
    private static final int BL_FAST_SLEW = 1024;
    private static final int BL_SCHMITT_INPUT = 2048;
    private static final String DEFAULT_PID = "6014";
    private static final byte EEPROM_SIZE_LOCATION = 15;
    private static FT_Device ft_device;

    FT_EE_232H_Ctrl(FT_Device fT_Device) throws D2xxManager.D2xxException {
        super(fT_Device);
        this.getEepromSize(15);
    }

    @Override
    int getUserSize() {
        int n = this.readWord(9);
        int n2 = 1 + (n & 255) / 2;
        int n3 = 1 + ((65280 & n) >> 8) / 2;
        return 2 * (this.mEepromSize - n2 - n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    short programEeprom(FT_EEPROM fT_EEPROM) {
        int[] arrn = new int[this.mEepromSize];
        if (fT_EEPROM.getClass() != FT_EEPROM_232H.class) {
            return 1;
        }
        FT_EEPROM_232H fT_EEPROM_232H = (FT_EEPROM_232H)fT_EEPROM;
        try {
            byte by;
            if (fT_EEPROM_232H.FIFO) {
                arrn[0] = 1 | arrn[0];
            } else if (fT_EEPROM_232H.FIFOTarget) {
                arrn[0] = 2 | arrn[0];
            } else if (fT_EEPROM_232H.FastSerial) {
                arrn[0] = 4 | arrn[0];
            }
            if (fT_EEPROM_232H.FT1248) {
                arrn[0] = 8 | arrn[0];
            }
            if (fT_EEPROM_232H.LoadVCP) {
                arrn[0] = 16 | arrn[0];
            }
            if (fT_EEPROM_232H.FT1248ClockPolarity) {
                arrn[0] = 256 | arrn[0];
            }
            if (fT_EEPROM_232H.FT1248LSB) {
                arrn[0] = 512 | arrn[0];
            }
            if (fT_EEPROM_232H.FT1248FlowControl) {
                arrn[0] = 1024 | arrn[0];
            }
            if (fT_EEPROM_232H.PowerSaveEnable) {
                arrn[0] = 32768 | arrn[0];
            }
            arrn[1] = fT_EEPROM_232H.VendorId;
            arrn[2] = fT_EEPROM_232H.ProductId;
            arrn[3] = 2304;
            arrn[4] = this.setUSBConfig(fT_EEPROM);
            arrn[5] = this.setDeviceControl(fT_EEPROM);
            byte by2 = fT_EEPROM_232H.AL_DriveCurrent;
            if (by2 == -1) {
                by2 = 0;
            }
            arrn[6] = by2 | arrn[6];
            if (fT_EEPROM_232H.AL_SlowSlew) {
                arrn[6] = 4 | arrn[6];
            }
            if (fT_EEPROM_232H.AL_SchmittInput) {
                arrn[6] = 8 | arrn[6];
            }
            if ((by = fT_EEPROM_232H.BL_DriveCurrent) == -1) {
                by = 0;
            }
            arrn[6] = arrn[6] | (short)(by << 8);
            if (fT_EEPROM_232H.BL_SlowSlew) {
                arrn[6] = 1024 | arrn[6];
            }
            if (fT_EEPROM_232H.BL_SchmittInput) {
                arrn[6] = 2048 | arrn[6];
            }
            int n = this.setStringDescriptor(fT_EEPROM_232H.Manufacturer, arrn, 80, 7, false);
            int n2 = this.setStringDescriptor(fT_EEPROM_232H.Product, arrn, n, 8, false);
            if (fT_EEPROM_232H.SerNumEnable) {
                this.setStringDescriptor(fT_EEPROM_232H.SerialNumber, arrn, n2, 9, false);
            }
            arrn[10] = 0;
            arrn[11] = 0;
            arrn[12] = 0;
            byte by3 = fT_EEPROM_232H.CBus0;
            int n3 = fT_EEPROM_232H.CBus1 << 4;
            int n4 = fT_EEPROM_232H.CBus2 << 8;
            arrn[12] = fT_EEPROM_232H.CBus3 << 12 | (n4 | (by3 | n3));
            arrn[13] = 0;
            byte by4 = fT_EEPROM_232H.CBus4;
            int n5 = fT_EEPROM_232H.CBus5 << 4;
            int n6 = fT_EEPROM_232H.CBus6 << 8;
            arrn[13] = fT_EEPROM_232H.CBus7 << 12 | (n6 | (by4 | n5));
            arrn[14] = 0;
            arrn[14] = fT_EEPROM_232H.CBus8 | fT_EEPROM_232H.CBus9 << 4;
            arrn[15] = this.mEepromType;
            arrn[69] = 72;
            if (this.mEepromType == 70) {
                return 1;
            }
        }
        catch (Exception var4_14) {
            var4_14.printStackTrace();
            return 0;
        }
        if (arrn[1] != 0 && arrn[2] != 0) {
            boolean bl = this.programEeprom(arrn, this.mEepromSize);
            if (bl) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    /*
     * Exception decompiling
     */
    @Override
    FT_EEPROM readEeprom() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 1[TRYBLOCK]
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
        short s = (short)(-1 + (this.mEepromSize - this.getUserSize() / 2));
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
        short s = (short)(-1 + (this.mEepromSize - this.getUserSize() / 2));
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
}

