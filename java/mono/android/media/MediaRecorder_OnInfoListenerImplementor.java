/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRecorder
 *  android.media.MediaRecorder$OnInfoListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.MediaRecorder;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaRecorder_OnInfoListenerImplementor
implements MediaRecorder.OnInfoListener,
IGCUserPeer {
    public static final String __md_methods = "n_onInfo:(Landroid/media/MediaRecorder;II)V:GetOnInfo_Landroid_media_MediaRecorder_IIHandler:Android.Media.MediaRecorder/IOnInfoListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaRecorder+IOnInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaRecorder_OnInfoListenerImplementor.class, __md_methods);
    }

    public MediaRecorder_OnInfoListenerImplementor() throws Throwable {
        if (this.getClass() == MediaRecorder_OnInfoListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaRecorder+IOnInfoListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onInfo(MediaRecorder var1, int var2, int var3);

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

    public void onInfo(MediaRecorder mediaRecorder, int n, int n2) {
        super.n_onInfo(mediaRecorder, n, n2);
    }
}

