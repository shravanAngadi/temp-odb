/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 *  android.media.AudioRecord$OnRecordPositionUpdateListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.AudioRecord;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AudioRecord_OnRecordPositionUpdateListenerImplementor
implements AudioRecord.OnRecordPositionUpdateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onMarkerReached:(Landroid/media/AudioRecord;)V:GetOnMarkerReached_Landroid_media_AudioRecord_Handler:Android.Media.AudioRecord/IOnRecordPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onPeriodicNotification:(Landroid/media/AudioRecord;)V:GetOnPeriodicNotification_Landroid_media_AudioRecord_Handler:Android.Media.AudioRecord/IOnRecordPositionUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.AudioRecord+IOnRecordPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AudioRecord_OnRecordPositionUpdateListenerImplementor.class, __md_methods);
    }

    public AudioRecord_OnRecordPositionUpdateListenerImplementor() throws Throwable {
        if (this.getClass() == AudioRecord_OnRecordPositionUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Media.AudioRecord+IOnRecordPositionUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onMarkerReached(AudioRecord var1);

    private native void n_onPeriodicNotification(AudioRecord var1);

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

    public void onMarkerReached(AudioRecord audioRecord) {
        super.n_onMarkerReached(audioRecord);
    }

    public void onPeriodicNotification(AudioRecord audioRecord) {
        super.n_onPeriodicNotification(audioRecord);
    }
}

