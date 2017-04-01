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
import com.ftdi.j2xx.FT_EE_Ctrl;

class FT_EE_232A_Ctrl
extends FT_EE_Ctrl {
    private static final short CHECKSUM_LOCATION = 63;
    private static final short EEPROM_SIZE = 64;

    FT_EE_232A_Ctrl(FT_Device fT_Device) {
        super(fT_Device);
    }

    @Override
    int getUserSize() {
        int n = ((65280 & this.readWord(7)) >> 8) / 2;
        int n2 = 1 + (((65280 & this.readWord(8)) >> 8) / 2 + (n + 10));
        int n3 = ((65280 & this.readWord(9)) >> 8) / 2;
        return 2 * (63 - n2 - n3);
    }

    @Override
    short programEeprom(FT_EEPROM fT_EEPROM) {
        int[] arrn = new int[64];
        if (fT_EEPROM.getClass() != FT_EEPROM.class) {
            return 1;
        }
        try {
            arrn[1] = fT_EEPROM.VendorId;
            arrn[2] = fT_EEPROM.ProductId;
            arrn[3] = 512;
            arrn[4] = this.setUSBConfig(fT_EEPROM);
            int n = this.setStringDescriptor(fT_EEPROM.Manufacturer, arrn, 10, 7, true) + (2 + fT_EEPROM.Manufacturer.length());
            int n2 = this.setStringDescriptor(fT_EEPROM.Product, arrn, n, 8, true) + (2 + fT_EEPROM.Product.length());
            if (fT_EEPROM.SerNumEnable) {
                this.setStringDescriptor(fT_EEPROM.SerialNumber, arrn, n2, 9, true) + (2 + fT_EEPROM.SerialNumber.length());
            }
            if (arrn[1] != 0 && arrn[2] != 0) {
                boolean bl = this.programEeprom(arrn, 63);
                if (bl) {
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        catch (Exception var3_6) {
            var3_6.printStackTrace();
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
        var1_1 = new FT_EEPROM();
        var2_2 = new int[64];
        var3_3 = 0;
        do {
            if (var3_3 < 64) ** GOTO lbl15
            try {
                var1_1.VendorId = (short)var2_2[1];
                var1_1.ProductId = (short)var2_2[2];
                this.getUSBConfig(var1_1, var2_2[4]);
                var1_1.Manufacturer = this.getStringDescriptor(10, var2_2);
                var5_4 = 10 + (1 + var1_1.Manufacturer.length());
                var1_1.Product = this.getStringDescriptor(var5_4, var2_2);
                var1_1.SerialNumber = this.getStringDescriptor(var5_4 + (1 + var1_1.Product.length()), var2_2);
                return var1_1;
lbl15: // 1 sources:
                var2_2[var3_3] = this.readWord((short)var3_3);
                ++var3_3;
                continue;
            }
            catch (Exception var4_5) {}
            return null;
            {
                continue;
            }
            break;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    byte[] readUserData(int n) {
        byte[] arrby = new byte[n];
        if (n == 0) return null;
        if (n > -1 + this.getUserSize()) {
            return null;
        }
        short s = (short)(65535 & (short)(63 - this.getUserSize() / 2));
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
        short s = (short)(-1 + (63 - this.getUserSize() / 2));
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

