/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnEventListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.MediaDrm;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaDrm_OnEventListenerImplementor
implements MediaDrm.OnEventListener,
IGCUserPeer {
    public static final String __md_methods = "n_onEvent:(Landroid/media/MediaDrm;[BII[B)V:GetOnEvent_Landroid_media_MediaDrm_arrayBIIarrayBHandler:Android.Media.MediaDrm/IOnEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.MediaDrm+IOnEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaDrm_OnEventListenerImplementor.class, __md_methods);
    }

    public MediaDrm_OnEventListenerImplementor() throws Throwable {
        if (this.getClass() == MediaDrm_OnEventListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaDrm+IOnEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onEvent(MediaDrm var1, byte[] var2, int var3, int var4, byte[] var5);

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

    public void onEvent(MediaDrm mediaDrm, byte[] arrby, int n, int n2, byte[] arrby2) {
        this.n_onEvent(mediaDrm, arrby, n, n2, arrby2);
    }
}

