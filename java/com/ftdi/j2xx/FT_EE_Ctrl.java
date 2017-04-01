/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.hardware.usb.UsbDeviceConnection
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.ftdi.j2xx;

import android.hardware.usb.UsbDeviceConnection;
import android.util.Log;
import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.FT_EEPROM;

class FT_EE_Ctrl {
    private static final int BUS_POWERED = 128;
    private static final short EE_MAX_SIZE = 1024;
    private static final int ENABLE_SERIAL_NUMBER = 8;
    private static final int PULL_DOWN_IN_USB_SUSPEND = 4;
    private static final int SELF_POWERED = 64;
    private static final int USB_REMOTE_WAKEUP = 32;
    private FT_Device mDevice;
    boolean mEepromBlank;
    int mEepromSize;
    short mEepromType;

    FT_EE_Ctrl(FT_Device fT_Device) {
        this.mDevice = fT_Device;
    }

    void clearUserDataArea(int n, int n2, int[] arrn) {
        int n3 = n;
        while (n3 < n2) {
            int n4 = n3 + 1;
            arrn[n3] = 0;
            n3 = n4;
        }
        return;
    }

    int eraseEeprom() {
        return this.mDevice.getConnection().controlTransfer(64, 146, 0, 0, null, 0, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    void getDeviceControl(Object object, int n) {
        FT_EEPROM fT_EEPROM = (FT_EEPROM)object;
        fT_EEPROM.PullDownEnable = (n & 4) > 0;
        if ((n & 8) > 0) {
            fT_EEPROM.SerNumEnable = true;
            return;
        }
        fT_EEPROM.SerNumEnable = false;
    }

    int getEepromSize(byte by) throws D2xxManager.D2xxException {
        short s = (short)(by & -1);
        int[] arrn = new int[3];
        short s2 = (short)this.readWord(s);
        if (s2 != 65535) {
            switch (s2) {
                default: {
                    return 0;
                }
                case 70: {
                    this.mEepromType = 70;
                    this.mEepromSize = 64;
                    this.mEepromBlank = false;
                    return 64;
                }
                case 86: {
                    this.mEepromType = 86;
                    this.mEepromSize = 128;
                    this.mEepromBlank = false;
                    return 128;
                }
                case 102: {
                    this.mEepromType = 102;
                    this.mEepromSize = 128;
                    this.mEepromBlank = false;
                    return 256;
                }
                case 82: 
            }
            this.mEepromType = 82;
            this.mEepromSize = 1024;
            this.mEepromBlank = false;
            return 1024;
        }
        boolean bl = this.writeWord(192, 192);
        arrn[0] = this.readWord(192);
        arrn[1] = this.readWord(64);
        arrn[2] = this.readWord(0);
        if (!bl) {
            this.mEepromType = 255;
            this.mEepromSize = 0;
            return 0;
        }
        this.mEepromBlank = true;
        if ((255 & this.readWord(0)) == 192) {
            this.eraseEeprom();
            this.mEepromType = 70;
            this.mEepromSize = 64;
            return 64;
        }
        if ((255 & this.readWord(64)) == 192) {
            this.eraseEeprom();
            this.mEepromType = 86;
            this.mEepromSize = 128;
            return 128;
        }
        if ((255 & this.readWord(192)) == 192) {
            this.eraseEeprom();
            this.mEepromType = 102;
            this.mEepromSize = 128;
            return 256;
        }
        this.eraseEeprom();
        return 0;
    }

    String getStringDescriptor(int n, int[] arrn) {
        String string2 = "";
        int n2 = -1 + (255 & arrn[n]) / 2;
        int n3 = n + 1;
        int n4 = n3 + n2;
        int n5 = n3;
        while (n5 < n4) {
            string2 = String.valueOf((Object)string2) + (char)arrn[n5];
            ++n5;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    void getUSBConfig(FT_EEPROM fT_EEPROM, int n) {
        fT_EEPROM.MaxPower = (short)(2 * (byte)(n >> 8));
        byte by = (byte)n;
        fT_EEPROM.SelfPowered = (by & 64) == 64 && (by & 128) == 128;
        if ((by & 32) == 32) {
            fT_EEPROM.RemoteWakeup = true;
            return;
        }
        fT_EEPROM.RemoteWakeup = false;
    }

    int getUserSize() {
        return 0;
    }

    short programEeprom(FT_EEPROM fT_EEPROM) {
        return 1;
    }

    boolean programEeprom(int[] arrn, int n) {
        int n2 = n - 1;
        int n3 = 43690;
        int n4 = 0;
        do {
            if (n4 >= n2) {
                this.writeWord((short)n2, (short)n3);
                return true;
            }
            this.writeWord((short)n4, (short)arrn[n4]);
            int n5 = n3 ^ arrn[n4];
            n3 = n5 << 1 | n5 >> 15;
            ++n4;
        } while (true);
    }

    FT_EEPROM readEeprom() {
        return null;
    }

    byte[] readUserData(int n) {
        return null;
    }

    int readWord(short s) {
        byte[] arrby = new byte[2];
        Log.d((String)"FT_EE_Ctrl", (String)"Entered ReadWord.");
        if (s >= 1024) {
            return -1;
        }
        this.mDevice.getConnection().controlTransfer(-64, 144, 0, (int)s, arrby, 2, 0);
        return (255 & arrby[1]) << 8 | 255 & arrby[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    int setDeviceControl(Object object) {
        FT_EEPROM fT_EEPROM = (FT_EEPROM)object;
        int n = fT_EEPROM.PullDownEnable ? 0 | 4 : 0 & 251;
        if (fT_EEPROM.SerNumEnable) {
            return n | 8;
        }
        return n & 247;
    }

    int setStringDescriptor(String string2, int[] arrn, int n, int n2, boolean bl) {
        int n3 = 0;
        int n4 = 2 + 2 * string2.length();
        arrn[n2] = n4 << 8 | n * 2;
        if (bl) {
            arrn[n2] = 128 + arrn[n2];
        }
        char[] arrc = string2.toCharArray();
        int n5 = n + 1;
        arrn[n] = n4 | 768;
        int n6 = (n4 - 2) / 2;
        int n7 = n5;
        do {
            int n8 = n7 + 1;
            arrn[n7] = arrc[n3];
            if (++n3 >= n6) {
                return n8;
            }
            n7 = n8;
        } while (true);
    }

    int setUSBConfig(Object object) {
        FT_EEPROM fT_EEPROM = (FT_EEPROM)object;
        int n = 0 | 128;
        if (fT_EEPROM.RemoteWakeup) {
            n |= 32;
        }
        if (fT_EEPROM.SelfPowered) {
            n |= 64;
        }
        return n | fT_EEPROM.MaxPower / 2 << 8;
    }

    int writeUserData(byte[] arrby) {
        return 0;
    }

    boolean writeWord(short s, short s2) {
        int n = s2 & 65535;
        int n2 = s & 65535;
        Log.d((String)"FT_EE_Ctrl", (String)"Entered WriteWord.");
        if (s >= 1024) {
            return false;
        }
        int n3 = this.mDevice.getConnection().controlTransfer(64, 145, n, n2, null, 0, 0);
        boolean bl = false;
        if (n3 == 0) {
            bl = true;
        }
        return bl;
    }

    static final class EepromType {
        static final short INVALID = 255;
        static final short TYPE_46 = 70;
        static final short TYPE_52 = 82;
        static final short TYPE_56 = 86;
        static final short TYPE_66 = 102;
        static final short TYPE_MTP = 1;

        EepromType() {
        }
    }

}

