/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package mono.android.app;

import java.util.ArrayList;

public abstract class IntentService
extends android.app.IntentService {
    ArrayList refList;

    public IntentService() {
        this(null);
    }

    public IntentService(String string2) {
        super(string2);
    }

    public void monodroidAddReference(Object object) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(object);
    }

    public void monodroidClearReferences() {
        if (this.refList != null) {
            this.refList.clear();
        }
    }
}

