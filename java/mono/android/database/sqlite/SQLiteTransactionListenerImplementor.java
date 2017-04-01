/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteTransactionListener
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package mono.android.database.sqlite;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SQLiteTransactionListenerImplementor
implements SQLiteTransactionListener,
IGCUserPeer {
    public static final String __md_methods = "n_onBegin:()V:GetOnBeginHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onCommit:()V:GetOnCommitHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onRollback:()V:GetOnRollbackHandler:Android.Database.Sqlite.ISQLiteTransactionListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    static {
        Runtime.register("Android.Database.Sqlite.ISQLiteTransactionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", SQLiteTransactionListenerImplementor.class, __md_methods);
    }

    public SQLiteTransactionListenerImplementor() throws Throwable {
        if (this.getClass() == SQLiteTransactionListenerImplementor.class) {
            TypeManager.Activate("Android.Database.Sqlite.ISQLiteTransactionListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    private native void n_onBegin();

    private native void n_onCommit();

    private native void n_onRollback();

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

    public void onBegin() {
        this.n_onBegin();
    }

    public void onCommit() {
        this.n_onCommit();
    }

    public void onRollback() {
        this.n_onRollback();
    }
}

