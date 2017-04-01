/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaRecorder
 *  android.media.MediaRecorder$OnErrorListener
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

public class MediaRecorder_OnErrorListenerImplementor
implements MediaRecorder.OnErrorListener,
IGCUserPeer {
    public static final String __md_methods = "n_onError:(Landroid/media/MediaRecorder;II)V:GetOnError_Landroid_media_MediaRecorder_IIHandler:Android.Media.MediaRecorder/IOnErrorListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaRecorder+IOnErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaRecorder_OnErrorListenerImplementor.class, __md_methods);
    }

    public MediaRecorder_OnErrorListenerImplementor() throws Throwable {
        if (this.getClass() == MediaRecorder_OnErrorListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaRecorder+IOnErrorListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onError(MediaRecorder var1, int var2, int var3);

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

    public void onError(MediaRecorder mediaRecorder, int n, int n2) {
        super.n_onError(mediaRecorder, n, n2);
    }
}

