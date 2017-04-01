/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ClipboardManager
 *  android.content.ClipboardManager$OnPrimaryClipChangedListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.content;

import android.content.ClipboardManager;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ClipboardManager_OnPrimaryClipChangedListenerImplementor
implements ClipboardManager.OnPrimaryClipChangedListener,
IGCUserPeer {
    public static final String __md_methods = "n_onPrimaryClipChanged:()V:GetOnPrimaryClipChangedHandler:Android.Content.ClipboardManager/IOnPrimaryClipChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Content.ClipboardManager+IOnPrimaryClipChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", ClipboardManager_OnPrimaryClipChangedListenerImplementor.class, __md_methods);
    }

    public ClipboardManager_OnPrimaryClipChangedListenerImplementor() throws Throwable {
        if (this.getClass() == ClipboardManager_OnPrimaryClipChangedListenerImplementor.class) {
            TypeManager.Activate("Android.Content.ClipboardManager+IOnPrimaryClipChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onPrimaryClipChanged();

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

    public void onPrimaryClipChanged() {
        this.n_onPrimaryClipChanged();
    }
}

