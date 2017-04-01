/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.audiofx.Visualizer
 *  android.media.audiofx.Visualizer$OnDataCaptureListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media.audiofx;

import android.media.audiofx.Visualizer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Visualizer_OnDataCaptureListenerImplementor
implements Visualizer.OnDataCaptureListener,
IGCUserPeer {
    public static final String __md_methods = "n_onFftDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnFftDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onWaveFormDataCapture:(Landroid/media/audiofx/Visualizer;[BI)V:GetOnWaveFormDataCapture_Landroid_media_audiofx_Visualizer_arrayBIHandler:Android.Media.Audiofx.Visualizer/IOnDataCaptureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.Audiofx.Visualizer+IOnDataCaptureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Visualizer_OnDataCaptureListenerImplementor.class, __md_methods);
    }

    public Visualizer_OnDataCaptureListenerImplementor() throws Throwable {
        if (this.getClass() == Visualizer_OnDataCaptureListenerImplementor.class) {
            TypeManager.Activate("Android.Media.Audiofx.Visualizer+IOnDataCaptureListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onFftDataCapture(Visualizer var1, byte[] var2, int var3);

    private native void n_onWaveFormDataCapture(Visualizer var1, byte[] var2, int var3);

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

    public void onFftDataCapture(Visualizer visualizer, byte[] arrby, int n) {
        super.n_onFftDataCapture(visualizer, arrby, n);
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] arrby, int n) {
        super.n_onWaveFormDataCapture(visualizer, arrby, n);
    }
}

