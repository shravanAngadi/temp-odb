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

import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.FT_EEPROM;
import com.ftdi.j2xx.FT_EEPROM_X_Series;
import com.ftdi.j2xx.FT_EE_Ctrl;

class FT_EE_X_Ctrl
extends FT_EE_Ctrl {
    private static final int BCD_ENABLE = 1;
    private static final int CBUS_DRIVE = 48;
    private static final int CBUS_SCHMITT = 128;
    private static final int CBUS_SLEW = 64;
    private static final int DBUS_DRIVE = 3;
    private static final int DBUS_SCHMITT = 8;
    private static final int DBUS_SLEW = 4;
    private static final int DEACTIVATE_SLEEP = 4;
    private static final String DEFAULT_PID = "6015";
    private static final int DEVICE_TYPE_EE_LOC = 73;
    private static final byte FIFO = 1;
    private static final int FORCE_POWER_ENABLE = 2;
    private static final byte FT1248 = 2;
    private static final int FT1248_BIT_ORDER = 32;
    private static final int FT1248_CLK_POLARITY = 16;
    private static final int FT1248_FLOW_CTRL = 64;
    private static final byte I2C = 3;
    private static final int I2C_DISABLE_SCHMITT = 128;
    private static final int INVERT_CTS = 2048;
    private static final int INVERT_DCD = 16384;
    private static final int INVERT_DSR = 8192;
    private static final int INVERT_DTR = 4096;
    private static final int INVERT_RI = 32768;
    private static final int INVERT_RTS = 1024;
    private static final int INVERT_RXD = 512;
    private static final int INVERT_TXD = 256;
    private static final int LOAD_DRIVER = 128;
    private static final int RS485_ECHO = 8;
    private static final byte UART = 0;
    private static final int VBUS_SUSPEND = 64;

    FT_EE_X_Ctrl(FT_Device fT_Device) {
        super(fT_Device);
        this.mEepromSize = 128;
        this.mEepromType = 1;
    }

    @Override
    int getUserSize() {
        int n = this.readWord(9);
        int n2 = 1 + ((n & 255) / 2 + ((65280 & n) >> 8) / 2);
        return 2 * (-1 + this.mEepromSize - n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    short programEeprom(FT_EEPROM fT_EEPROM) {
        int[] arrn = new int[this.mEepromSize];
        int n = 0;
        if (fT_EEPROM.getClass() != FT_EEPROM_X_Series.class) {
            return 1;
        }
        FT_EEPROM_X_Series fT_EEPROM_X_Series = (FT_EEPROM_X_Series)fT_EEPROM;
        do {
            this.readWord((short)n);
        } while ((n = (short)(n + 1)) < this.mEepromSize);
        try {
            byte by;
            byte by2;
            byte by3;
            byte by4;
            arrn[0] = 0;
            if (fT_EEPROM_X_Series.BCDEnable) {
                arrn[0] = 1 | arrn[0];
            }
            if (fT_EEPROM_X_Series.BCDForceCBusPWREN) {
                arrn[0] = 2 | arrn[0];
            }
            if (fT_EEPROM_X_Series.BCDDisableSleep) {
                arrn[0] = 4 | arrn[0];
            }
            if (fT_EEPROM_X_Series.RS485EchoSuppress) {
                arrn[0] = 8 | arrn[0];
            }
            if (fT_EEPROM_X_Series.A_LoadVCP) {
                arrn[0] = 128 | arrn[0];
            }
            if (fT_EEPROM_X_Series.PowerSaveEnable) {
                byte by5 = fT_EEPROM_X_Series.CBus0;
                boolean bl = false;
                if (by5 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus1 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus2 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus3 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus4 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus5 == 17) {
                    bl = true;
                }
                if (fT_EEPROM_X_Series.CBus6 == 17 && !(bl = true)) {
                    return 1;
                }
                arrn[0] = 64 | arrn[0];
            }
            arrn[1] = fT_EEPROM_X_Series.VendorId;
            arrn[2] = fT_EEPROM_X_Series.ProductId;
            arrn[3] = 4096;
            arrn[4] = this.setUSBConfig(fT_EEPROM);
            arrn[5] = this.setDeviceControl(fT_EEPROM);
            if (fT_EEPROM_X_Series.FT1248ClockPolarity) {
                arrn[5] = 16 | arrn[5];
            }
            if (fT_EEPROM_X_Series.FT1248LSB) {
                arrn[5] = 32 | arrn[5];
            }
            if (fT_EEPROM_X_Series.FT1248FlowControl) {
                arrn[5] = 64 | arrn[5];
            }
            if (fT_EEPROM_X_Series.I2CDisableSchmitt) {
                arrn[5] = 128 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertTXD) {
                arrn[5] = 256 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertRXD) {
                arrn[5] = 512 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertRTS) {
                arrn[5] = 1024 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertCTS) {
                arrn[5] = 2048 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertDTR) {
                arrn[5] = 4096 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertDSR) {
                arrn[5] = 8192 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertDCD) {
                arrn[5] = 16384 | arrn[5];
            }
            if (fT_EEPROM_X_Series.InvertRI) {
                arrn[5] = 32768 | arrn[5];
            }
            arrn[6] = 0;
            byte by6 = fT_EEPROM_X_Series.AD_DriveCurrent;
            if (by6 == -1) {
                by6 = 0;
            }
            arrn[6] = by6 | arrn[6];
            if (fT_EEPROM_X_Series.AD_SlowSlew) {
                arrn[6] = 4 | arrn[6];
            }
            if (fT_EEPROM_X_Series.AD_SchmittInput) {
                arrn[6] = 8 | arrn[6];
            }
            if ((by = fT_EEPROM_X_Series.AC_DriveCurrent) == -1) {
                by = 0;
            }
            arrn[6] = (short)(by << 4) | arrn[6];
            if (fT_EEPROM_X_Series.AC_SlowSlew) {
                arrn[6] = 64 | arrn[6];
            }
            if (fT_EEPROM_X_Series.AC_SchmittInput) {
                arrn[6] = 128 | arrn[6];
            }
            int n2 = this.setStringDescriptor(fT_EEPROM_X_Series.Manufacturer, arrn, 80, 7, false);
            int n3 = this.setStringDescriptor(fT_EEPROM_X_Series.Product, arrn, n2, 8, false);
            if (fT_EEPROM_X_Series.SerNumEnable) {
                this.setStringDescriptor(fT_EEPROM_X_Series.SerialNumber, arrn, n3, 9, false);
            }
            arrn[10] = fT_EEPROM_X_Series.I2CSlaveAddress;
            arrn[11] = 65535 & fT_EEPROM_X_Series.I2CDeviceID;
            arrn[12] = fT_EEPROM_X_Series.I2CDeviceID >> 16;
            byte by7 = fT_EEPROM_X_Series.CBus0;
            if (by7 == -1) {
                by7 = 0;
            }
            if ((by2 = fT_EEPROM_X_Series.CBus1) == -1) {
                by2 = 0;
            }
            arrn[13] = (short)(by7 | by2 << 8);
            byte by8 = fT_EEPROM_X_Series.CBus2;
            if (by8 == -1) {
                by8 = 0;
            }
            if ((by4 = fT_EEPROM_X_Series.CBus3) == -1) {
                by4 = 0;
            }
            arrn[14] = (short)(by8 | by4 << 8);
            byte by9 = fT_EEPROM_X_Series.CBus4;
            if (by9 == -1) {
                by9 = 0;
            }
            if ((by3 = fT_EEPROM_X_Series.CBus5) == -1) {
                by3 = 0;
            }
            arrn[15] = (short)(by9 | by3 << 8);
            short s = fT_EEPROM_X_Series.CBus6;
            if (s == -1) {
                s = 0;
            }
            arrn[16] = s;
            if (arrn[1] != 0 && arrn[2] != 0) {
                boolean bl = this.programEeprom(arrn, this.mEepromSize);
                if (bl) {
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        catch (Exception var6_19) {
            var6_19.printStackTrace();
            return 0;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    FT_EEPROM readEeprom() {
        var1_1 = new FT_EEPROM_X_Series();
        var2_2 = new int[this.mEepromSize];
        var3_3 = 0;
        try {
            do {
                if (var3_3 < this.mEepromSize) ** GOTO lbl10
                if ((1 & var2_2[0]) <= 0) break;
                var1_1.BCDEnable = true;
                ** GOTO lbl15
lbl10: // 1 sources:
                var2_2[var3_3] = this.readWord(var3_3);
                var3_3 = (short)(var3_3 + 1);
            } while (true);
            var1_1.BCDEnable = false;
lbl15: // 2 sources:
            var1_1.BCDForceCBusPWREN = (2 & var2_2[0]) > 0;
            var1_1.BCDDisableSleep = (4 & var2_2[0]) > 0;
            var1_1.RS485EchoSuppress = (8 & var2_2[0]) > 0;
            var1_1.PowerSaveEnable = (64 & var2_2[0]) > 0;
            if ((128 & var2_2[0]) > 0) {
                var1_1.A_LoadVCP = true;
                var1_1.A_LoadD2XX = false;
            } else {
                var1_1.A_LoadVCP = false;
                var1_1.A_LoadD2XX = true;
            }
            var1_1.VendorId = (short)var2_2[1];
            var1_1.ProductId = (short)var2_2[2];
            this.getUSBConfig(var1_1, var2_2[4]);
            this.getDeviceControl(var1_1, var2_2[5]);
            var1_1.FT1248ClockPolarity = (16 & var2_2[5]) > 0;
            var1_1.FT1248LSB = (32 & var2_2[5]) > 0;
            var1_1.FT1248FlowControl = (64 & var2_2[5]) > 0;
            var1_1.I2CDisableSchmitt = (128 & var2_2[5]) > 0;
            var1_1.InvertTXD = (256 & var2_2[5]) == 256;
            var1_1.InvertRXD = (512 & var2_2[5]) == 512;
            var1_1.InvertRTS = (1024 & var2_2[5]) == 1024;
            var1_1.InvertCTS = (2048 & var2_2[5]) == 2048;
            var1_1.InvertDTR = (4096 & var2_2[5]) == 4096;
            var1_1.InvertDSR = (8192 & var2_2[5]) == 8192;
            var1_1.InvertDCD = (16384 & var2_2[5]) == 16384;
            var1_1.InvertRI = (32768 & var2_2[5]) == 32768;
            switch ((short)(3 & var2_2[6])) {
                case 0: {
                    var1_1.AD_DriveCurrent = 0;
                    break;
                }
                case 1: {
                    var1_1.AD_DriveCurrent = 1;
                    break;
                }
                case 2: {
                    var1_1.AD_DriveCurrent = 2;
                    break;
                }
                case 3: {
                    var1_1.AD_DriveCurrent = 3;
                }
            }
            var1_1.AD_SlowSlew = (short)(4 & var2_2[6]) == 4;
            var1_1.AD_SchmittInput = (short)(8 & var2_2[6]) == 8;
            switch ((short)((48 & var2_2[6]) >> 4)) {
                case 0: {
                    var1_1.AC_DriveCurrent = 0;
                    break;
                }
                case 1: {
                    var1_1.AC_DriveCurrent = 1;
                    break;
                }
                case 2: {
                    var1_1.AC_DriveCurrent = 2;
                    break;
                }
                case 3: {
                    var1_1.AC_DriveCurrent = 3;
                }
            }
            var1_1.AC_SlowSlew = (short)(64 & var2_2[6]) == 64;
            var1_1.AC_SchmittInput = (short)(128 & var2_2[6]) == 128;
        }
        catch (Exception var4_4) {
            return null;
        }
        {
            var1_1.I2CSlaveAddress = var2_2[10];
            var1_1.I2CDeviceID = var2_2[11];
            var1_1.I2CDeviceID |= (255 & var2_2[12]) << 16;
            var1_1.CBus0 = (byte)(255 & var2_2[13]);
            var1_1.CBus1 = (byte)(255 & var2_2[13] >> 8);
            var1_1.CBus2 = (byte)(255 & var2_2[14]);
            var1_1.CBus3 = (byte)(255 & var2_2[14] >> 8);
            var1_1.CBus4 = (byte)(255 & var2_2[15]);
            var1_1.CBus5 = (byte)(255 & var2_2[15] >> 8);
            var1_1.CBus6 = (byte)(255 & var2_2[16]);
            this.mEepromType = (short)(var2_2[73] >> 8);
            var1_1.Manufacturer = this.getStringDescriptor((255 & var2_2[7]) / 2, var2_2);
            var1_1.Product = this.getStringDescriptor((255 & var2_2[8]) / 2, var2_2);
            var1_1.SerialNumber = this.getStringDescriptor((255 & var2_2[9]) / 2, var2_2);
            return var1_1;
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

