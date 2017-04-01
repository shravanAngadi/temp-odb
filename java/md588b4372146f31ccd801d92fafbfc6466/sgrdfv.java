/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package md588b4372146f31ccd801d92fafbfc6466;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import md582b5a07626dd05129629b576a190027d.SGaugeDesignerFrameView;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class sgrdfv
extends SGaugeDesignerFrameView
implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("I.sgrdfv, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", sgrdfv.class, __md_methods);
    }

    public sgrdfv(Context context) throws Throwable {
        super(context);
        if (this.getClass() == sgrdfv.class) {
            TypeManager.Activate("I.sgrdfv, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public sgrdfv(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        if (this.getClass() == sgrdfv.class) {
            TypeManager.Activate("I.sgrdfv, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public sgrdfv(Context context, AttributeSet attributeSet, int n) throws Throwable {
        super(context, attributeSet, n);
        if (this.getClass() == sgrdfv.class) {
            Object[] arrobject = new Object[]{context, attributeSet, n};
            TypeManager.Activate("I.sgrdfv, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
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

