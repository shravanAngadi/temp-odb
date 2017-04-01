/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Loader
 *  android.content.Loader$OnLoadCompleteListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.content;

import android.content.Loader;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class Loader_OnLoadCompleteListenerImplementor
implements Loader.OnLoadCompleteListener,
IGCUserPeer {
    public static final String __md_methods = "n_onLoadComplete:(Landroid/content/Loader;Ljava/lang/Object;)V:GetOnLoadComplete_Landroid_content_Loader_Ljava_lang_Object_Handler:Android.Content.Loader/IOnLoadCompleteListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Content.Loader+IOnLoadCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", Loader_OnLoadCompleteListenerImplementor.class, __md_methods);
    }

    public Loader_OnLoadCompleteListenerImplementor() throws Throwable {
        if (this.getClass() == Loader_OnLoadCompleteListenerImplementor.class) {
            TypeManager.Activate("Android.Content.Loader+IOnLoadCompleteListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onLoadComplete(Loader var1, Object var2);

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

    public void onLoadComplete(Loader loader, Object object) {
        super.n_onLoadComplete(loader, object);
    }
}

