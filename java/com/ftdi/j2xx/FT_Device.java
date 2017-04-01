/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.usb.UsbDevice
 *  android.hardware.usb.UsbDeviceConnection
 *  android.hardware.usb.UsbEndpoint
 *  android.hardware.usb.UsbInterface
 *  android.hardware.usb.UsbManager
 *  android.hardware.usb.UsbRequest
 *  android.util.Log
 *  java.io.UnsupportedEncodingException
 *  java.lang.Boolean
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.nio.ByteBuffer
 */
package com.ftdi.j2xx;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import android.util.Log;
import com.ftdi.j2xx.BulkInWorker;
import com.ftdi.j2xx.D2xxManager;
import com.ftdi.j2xx.FT_BaudRate;
import com.ftdi.j2xx.FT_EEPROM;
import com.ftdi.j2xx.FT_EE_Ctrl;
import com.ftdi.j2xx.ProcessInCtrl;
import com.ftdi.j2xx.ProcessRequestWorker;
import com.ftdi.j2xx.TFtEventNotify;
import com.ftdi.j2xx.TFtSpecialChars;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class FT_Device {
    private static final String TAG = "FTDI_Device::";
    private BulkInWorker mBulkIn;
    UsbEndpoint mBulkInEndpoint;
    private Thread mBulkInThread;
    UsbEndpoint mBulkOutEndpoint;
    Context mContext;
    D2xxManager.FtDeviceInfoListNode mDeviceInfoNode;
    private D2xxManager.DriverParameters mDriverParams;
    private FT_EE_Ctrl mEEPROM;
    long mEventMask;
    TFtEventNotify mEventNotification;
    private int mInterfaceID;
    Boolean mIsOpen;
    private byte mLatencyTimer;
    private int mMaxPacketSize;
    private ProcessInCtrl mProcessInCtrl;
    private Thread mProcessRequestThread;
    TFtSpecialChars mTftSpecialChars;
    private UsbDeviceConnection mUsbConnection;
    UsbDevice mUsbDevice;
    UsbInterface mUsbInterface;

    /*
     * Exception decompiling
     */
    public FT_Device(Context var1_1, UsbManager var2_4, UsbDevice var3_3, UsbInterface var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:366)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.rebuildSwitches(SwitchReplacer.java:334)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:527)
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
     * Enabled aggressive block sorting
     */
    private void dualQuadChannelDevice() {
        if (this.mInterfaceID == 1) {
            D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode = this.mDeviceInfoNode;
            ftDeviceInfoListNode.serialNumber = String.valueOf((Object)ftDeviceInfoListNode.serialNumber) + "A";
            D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode2 = this.mDeviceInfoNode;
            ftDeviceInfoListNode2.description = String.valueOf((Object)ftDeviceInfoListNode2.description) + " A";
            return;
        } else {
            if (this.mInterfaceID == 2) {
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode = this.mDeviceInfoNode;
                ftDeviceInfoListNode.serialNumber = String.valueOf((Object)ftDeviceInfoListNode.serialNumber) + "B";
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode3 = this.mDeviceInfoNode;
                ftDeviceInfoListNode3.description = String.valueOf((Object)ftDeviceInfoListNode3.description) + " B";
                return;
            }
            if (this.mInterfaceID == 3) {
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode = this.mDeviceInfoNode;
                ftDeviceInfoListNode.serialNumber = String.valueOf((Object)ftDeviceInfoListNode.serialNumber) + "C";
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode4 = this.mDeviceInfoNode;
                ftDeviceInfoListNode4.description = String.valueOf((Object)ftDeviceInfoListNode4.description) + " C";
                return;
            }
            if (this.mInterfaceID != 4) return;
            {
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode = this.mDeviceInfoNode;
                ftDeviceInfoListNode.serialNumber = String.valueOf((Object)ftDeviceInfoListNode.serialNumber) + "D";
                D2xxManager.FtDeviceInfoListNode ftDeviceInfoListNode5 = this.mDeviceInfoNode;
                ftDeviceInfoListNode5.description = String.valueOf((Object)ftDeviceInfoListNode5.description) + " D";
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean findDeviceEndpoints() {
        int n = 1;
        int n2 = 0;
        do {
            if (n2 >= this.mUsbInterface.getEndpointCount()) {
                if (this.mBulkOutEndpoint == null) return (boolean)0;
                if (this.mBulkInEndpoint != null) return (boolean)n;
                return (boolean)0;
            }
            StringBuilder stringBuilder = new StringBuilder("EP: ");
            Object[] arrobject = new Object[n];
            arrobject[0] = this.mUsbInterface.getEndpoint(n2).getAddress();
            Log.i((String)"FTDI_Device::", (String)stringBuilder.append(String.format((String)"0x%02X", (Object[])arrobject)).toString());
            if (this.mUsbInterface.getEndpoint(n2).getType() == 2) {
                if (this.mUsbInterface.getEndpoint(n2).getDirection() == 128) {
                    this.mBulkInEndpoint = this.mUsbInterface.getEndpoint(n2);
                    this.mMaxPacketSize = this.mBulkInEndpoint.getMaxPacketSize();
                } else {
                    this.mBulkOutEndpoint = this.mUsbInterface.getEndpoint(n2);
                }
            } else {
                Log.e((String)"FTDI_Device::", (String)"Not Bulk");
            }
            ++n2;
        } while (true);
    }

    private final boolean ifFt8u232am() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 512 && this.mDeviceInfoNode.iSerialNumber != 0) {
            return true;
        }
        return false;
    }

    private final boolean isBmDevice() {
        if (!(this.isFt232b() || this.isFt2232() || this.isFt232r() || this.isFt2232h() || this.isFt4232h() || this.isFt232h() || this.isFt232ex())) {
            return false;
        }
        return true;
    }

    private final boolean isFt2232() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 1280) {
            return true;
        }
        return false;
    }

    private final boolean isFt2232h() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 1792) {
            return true;
        }
        return false;
    }

    private final boolean isFt232b() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) != 1024 && ((65280 & this.mDeviceInfoNode.bcdDevice) != 512 || this.mDeviceInfoNode.iSerialNumber != 0)) {
            return false;
        }
        return true;
    }

    private final boolean isFt232ex() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 4096) {
            return true;
        }
        return false;
    }

    private final boolean isFt232h() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 2304) {
            return true;
        }
        return false;
    }

    private final boolean isFt232r() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 1536) {
            return true;
        }
        return false;
    }

    private final boolean isHiSpeed() {
        if (!(this.isFt232h() || this.isFt2232h() || this.isFt4232h())) {
            return false;
        }
        return true;
    }

    private boolean purgeRxTx(boolean bl, boolean bl2) {
        int n = 0;
        if (!this.isOpen()) {
            return false;
        }
        if (bl) {
            int n2 = 0;
            do {
                if (n2 >= 6) {
                    if (n <= 0) break;
                    return false;
                }
                n = this.getConnection().controlTransfer(64, 0, 1, this.mInterfaceID, null, 0, 0);
                ++n2;
            } while (true);
            this.mProcessInCtrl.purgeINData();
        }
        boolean bl3 = false;
        if (bl2) {
            int n3 = this.getConnection().controlTransfer(64, 0, 2, this.mInterfaceID, null, 0, 0);
            bl3 = false;
            if (n3 == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    private boolean setBreak(int n) {
        int n2 = n | this.mDeviceInfoNode.breakOnParam;
        if (!this.isOpen()) {
            return false;
        }
        int n3 = this.getConnection().controlTransfer(64, 4, n2, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n3 == 0) {
            bl = true;
        }
        return bl;
    }

    private void setClosed() {
        FT_Device fT_Device = this;
        synchronized (fT_Device) {
            this.mIsOpen = false;
            return;
        }
    }

    private void setOpen() {
        FT_Device fT_Device = this;
        synchronized (fT_Device) {
            this.mIsOpen = true;
            return;
        }
    }

    private final String stringFromUtf16le(byte[] arrby) throws UnsupportedEncodingException {
        return new String(arrby, 2, -2 + arrby[0], "UTF-16LE");
    }

    public void close() {
        FT_Device fT_Device = this;
        synchronized (fT_Device) {
            if (this.mProcessRequestThread != null) {
                this.mProcessRequestThread.interrupt();
            }
            if (this.mBulkInThread != null) {
                this.mBulkInThread.interrupt();
            }
            if (this.mUsbConnection != null) {
                this.mUsbConnection.releaseInterface(this.mUsbInterface);
                this.mUsbConnection.close();
                this.mUsbConnection = null;
            }
            if (this.mProcessInCtrl != null) {
                this.mProcessInCtrl.close();
            }
            this.mProcessRequestThread = null;
            this.mBulkInThread = null;
            this.mBulkIn = null;
            this.mProcessInCtrl = null;
            this.setClosed();
            return;
        }
    }

    public boolean clrDtr() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.getConnection().controlTransfer(64, 1, 256, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public boolean clrRts() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.getConnection().controlTransfer(64, 1, 512, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public boolean eepromErase() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.mEEPROM.eraseEeprom();
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public int eepromGetUserAreaSize() {
        if (!this.isOpen()) {
            return -1;
        }
        return this.mEEPROM.getUserSize();
    }

    public FT_EEPROM eepromRead() {
        if (!this.isOpen()) {
            return null;
        }
        return this.mEEPROM.readEeprom();
    }

    public byte[] eepromReadUserArea(int n) {
        if (!this.isOpen()) {
            return null;
        }
        return this.mEEPROM.readUserData(n);
    }

    public int eepromReadWord(short s) {
        if (!this.isOpen()) {
            return -1;
        }
        return this.mEEPROM.readWord(s);
    }

    public short eepromWrite(FT_EEPROM fT_EEPROM) {
        if (!this.isOpen()) {
            return -1;
        }
        return this.mEEPROM.programEeprom(fT_EEPROM);
    }

    public int eepromWriteUserArea(byte[] arrby) {
        if (!this.isOpen()) {
            return 0;
        }
        return this.mEEPROM.writeUserData(arrby);
    }

    public boolean eepromWriteWord(short s, short s2) {
        if (!this.isOpen()) {
            return false;
        }
        return this.mEEPROM.writeWord(s, s2);
    }

    public byte getBitMode() {
        byte[] arrby = new byte[1];
        if (!this.isOpen()) {
            return -1;
        }
        if (!this.isBmDevice()) {
            return -2;
        }
        if (this.getConnection().controlTransfer(-64, 12, 0, this.mInterfaceID, arrby, arrby.length, 0) == arrby.length) {
            return arrby[0];
        }
        return -3;
    }

    UsbDeviceConnection getConnection() {
        return this.mUsbConnection;
    }

    public D2xxManager.FtDeviceInfoListNode getDeviceInfo() {
        return this.mDeviceInfoNode;
    }

    D2xxManager.DriverParameters getDriverParameters() {
        return this.mDriverParams;
    }

    public long getEventStatus() {
        if (!this.isOpen()) {
            return -1;
        }
        if (this.mProcessInCtrl == null) {
            return -2;
        }
        long l = this.mEventMask;
        this.mEventMask = 0;
        return l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte getLatencyTimer() {
        byte[] arrby = new byte[1];
        if (!this.isOpen()) {
            return -1;
        }
        int n = this.getConnection().controlTransfer(-64, 10, 0, this.mInterfaceID, arrby, arrby.length, 0);
        int n2 = arrby.length;
        byte by = 0;
        if (n != n2) return by;
        return arrby[0];
    }

    public short getLineStatus() {
        if (!this.isOpen()) {
            return -1;
        }
        if (this.mProcessInCtrl == null) {
            return -2;
        }
        return this.mDeviceInfoNode.lineStatus;
    }

    int getMaxPacketSize() {
        return this.mMaxPacketSize;
    }

    public short getModemStatus() {
        if (!this.isOpen()) {
            return -1;
        }
        if (this.mProcessInCtrl == null) {
            return -2;
        }
        this.mEventMask = -3 & this.mEventMask;
        return (short)(255 & this.mDeviceInfoNode.modemStatus);
    }

    public int getQueueStatus() {
        if (!this.isOpen()) {
            return -1;
        }
        if (this.mProcessInCtrl == null) {
            return -2;
        }
        return this.mProcessInCtrl.getBytesAvailable();
    }

    protected UsbDevice getUsbDevice() {
        return this.mUsbDevice;
    }

    final boolean isFt4232h() {
        if ((65280 & this.mDeviceInfoNode.bcdDevice) == 2048) {
            return true;
        }
        return false;
    }

    final boolean isMultiIfDevice() {
        if (!(this.isFt2232() || this.isFt2232h() || this.isFt4232h())) {
            return false;
        }
        return true;
    }

    public boolean isOpen() {
        FT_Device fT_Device = this;
        synchronized (fT_Device) {
            boolean bl = this.mIsOpen;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean openDevice(UsbManager usbManager) {
        void var13_2 = this;
        synchronized (var13_2) {
            boolean bl = this.isOpen();
            if (bl) {
                return false;
            }
            if (usbManager == null) {
                Log.e((String)"FTDI_Device::", (String)"UsbManager cannot be null.");
                return false;
            }
            if (this.getConnection() != null) {
                Log.e((String)"FTDI_Device::", (String)"There should not have an UsbConnection.");
                return false;
            }
            this.setConnection(usbManager.openDevice(this.mUsbDevice));
            if (this.getConnection() == null) {
                Log.e((String)"FTDI_Device::", (String)"UsbConnection cannot be null.");
                return false;
            }
            if (!this.getConnection().claimInterface(this.mUsbInterface, true)) {
                Log.e((String)"FTDI_Device::", (String)"ClaimInteface returned false.");
                return false;
            }
            Log.d((String)"FTDI_Device::", (String)"open SUCCESS");
            if (!super.findDeviceEndpoints()) {
                Log.e((String)"FTDI_Device::", (String)"Failed to find endpoints.");
                return false;
            }
            Log.d((String)"D2XX::", (String)"**********************Device Opened**********************");
            this.mProcessInCtrl = new ProcessInCtrl((FT_Device)this);
            this.mBulkIn = new BulkInWorker((FT_Device)this, this.mProcessInCtrl, this.getConnection(), this.mBulkInEndpoint);
            this.mBulkInThread = new Thread((Runnable)this.mBulkIn);
            this.mBulkInThread.setName("bulkInThread");
            this.mProcessRequestThread = new Thread((Runnable)new ProcessRequestWorker(this.mProcessInCtrl));
            this.mProcessRequestThread.setName("processRequestThread");
            super.purgeRxTx(true, true);
            this.mBulkInThread.start();
            this.mProcessRequestThread.start();
            super.setOpen();
            return true;
        }
    }

    public boolean purge(byte by) {
        int n = by & 1;
        boolean bl = false;
        if (n == 1) {
            bl = true;
        }
        int n2 = by & 2;
        boolean bl2 = false;
        if (n2 == 2) {
            bl2 = true;
        }
        return super.purgeRxTx(bl, bl2);
    }

    public int read(byte[] arrby) {
        return this.read(arrby, arrby.length, this.mDriverParams.getReadTimeout());
    }

    public int read(byte[] arrby, int n) {
        return this.read(arrby, n, this.mDriverParams.getReadTimeout());
    }

    public int read(byte[] arrby, int n, long l) {
        if (!this.isOpen()) {
            return -1;
        }
        if (n <= 0) {
            return -2;
        }
        if (this.mProcessInCtrl == null) {
            return -3;
        }
        return this.mProcessInCtrl.readBulkInData(arrby, n, l);
    }

    public boolean readBufferFull() {
        return this.mProcessInCtrl.isSinkFull();
    }

    public boolean resetDevice() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.getConnection().controlTransfer(64, 0, 0, 0, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public void restartInTask() {
        this.mBulkIn.restart();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean setBaudRate(int n) {
        byte by = 1;
        int[] arrn = new int[2];
        if (!this.isOpen()) {
            return false;
        }
        switch (n) {
            default: {
                by = super.isHiSpeed() && n >= 1200 ? FT_BaudRate.FT_GetDivisorHi(n, arrn) : FT_BaudRate.FT_GetDivisor(n, arrn, super.isBmDevice());
            }
            case 300: {
                arrn[0] = 10000;
                break;
            }
            case 600: {
                arrn[0] = 5000;
                break;
            }
            case 1200: {
                arrn[0] = 2500;
                break;
            }
            case 2400: {
                arrn[0] = 1250;
                break;
            }
            case 4800: {
                arrn[0] = 625;
                break;
            }
            case 9600: {
                arrn[0] = 16696;
                break;
            }
            case 19200: {
                arrn[0] = 32924;
                break;
            }
            case 38400: {
                arrn[0] = 49230;
                break;
            }
            case 57600: {
                arrn[0] = 52;
                break;
            }
            case 115200: {
                arrn[0] = 26;
                break;
            }
            case 230400: {
                arrn[0] = 13;
                break;
            }
            case 460800: {
                arrn[0] = 16390;
                break;
            }
            case 921600: {
                arrn[0] = 32771;
                break;
            }
        }
        if (this.isMultiIfDevice() || super.isFt232h() || super.isFt232ex()) {
            arrn[1] = arrn[1] << 8;
            arrn[1] = 65280 & arrn[1];
            arrn[1] = arrn[1] | this.mInterfaceID;
        }
        boolean bl = false;
        if (by != 1) return bl;
        int n2 = this.getConnection().controlTransfer(64, 3, arrn[0], arrn[1], null, 0, 0);
        bl = false;
        if (n2 != 0) return bl;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean setBitMode(byte by, byte by2) {
        int n = 1;
        int n2 = this.mDeviceInfoNode.type;
        if (!this.isOpen()) {
            return false;
        }
        if (n2 == n) {
            return false;
        }
        if (n2 == 0 && by2 != 0) {
            if ((by2 & 1) == 0) {
                return false;
            }
        } else if (n2 == 4 && by2 != 0) {
            if ((by2 & 29) == 0) {
                return false;
            }
            int n3 = by2 == 2 ? n : 0;
            if (this.mUsbInterface.getId() == 0) {
                n = 0;
            }
            if ((n3 & n) != 0) {
                return false;
            }
        } else if (n2 == 5 && by2 != 0) {
            if ((by2 & 37) == 0) {
                return false;
            }
        } else if (n2 == 6 && by2 != 0) {
            if ((by2 & 95) == 0) {
                return false;
            }
            int n4 = (by2 & 72) > 0 ? n : 0;
            if (this.mUsbInterface.getId() == 0) {
                n = 0;
            }
            if ((n4 & n) != 0) {
                return false;
            }
        } else if (n2 == 7 && by2 != 0) {
            if ((by2 & 7) == 0) {
                return false;
            }
            int n5 = by2 == 2 ? n : 0;
            int n6 = this.mUsbInterface.getId() != 0 ? n : 0;
            int n7 = n5 & n6;
            if (this.mUsbInterface.getId() == n) {
                n = 0;
            }
            if ((n7 & n) != 0) {
                return false;
            }
        } else if (n2 == 8 && by2 != 0 && by2 > 64) {
            return false;
        }
        int n8 = by2 << 8 | by & 255;
        int n9 = this.getConnection().controlTransfer(64, 11, n8, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n9 != 0) return bl;
        return true;
    }

    public boolean setBreakOff() {
        return this.setBreak(0);
    }

    public boolean setBreakOn() {
        return this.setBreak(16384);
    }

    public boolean setChars(byte by, byte by2, byte by3, byte by4) {
        TFtSpecialChars tFtSpecialChars = new TFtSpecialChars();
        tFtSpecialChars.EventChar = by;
        tFtSpecialChars.EventCharEnabled = by2;
        tFtSpecialChars.ErrorChar = by3;
        tFtSpecialChars.ErrorCharEnabled = by4;
        if (!this.isOpen()) {
            return false;
        }
        int n = by & 255;
        if (by2 != 0) {
            n |= 256;
        }
        if (this.getConnection().controlTransfer(64, 6, n, this.mInterfaceID, null, 0, 0) != 0) {
            return false;
        }
        int n2 = by3 & 255;
        if (by4 > 0) {
            n2 |= 256;
        }
        int n3 = this.getConnection().controlTransfer(64, 7, n2, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n3 == 0) {
            this.mTftSpecialChars = tFtSpecialChars;
            bl = true;
        }
        return bl;
    }

    void setConnection(UsbDeviceConnection usbDeviceConnection) {
        this.mUsbConnection = usbDeviceConnection;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean setContext(Context context) {
        void var4_2 = this;
        synchronized (var4_2) {
            boolean bl = false;
            if (context == null) return bl;
            this.mContext = context;
            return true;
        }
    }

    public boolean setDataCharacteristics(byte by, byte by2, byte by3) {
        if (!this.isOpen()) {
            return false;
        }
        short s = (short)((short)(by | by3 << 8) | by2 << 11);
        this.mDeviceInfoNode.breakOnParam = s;
        int n = this.getConnection().controlTransfer(64, 4, (int)s, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    protected void setDriverParameters(D2xxManager.DriverParameters driverParameters) {
        this.mDriverParams.setMaxBufferSize(driverParameters.getMaxBufferSize());
        this.mDriverParams.setMaxTransferSize(driverParameters.getMaxTransferSize());
        this.mDriverParams.setBufferNumber(driverParameters.getBufferNumber());
        this.mDriverParams.setReadTimeout(driverParameters.getReadTimeout());
    }

    public boolean setDtr() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.getConnection().controlTransfer(64, 1, 257, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public boolean setEventNotification(long l) {
        if (!this.isOpen()) {
            return false;
        }
        long l2 = l LCMP 0;
        boolean bl = false;
        if (l2 != false) {
            this.mEventMask = 0;
            this.mEventNotification.Mask = l;
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean setFlowControl(short s, byte by, byte by2) {
        if (!this.isOpen()) {
            return false;
        }
        short s2 = 0;
        if (s == 1024) {
            s2 = (short)((short)(by2 << 8) | by & 255);
        }
        int n = this.getConnection().controlTransfer(64, 2, (int)s2, s | this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n != 0) return bl;
        if (s == 256) {
            return this.setRts();
        }
        bl = false;
        if (s != 512) return bl;
        return this.setDtr();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean setLatencyTimer(byte by) {
        int n = by & 255;
        if (!this.isOpen()) {
            return false;
        }
        if (this.getConnection().controlTransfer(64, 9, n, this.mInterfaceID, null, 0, 0) != 0) return false;
        this.mLatencyTimer = by;
        return true;
    }

    public boolean setRts() {
        if (!this.isOpen()) {
            return false;
        }
        int n = this.getConnection().controlTransfer(64, 1, 514, this.mInterfaceID, null, 0, 0);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        return bl;
    }

    public void stopInTask() {
        try {
            if (!this.mBulkIn.paused()) {
                this.mBulkIn.pause();
            }
            return;
        }
        catch (InterruptedException var1_1) {
            var1_1.printStackTrace();
            return;
        }
    }

    public boolean stoppedInTask() {
        return this.mBulkIn.paused();
    }

    public int write(byte[] arrby) {
        return this.write(arrby, arrby.length, true);
    }

    public int write(byte[] arrby, int n) {
        return this.write(arrby, n, true);
    }

    public int write(byte[] arrby, int n, boolean bl) {
        if (!this.isOpen()) {
            return 0;
        }
        if (n <= 0) {
            return 0;
        }
        UsbRequest usbRequest = new UsbRequest();
        usbRequest.initialize(this.mUsbConnection, this.mBulkOutEndpoint);
        if (bl) {
            usbRequest.setClientData((Object)this);
        }
        boolean bl2 = usbRequest.queue(ByteBuffer.wrap((byte[])arrby), n);
        int n2 = 0;
        if (bl2) {
            n2 = n;
        }
        if (bl) {
            while (this.mUsbConnection.requestWait().getClientData() != this) {
            }
        }
        return n2;
    }
}

