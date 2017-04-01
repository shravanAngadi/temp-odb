/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.hardware.usb.UsbDevice
 *  android.hardware.usb.UsbInterface
 *  android.hardware.usb.UsbManager
 *  android.os.Parcelable
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package com.ftdi.j2xx;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Parcelable;
import android.util.Log;
import com.ftdi.j2xx.FT_Device;
import com.ftdi.j2xx.FtVidPid;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class D2xxManager {
    protected static final String ACTION_USB_PERMISSION = "com.ftdi.j2xx";
    public static final int FTDI_BREAK_OFF = 0;
    public static final int FTDI_BREAK_ON = 16384;
    public static final byte FT_BI = 16;
    public static final byte FT_BITMODE_ASYNC_BITBANG = 1;
    public static final byte FT_BITMODE_CBUS_BITBANG = 32;
    public static final byte FT_BITMODE_FAST_SERIAL = 16;
    public static final byte FT_BITMODE_MCU_HOST = 8;
    public static final byte FT_BITMODE_MPSSE = 2;
    public static final byte FT_BITMODE_RESET = 0;
    public static final byte FT_BITMODE_SYNC_BITBANG = 4;
    public static final byte FT_BITMODE_SYNC_FIFO = 64;
    public static final byte FT_CTS = 16;
    public static final byte FT_DATA_BITS_7 = 7;
    public static final byte FT_DATA_BITS_8 = 8;
    public static final byte FT_DCD = -128;
    public static final int FT_DEVICE_2232 = 4;
    public static final int FT_DEVICE_2232H = 6;
    public static final int FT_DEVICE_232B = 0;
    public static final int FT_DEVICE_232H = 8;
    public static final int FT_DEVICE_232R = 5;
    public static final int FT_DEVICE_245R = 5;
    public static final int FT_DEVICE_4232H = 7;
    public static final int FT_DEVICE_8U232AM = 1;
    public static final int FT_DEVICE_UNKNOWN = 3;
    public static final int FT_DEVICE_X_SERIES = 9;
    public static final byte FT_DSR = 32;
    public static final byte FT_EVENT_LINE_STATUS = 4;
    public static final byte FT_EVENT_MODEM_STATUS = 2;
    public static final byte FT_EVENT_REMOVED = 8;
    public static final byte FT_EVENT_RXCHAR = 1;
    public static final byte FT_FE = 8;
    public static final byte FT_FLAGS_HI_SPEED = 2;
    public static final byte FT_FLAGS_OPENED = 1;
    public static final short FT_FLOW_DTR_DSR = 512;
    public static final short FT_FLOW_NONE = 0;
    public static final short FT_FLOW_RTS_CTS = 256;
    public static final short FT_FLOW_XON_XOFF = 1024;
    public static final byte FT_OE = 2;
    public static final byte FT_PARITY_EVEN = 2;
    public static final byte FT_PARITY_MARK = 3;
    public static final byte FT_PARITY_NONE = 0;
    public static final byte FT_PARITY_ODD = 1;
    public static final byte FT_PARITY_SPACE = 4;
    public static final byte FT_PE = 4;
    public static final byte FT_PURGE_RX = 1;
    public static final byte FT_PURGE_TX = 2;
    public static final byte FT_RI = 64;
    public static final byte FT_STOP_BITS_1 = 0;
    public static final byte FT_STOP_BITS_2 = 2;
    private static final String TAG = "D2xx::";
    private static Context mContext;
    private static D2xxManager mInstance;
    private static PendingIntent mPendingIntent;
    private static IntentFilter mPermissionFilter;
    private static List<FtVidPid> mSupportedDevices;
    private static BroadcastReceiver mUsbDevicePermissions;
    private static UsbManager mUsbManager;
    private ArrayList<FT_Device> mFtdiDevices;
    private BroadcastReceiver mUsbPlugEvents;

    static {
        mInstance = null;
        mContext = null;
        mPendingIntent = null;
        mPermissionFilter = null;
        Object[] arrobject = new FtVidPid[]{new FtVidPid(1027, 24597), new FtVidPid(1027, 24596), new FtVidPid(1027, 24593), new FtVidPid(1027, 24592), new FtVidPid(1027, 24577), new FtVidPid(1027, 24582), new FtVidPid(1027, 64193), new FtVidPid(1027, 64194), new FtVidPid(1027, 64195), new FtVidPid(1027, 64196), new FtVidPid(1027, 64197), new FtVidPid(1027, 64198), new FtVidPid(1027, 24594), new FtVidPid(2220, 4133), new FtVidPid(5590, 1), new FtVidPid(1027, 24599)};
        mSupportedDevices = new ArrayList((Collection)Arrays.asList((Object[])arrobject));
        mUsbDevicePermissions = new BroadcastReceiver(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onReceive(Context context, Intent intent) {
                if (!"com.ftdi.j2xx".equals((Object)intent.getAction())) {
                    return;
                }
                void var6_3 = this;
                synchronized (var6_3) {
                    UsbDevice usbDevice = (UsbDevice)intent.getParcelableExtra("device");
                    if (!intent.getBooleanExtra("permission", false)) {
                        Log.d((String)"D2xx::", (String)("permission denied for device " + (Object)usbDevice));
                    }
                    return;
                }
            }
        };
    }

    private D2xxManager(Context context) throws D2xxException {
        this.mUsbPlugEvents = new BroadcastReceiver(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onReceive(Context context, Intent intent) {
                String string2 = intent.getAction();
                if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals((Object)string2)) {
                    UsbDevice usbDevice = (UsbDevice)intent.getParcelableExtra("device");
                    FT_Device fT_Device = D2xxManager.this.findDevice(usbDevice);
                    while (fT_Device != null) {
                        ArrayList arrayList;
                        fT_Device.close();
                        ArrayList arrayList2 = arrayList = D2xxManager.this.mFtdiDevices;
                        synchronized (arrayList2) {
                            D2xxManager.this.mFtdiDevices.remove((Object)fT_Device);
                        }
                        fT_Device = D2xxManager.this.findDevice(usbDevice);
                    }
                    return;
                }
                if (!"android.hardware.usb.action.USB_DEVICE_ATTACHED".equals((Object)string2)) {
                    return;
                }
                UsbDevice usbDevice = (UsbDevice)intent.getParcelableExtra("device");
                D2xxManager.this.addUsbDevice(usbDevice);
            }
        };
        Log.v((String)"D2xx::", (String)"Start constructor");
        if (context == null) {
            throw new D2xxException("D2xx init failed: Can not find parentContext!");
        }
        D2xxManager.updateContext(context);
        if (!D2xxManager.findUsbManger()) {
            throw new D2xxException("D2xx init failed: Can not find UsbManager!");
        }
        this.mFtdiDevices = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        context.getApplicationContext().registerReceiver(this.mUsbPlugEvents, intentFilter);
        Log.v((String)"D2xx::", (String)"End constructor");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void clearDevices() {
        ArrayList<FT_Device> arrayList;
        ArrayList<FT_Device> arrayList2 = arrayList = this.mFtdiDevices;
        synchronized (arrayList2) {
            int n = this.mFtdiDevices.size();
            int n2 = 0;
            while (n2 < n) {
                this.mFtdiDevices.remove(n2);
                ++n2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private FT_Device findDevice(UsbDevice usbDevice) {
        ArrayList<FT_Device> arrayList;
        ArrayList<FT_Device> arrayList2 = arrayList = this.mFtdiDevices;
        synchronized (arrayList2) {
            int n = this.mFtdiDevices.size();
            int n2 = 0;
            while (n2 < n) {
                FT_Device fT_Device = (FT_Device)this.mFtdiDevices.get(n2);
                if (fT_Device.getUsbDevice().equals((Object)usbDevice)) {
                    return fT_Device;
                }
                ++n2;
            }
            return null;
        }
    }

    private static boolean findUsbManger() {
        if (mUsbManager == null && mContext != null) {
            mUsbManager = (UsbManager)mContext.getApplicationContext().getSystemService("usb");
        }
        if (mUsbManager == null) {
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static D2xxManager getInstance(Context context) throws D2xxException {
        reference var4_1 = D2xxManager.class;
        synchronized (D2xxManager.class) {
            if (mInstance == null) {
                mInstance = new D2xxManager(context);
            }
            if (context == null) return mInstance;
            D2xxManager.updateContext(context);
            return mInstance;
        }
    }

    public static int getLibraryVersion() {
        return 268435456;
    }

    private boolean isPermitted(UsbDevice usbDevice) {
        if (!mUsbManager.hasPermission(usbDevice)) {
            mUsbManager.requestPermission(usbDevice, mPendingIntent);
        }
        boolean bl = mUsbManager.hasPermission(usbDevice);
        boolean bl2 = false;
        if (bl) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean tryOpen(Context context, FT_Device fT_Device, DriverParameters driverParameters) {
        if (fT_Device == null) {
            return false;
        }
        if (context == null) {
            return false;
        }
        fT_Device.setContext(context);
        if (driverParameters != null) {
            fT_Device.setDriverParameters(driverParameters);
        }
        boolean bl = fT_Device.openDevice(mUsbManager);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = fT_Device.isOpen();
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean updateContext(Context context) {
        reference var4_1 = D2xxManager.class;
        synchronized (D2xxManager.class) {
            if (context == null) {
                return false;
            }
            if (mContext == context) return true;
            mContext = context;
            mPendingIntent = PendingIntent.getBroadcast((Context)mContext.getApplicationContext(), (int)0, (Intent)new Intent("com.ftdi.j2xx"), (int)134217728);
            mPermissionFilter = new IntentFilter("com.ftdi.j2xx");
            mContext.getApplicationContext().registerReceiver(mUsbDevicePermissions, mPermissionFilter);
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int addUsbDevice(UsbDevice usbDevice) {
        boolean bl = this.isFtDevice(usbDevice);
        int n = 0;
        if (bl) {
            int n2 = usbDevice.getInterfaceCount();
            for (int i = 0; i < n2; ++i) {
                ArrayList<FT_Device> arrayList;
                if (!super.isPermitted(usbDevice)) continue;
                ArrayList<FT_Device> arrayList2 = arrayList = this.mFtdiDevices;
                synchronized (arrayList2) {
                    FT_Device fT_Device = super.findDevice(usbDevice);
                    if (fT_Device == null) {
                        fT_Device = new FT_Device(mContext, mUsbManager, usbDevice, usbDevice.getInterface(i));
                    } else {
                        fT_Device.setContext(mContext);
                    }
                    this.mFtdiDevices.add((Object)fT_Device);
                    ++n;
                    continue;
                }
            }
        }
        return n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public int createDeviceInfoList(Context var1) {
        var2_2 = D2xxManager.mUsbManager.getDeviceList().values().iterator();
        var3_3 = new ArrayList();
        if (var1 == null) {
            return 0;
        }
        D2xxManager.updateContext(var1);
        block6 : do lbl-1000: // 3 sources:
        {
            if (!var2_2.hasNext()) {
                var17_11 = var14_10 = this.mFtdiDevices;
                // MONITORENTER : var17_11
                super.clearDevices();
                this.mFtdiDevices = var3_3;
                var16_12 = this.mFtdiDevices.size();
                // MONITOREXIT : var17_11
                return var16_12;
            }
            var5_5 = (UsbDevice)var2_2.next();
            if (!this.isFtDevice(var5_5)) ** GOTO lbl-1000
            var6_8 = var5_5.getInterfaceCount();
            var7_7 = 0;
            do {
                if (var7_7 >= var6_8) continue block6;
                if (super.isPermitted(var5_5)) {
                    var18_9 = var8_4 = this.mFtdiDevices;
                    // MONITORENTER : var18_9
                    var10_6 = super.findDevice(var5_5);
                    if (var10_6 == null) {
                        var10_6 = new FT_Device(var1, D2xxManager.mUsbManager, var5_5, var5_5.getInterface(var7_7));
                    } else {
                        this.mFtdiDevices.remove((Object)var10_6);
                        var10_6.setContext(var1);
                    }
                    var3_3.add((Object)var10_6);
                    // MONITOREXIT : var18_9
                }
                ++var7_7;
            } while (true);
            break;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getDeviceInfoList(int n, FtDeviceInfoListNode[] arrftDeviceInfoListNode) {
        void var6_3 = this;
        synchronized (var6_3) {
            int n2 = 0;
            while (n2 < n) {
                arrftDeviceInfoListNode[n2] = ((FT_Device)this.mFtdiDevices.get((int)n2)).mDeviceInfoNode;
                ++n2;
            }
            return this.mFtdiDevices.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FtDeviceInfoListNode getDeviceInfoListDetail(int n) {
        void var5_2 = this;
        synchronized (var5_2) {
            int n2 = this.mFtdiDevices.size();
            if (n > n2) return null;
            if (n >= 0) return ((FT_Device)this.mFtdiDevices.get((int)n)).mDeviceInfoNode;
            return null;
        }
    }

    public int[][] getVIDPID() {
        int n = mSupportedDevices.size();
        int[] arrn = new int[]{2, n};
        int[][] arrn2 = (int[][])Array.newInstance((Class)Integer.TYPE, (int[])arrn);
        int n2 = 0;
        while (n2 < n) {
            FtVidPid ftVidPid = (FtVidPid)mSupportedDevices.get(n2);
            arrn2[0][n2] = ftVidPid.getVid();
            arrn2[1][n2] = ftVidPid.getPid();
            ++n2;
        }
        return arrn2;
    }

    public boolean isFtDevice(UsbDevice usbDevice) {
        if (mContext == null) {
            return false;
        }
        FtVidPid ftVidPid = new FtVidPid(usbDevice.getVendorId(), usbDevice.getProductId());
        boolean bl = mSupportedDevices.contains((Object)ftVidPid);
        boolean bl2 = false;
        if (bl) {
            bl2 = true;
        }
        Log.v((String)"D2xx::", (String)ftVidPid.toString());
        return bl2;
    }

    public FT_Device openByDescription(Context context, String string2) {
        void var5_3 = this;
        synchronized (var5_3) {
            FT_Device fT_Device = this.openByDescription(context, string2, null);
            return fT_Device;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public FT_Device openByDescription(Context var1, String var2_3, DriverParameters var3_2) {
        var14_4 = this;
        // MONITORENTER : var14_4
        if (var1 == null) {
            var13_5 = null;
            // MONITOREXIT : var14_4
            return var13_5;
        }
        D2xxManager.updateContext(var1);
        var6_6 = 0;
        do {
            var7_11 = this.mFtdiDevices.size();
            var8_7 = null;
            if (var6_6 >= var7_11) ** GOTO lbl22
            var9_8 = (FT_Device)this.mFtdiDevices.get(var6_6);
            if (var9_8 != null) {
                var10_10 = var9_8.mDeviceInfoNode;
                if (var10_10 == null) {
                    Log.d((String)"D2xx::", (String)"***devInfo cannot be null***");
                } else {
                    var12_9 = var10_10.description.equals((Object)var2_3);
                    if (var12_9) {
                        var8_7 = var9_8;
lbl22: // 2 sources:
                        if (super.tryOpen(var1, var8_7, var3_2) != false) return var8_7;
                        return null;
                    }
                }
            }
            ++var6_6;
        } while (true);
    }

    public FT_Device openByIndex(Context context, int n) {
        void var5_3 = this;
        synchronized (var5_3) {
            FT_Device fT_Device = this.openByIndex(context, n, null);
            return fT_Device;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public FT_Device openByIndex(Context context, int n, DriverParameters driverParameters) {
        void var9_4 = this;
        synchronized (var9_4) {
            if (n < 0) {
                return null;
            }
            if (context == null) {
                return null;
            }
            D2xxManager.updateContext(context);
            FT_Device fT_Device = (FT_Device)this.mFtdiDevices.get(n);
            boolean bl = super.tryOpen(context, fT_Device, driverParameters);
            if (bl) return fT_Device;
            return null;
        }
    }

    public FT_Device openByLocation(Context context, int n) {
        void var5_3 = this;
        synchronized (var5_3) {
            FT_Device fT_Device = this.openByLocation(context, n, null);
            return fT_Device;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public FT_Device openByLocation(Context var1, int var2_3, DriverParameters var3_2) {
        var14_4 = this;
        // MONITORENTER : var14_4
        if (var1 == null) {
            var13_5 = null;
            // MONITOREXIT : var14_4
            return var13_5;
        }
        D2xxManager.updateContext(var1);
        var6_6 = 0;
        do {
            var7_11 = this.mFtdiDevices.size();
            var8_7 = null;
            if (var6_6 >= var7_11) ** GOTO lbl22
            var9_8 = (FT_Device)this.mFtdiDevices.get(var6_6);
            if (var9_8 != null) {
                var10_10 = var9_8.mDeviceInfoNode;
                if (var10_10 == null) {
                    Log.d((String)"D2xx::", (String)"***devInfo cannot be null***");
                } else {
                    var12_9 = var10_10.location;
                    if (var12_9 == var2_3) {
                        var8_7 = var9_8;
lbl22: // 2 sources:
                        if (super.tryOpen(var1, var8_7, var3_2) != false) return var8_7;
                        return null;
                    }
                }
            }
            ++var6_6;
        } while (true);
    }

    public FT_Device openBySerialNumber(Context context, String string2) {
        void var5_3 = this;
        synchronized (var5_3) {
            FT_Device fT_Device = this.openBySerialNumber(context, string2, null);
            return fT_Device;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public FT_Device openBySerialNumber(Context var1, String var2_3, DriverParameters var3_2) {
        var14_4 = this;
        // MONITORENTER : var14_4
        if (var1 == null) {
            var13_5 = null;
            // MONITOREXIT : var14_4
            return var13_5;
        }
        D2xxManager.updateContext(var1);
        var6_6 = 0;
        do {
            var7_11 = this.mFtdiDevices.size();
            var8_7 = null;
            if (var6_6 >= var7_11) ** GOTO lbl22
            var9_8 = (FT_Device)this.mFtdiDevices.get(var6_6);
            if (var9_8 != null) {
                var10_10 = var9_8.mDeviceInfoNode;
                if (var10_10 == null) {
                    Log.d((String)"D2xx::", (String)"***devInfo cannot be null***");
                } else {
                    var12_9 = var10_10.serialNumber.equals((Object)var2_3);
                    if (var12_9) {
                        var8_7 = var9_8;
lbl22: // 2 sources:
                        if (super.tryOpen(var1, var8_7, var3_2) != false) return var8_7;
                        return null;
                    }
                }
            }
            ++var6_6;
        } while (true);
    }

    public FT_Device openByUsbDevice(Context context, UsbDevice usbDevice) {
        void var5_3 = this;
        synchronized (var5_3) {
            FT_Device fT_Device = this.openByUsbDevice(context, usbDevice, null);
            return fT_Device;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public FT_Device openByUsbDevice(Context context, UsbDevice usbDevice, DriverParameters driverParameters) {
        void var8_4 = this;
        synchronized (var8_4) {
            boolean bl = this.isFtDevice(usbDevice);
            FT_Device fT_Device = null;
            if (!bl) return fT_Device;
            fT_Device = super.findDevice(usbDevice);
            boolean bl2 = super.tryOpen(context, fT_Device, driverParameters);
            if (bl2) return fT_Device;
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean setVIDPID(int n, int n2) {
        boolean bl = false;
        if (n != 0 && n2 != 0) {
            FtVidPid ftVidPid = new FtVidPid(n, n2);
            if (mSupportedDevices.contains((Object)ftVidPid)) {
                Log.i((String)"D2xx::", (String)("Existing vid:" + n + "  pid:" + n2));
                return true;
            }
            if (mSupportedDevices.add((Object)ftVidPid)) return true;
            Log.d((String)"D2xx::", (String)"Failed to add VID/PID combination to list.");
            return bl;
        }
        Log.d((String)"D2xx::", (String)"Invalid parameter to setVIDPID");
        return false;
    }

    public static class D2xxException
    extends IOException {
        private static final long serialVersionUID = 1;

        public D2xxException() {
        }

        public D2xxException(String string2) {
            super(string2);
        }
    }

    public static class DriverParameters {
        private int mBufferSize = 16384;
        private int mMaxTransferSize = 16384;
        private int mNrBuffers = 16;
        private int mRxTimeout = 5000;

        public int getBufferNumber() {
            return this.mNrBuffers;
        }

        public int getMaxBufferSize() {
            return this.mBufferSize;
        }

        public int getMaxTransferSize() {
            return this.mMaxTransferSize;
        }

        public int getReadTimeout() {
            return this.mRxTimeout;
        }

        public boolean setBufferNumber(int n) {
            if (n >= 2 && n <= 16) {
                this.mNrBuffers = n;
                return true;
            }
            Log.e((String)"D2xx::", (String)"***nrBuffers Out of correct range***");
            return false;
        }

        public boolean setMaxBufferSize(int n) {
            if (n >= 64 && n <= 16384) {
                this.mBufferSize = n;
                return true;
            }
            Log.e((String)"D2xx::", (String)"***bufferSize Out of correct range***");
            return false;
        }

        public boolean setMaxTransferSize(int n) {
            if (n >= 64 && n <= 16384) {
                this.mMaxTransferSize = n;
                return true;
            }
            Log.e((String)"D2xx::", (String)"***maxTransferSize Out of correct range***");
            return false;
        }

        public boolean setReadTimeout(int n) {
            this.mRxTimeout = n;
            return true;
        }
    }

    public static class FtDeviceInfoListNode {
        public short bcdDevice;
        public int breakOnParam;
        public String description;
        public int flags;
        public int handle;
        public byte iSerialNumber;
        public int id;
        public short lineStatus;
        public int location;
        public short modemStatus;
        public String serialNumber;
        public int type;
    }

}

