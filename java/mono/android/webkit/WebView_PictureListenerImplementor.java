/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Picture
 *  android.webkit.WebView
 *  android.webkit.WebView$PictureListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.webkit;

import android.graphics.Picture;
import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WebView_PictureListenerImplementor
implements WebView.PictureListener,
IGCUserPeer {
    public static final String __md_methods = "n_onNewPicture:(Landroid/webkit/WebView;Landroid/graphics/Picture;)V:GetOnNewPicture_Landroid_webkit_WebView_Landroid_graphics_Picture_Handler:Android.Webkit.WebView/IPictureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Webkit.WebView+IPictureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WebView_PictureListenerImplementor.class, __md_methods);
    }

    public WebView_PictureListenerImplementor() throws Throwable {
        if (this.getClass() == WebView_PictureListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebView+IPictureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onNewPicture(WebView var1, Picture var2);

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

    public void onNewPicture(WebView webView, Picture picture) {
        super.n_onNewPicture(webView, picture);
    }
}

