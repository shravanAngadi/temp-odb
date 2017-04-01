/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  org.achartengine.tools.PanListener
 */
package mono.org.achartengine.tools;

import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;
import org.achartengine.tools.PanListener;

public class PanListenerImplementor
implements IGCUserPeer,
PanListener {
    public static final String __md_methods = "n_panApplied:()V:GetPanAppliedHandler:AChartEngine.Tools.IPanListenerInvoker, AChartLibrary\n";
    private ArrayList refList;

    static {
        Runtime.register("AChartEngine.Tools.IPanListenerImplementor, AChartLibrary, Version=1.0.0.0, Culture=neutral, PublicKeyToken=8afd493e74340029", PanListenerImplementor.class, __md_methods);
    }

    public PanListenerImplementor() throws Throwable {
        if (this.getClass() == PanListenerImplementor.class) {
            TypeManager.Activate("AChartEngine.Tools.IPanListenerImplementor, AChartLibrary, Version=1.0.0.0, Culture=neutral, PublicKeyToken=8afd493e74340029", "", this, new Object[0]);
        }
    }

    private native void n_panApplied();

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

    public void panApplied() {
        this.n_panApplied();
    }
}

