/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md5aea0e7da2025b66d2a930da74f0cb596;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class NameValueUnitsEditRow
extends LinearLayout
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("OCTech.Mobile.Applications.Screens.Common.NameValueUnitsEditRow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", NameValueUnitsEditRow.class, __md_methods);
    }

    public NameValueUnitsEditRow(Context context) throws Throwable {
        super(context);
        if (this.getClass() == NameValueUnitsEditRow.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Screens.Common.NameValueUnitsEditRow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public NameValueUnitsEditRow(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == NameValueUnitsEditRow.class) {
            TypeManager.Activate("OCTech.Mobile.Applications.Screens.Common.NameValueUnitsEditRow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public NameValueUnitsEditRow(Context context, AttributeSet attributeSet, int n) throws Throwable {
        super(context, attributeSet, n);
        if (this.getClass() == NameValueUnitsEditRow.class) {
            Object[] arrobject = new Object[]{context, attributeSet, n};
            TypeManager.Activate("OCTech.Mobile.Applications.Screens.Common.NameValueUnitsEditRow, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    @Override
    public void monodroidAddReference(Object object) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(object);
    }

    @Override
    public void monodroidClearReferences() {
        if (this.refList != null) {
            this.refList.clear();
        }
    }
}

