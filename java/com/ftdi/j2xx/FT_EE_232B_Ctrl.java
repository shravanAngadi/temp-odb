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
import com.ftdi.j2xx.FT_EE_Ctrl;

class FT_EE_232B_Ctrl
extends FT_EE_Ctrl {
    private static final short CHECKSUM_LOCATION = 63;
    private static final short EEPROM_SIZE = 64;
    private static FT_Device ft_device;

    FT_EE_232B_Ctrl(FT_Device fT_Device) {
        super(fT_Device);
        ft_device = fT_Device;
    }

    @Override
    int getUserSize() {
        int n = ((65280 & this.readWord(7)) >> 8) / 2;
        int n2 = 1 + (((65280 & this.readWord(8)) >> 8) / 2 + (n + 10));
        int n3 = ((65280 & this.readWord(9)) >> 8) / 2;
        return 2 * (63 - n2 - n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    short programEeprom(FT_EEPROM var1) {
        var2_2 = new int[64];
        if (var1.getClass() != FT_EEPROM.class) {
            return 1;
        }
        var3_3 = 0;
        do {
            if (var3_3 < 64) ** GOTO lbl20
            var2_2[1] = var1.VendorId;
            var2_2[2] = var1.ProductId;
            var2_2[3] = FT_EE_232B_Ctrl.ft_device.mDeviceInfoNode.bcdDevice;
            var2_2[4] = this.setUSBConfig(var1);
            var5_4 = this.setStringDescriptor(var1.Manufacturer, var2_2, 10, 7, true);
            var6_5 = this.setStringDescriptor(var1.Product, var2_2, var5_4, 8, true);
            if (var1.SerNumEnable) {
                this.setStringDescriptor(var1.SerialNumber, var2_2, var6_5, 9, true);
            }
            if (var2_2[1] == 0) return 2;
            if (var2_2[2] == 0) return 2;
            if (this.programEeprom(var2_2, 63) == false) return 1;
            return 0;
lbl20: // 1 sources:
            var2_2[var3_3] = this.readWord(var3_3);
            var3_3 = (short)(var3_3 + 1);
        } while (true);
        catch (Exception var4_6) {
            var4_6.printStackTrace();
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

