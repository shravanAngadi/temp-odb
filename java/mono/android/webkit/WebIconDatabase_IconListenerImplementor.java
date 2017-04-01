/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.WebIconDatabase
 *  android.webkit.WebIconDatabase$IconListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.webkit;

import android.graphics.Bitmap;
import android.webkit.WebIconDatabase;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WebIconDatabase_IconListenerImplementor
implements WebIconDatabase.IconListener,
IGCUserPeer {
    public static final String __md_methods = "n_onReceivedIcon:(Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnReceivedIcon_Ljava_lang_String_Landroid_graphics_Bitmap_Handler:Android.Webkit.WebIconDatabase/IIconListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Webkit.WebIconDatabase+IIconListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WebIconDatabase_IconListenerImplementor.class, __md_methods);
    }

    public WebIconDatabase_IconListenerImplementor() throws Throwable {
        if (this.getClass() == WebIconDatabase_IconListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebIconDatabase+IIconListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onReceivedIcon(String var1, Bitmap var2);

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

    public void onReceivedIcon(String string2, Bitmap bitmap) {
        super.n_onReceivedIcon(string2, bitmap);
    }
}

