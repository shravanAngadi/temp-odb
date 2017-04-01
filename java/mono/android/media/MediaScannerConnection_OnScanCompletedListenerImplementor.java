/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaScannerConnection
 *  android.media.MediaScannerConnection$OnScanCompletedListener
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaScannerConnection_OnScanCompletedListenerImplementor
implements MediaScannerConnection.OnScanCompletedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onScanCompleted:(Ljava/lang/String;Landroid/net/Uri;)V:GetOnScanCompleted_Ljava_lang_String_Landroid_net_Uri_Handler:Android.Media.MediaScannerConnection/IOnScanCompletedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaScannerConnection+IOnScanCompletedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaScannerConnection_OnScanCompletedListenerImplementor.class, __md_methods);
    }

    public MediaScannerConnection_OnScanCompletedListenerImplementor() throws Throwable {
        if (this.getClass() == MediaScannerConnection_OnScanCompletedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaScannerConnection+IOnScanCompletedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onScanCompleted(String var1, Uri var2);

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

    public void onScanCompleted(String string2, Uri uri) {
        super.n_onScanCompleted(string2, uri);
    }
}

