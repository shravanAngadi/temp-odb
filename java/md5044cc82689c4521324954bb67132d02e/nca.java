/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package md5044cc82689c4521324954bb67132d02e;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import md5044cc82689c4521324954bb67132d02e.oaa;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class nca
extends oaa
implements View.OnClickListener,
IGCUserPeer {
    public static final String __md_methods = "n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("F.nca, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", nca.class, __md_methods);
    }

    public nca(Context context, int n, List list) throws Throwable {
        super(context, n, list);
        if (this.getClass() == nca.class) {
            Object[] arrobject = new Object[]{context, n, list};
            TypeManager.Activate("F.nca, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Collections.Generic.IList`1<T>, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, arrobject);
        }
    }

    public nca(Context context, int n, Object[] arrobject) throws Throwable {
        super(context, n, arrobject);
        if (this.getClass() == nca.class) {
            Object[] arrobject2 = new Object[]{context, n, arrobject};
            TypeManager.Activate("F.nca, OBDLink, Version=4.2.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:T[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, arrobject2);
        }
    }

    private native void n_onClick(View var1);

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

    public void onClick(View view) {
        super.n_onClick(view);
    }
}

