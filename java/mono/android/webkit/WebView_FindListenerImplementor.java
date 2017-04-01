/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  android.webkit.WebView$FindListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.webkit;

import android.webkit.WebView;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class WebView_FindListenerImplementor
implements WebView.FindListener,
IGCUserPeer {
    public static final String __md_methods = "n_onFindResultReceived:(IIZ)V:GetOnFindResultReceived_IIZHandler:Android.Webkit.WebView/IFindListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Webkit.WebView+IFindListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", WebView_FindListenerImplementor.class, __md_methods);
    }

    public WebView_FindListenerImplementor() throws Throwable {
        if (this.getClass() == WebView_FindListenerImplementor.class) {
            TypeManager.Activate("Android.Webkit.WebView+IFindListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onFindResultReceived(int var1, int var2, boolean var3);

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

    public void onFindResultReceived(int n, int n2, boolean bl) {
        super.n_onFindResultReceived(n, n2, bl);
    }
}

