/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.media.JetPlayer
 *  android.media.JetPlayer$OnJetEventListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.media;

import android.media.JetPlayer;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class JetPlayer_OnJetEventListenerImplementor
implements JetPlayer.OnJetEventListener,
IGCUserPeer {
    public static final String __md_methods = "n_onJetEvent:(Landroid/media/JetPlayer;SBBBB)V:GetOnJetEvent_Landroid_media_JetPlayer_SBBBBHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetNumQueuedSegmentUpdate:(Landroid/media/JetPlayer;I)V:GetOnJetNumQueuedSegmentUpdate_Landroid_media_JetPlayer_IHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetPauseUpdate:(Landroid/media/JetPlayer;I)V:GetOnJetPauseUpdate_Landroid_media_JetPlayer_IHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onJetUserIdUpdate:(Landroid/media/JetPlayer;II)V:GetOnJetUserIdUpdate_Landroid_media_JetPlayer_IIHandler:Android.Media.JetPlayer/IOnJetEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Media.JetPlayer+IOnJetEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", JetPlayer_OnJetEventListenerImplementor.class, __md_methods);
    }

    public JetPlayer_OnJetEventListenerImplementor() throws Throwable {
        if (this.getClass() == JetPlayer_OnJetEventListenerImplementor.class) {
            TypeManager.Activate("Android.Media.JetPlayer+IOnJetEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onJetEvent(JetPlayer var1, short var2, byte var3, byte var4, byte var5, byte var6);

    private native void n_onJetNumQueuedSegmentUpdate(JetPlayer var1, int var2);

    private native void n_onJetPauseUpdate(JetPlayer var1, int var2);

    private native void n_onJetUserIdUpdate(JetPlayer var1, int var2, int var3);

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

    public void onJetEvent(JetPlayer jetPlayer, short s, byte by, byte by2, byte by3, byte by4) {
        this.n_onJetEvent(jetPlayer, s, by, by2, by3, by4);
    }

    public void onJetNumQueuedSegmentUpdate(JetPlayer jetPlayer, int n) {
        super.n_onJetNumQueuedSegmentUpdate(jetPlayer, n);
    }

    public void onJetPauseUpdate(JetPlayer jetPlayer, int n) {
        super.n_onJetPauseUpdate(jetPlayer, n);
    }

    public void onJetUserIdUpdate(JetPlayer jetPlayer, int n, int n2) {
        super.n_onJetUserIdUpdate(jetPlayer, n, n2);
    }
}

