/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.UiAutomation
 *  android.app.UiAutomation$OnAccessibilityEventListener
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.app;

import android.app.UiAutomation;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class UiAutomation_OnAccessibilityEventListenerImplementor
implements UiAutomation.OnAccessibilityEventListener,
IGCUserPeer {
    public static final String __md_methods = "n_onAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)V:GetOnAccessibilityEvent_Landroid_view_accessibility_AccessibilityEvent_Handler:Android.App.UiAutomation/IOnAccessibilityEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.App.UiAutomation+IOnAccessibilityEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", UiAutomation_OnAccessibilityEventListenerImplementor.class, __md_methods);
    }

    public UiAutomation_OnAccessibilityEventListenerImplementor() throws Throwable {
        if (this.getClass() == UiAutomation_OnAccessibilityEventListenerImplementor.class) {
            TypeManager.Activate("Android.App.UiAutomation+IOnAccessibilityEventListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onAccessibilityEvent(AccessibilityEvent var1);

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

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.n_onAccessibilityEvent(accessibilityEvent);
    }
}

