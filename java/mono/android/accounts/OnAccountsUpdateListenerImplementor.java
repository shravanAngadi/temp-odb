/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.OnAccountsUpdateListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.accounts;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OnAccountsUpdateListenerImplementor
implements OnAccountsUpdateListener,
IGCUserPeer {
    public static final String __md_methods = "n_onAccountsUpdated:([Landroid/accounts/Account;)V:GetOnAccountsUpdated_arrayLandroid_accounts_Account_Handler:Android.Accounts.IOnAccountsUpdateListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Accounts.IOnAccountsUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", OnAccountsUpdateListenerImplementor.class, __md_methods);
    }

    public OnAccountsUpdateListenerImplementor() throws Throwable {
        if (this.getClass() == OnAccountsUpdateListenerImplementor.class) {
            TypeManager.Activate("Android.Accounts.IOnAccountsUpdateListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onAccountsUpdated(Account[] var1);

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

    public void onAccountsUpdated(Account[] arraccount) {
        super.n_onAccountsUpdated(arraccount);
    }
}

