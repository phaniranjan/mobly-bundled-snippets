package android.content;

import android.accounts.Account;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ContentResolver {
    public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
    public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
    public static final String SYNC_EXTRAS_MANUAL = "force";
    public static final String SYNC_EXTRAS_EXPEDITED = "expedited";

    public static Object addStatusChangeListener(int mask, SyncStatusObserver callback) {
        return new Object();
    }

    public static void removeStatusChangeListener(Object handle) {}

    public static SyncAdapterType[] getSyncAdapterTypes() {
        return new SyncAdapterType[0];
    }

    public static boolean getSyncAutomatically(Account account, String authority) {
        return false;
    }

    public static void setSyncAutomatically(Account account, String authority, boolean sync) {}

    public static void requestSync(Account account, String authority, Bundle extras) {}

    public static void cancelSync(Account account, String authority) {}

    public ContentProviderResult[] applyBatch(
            String authority, ArrayList<ContentProviderOperation> operations)
            throws RemoteException, OperationApplicationException {
        return new ContentProviderResult[0];
    }

    public final Cursor query(
            Uri uri,
            String[] projection,
            String selection,
            String[] selectionArgs,
            String sortOrder) {
        return null;
    }

    public final ParcelFileDescriptor openFileDescriptor(Uri uri, String mode)
            throws FileNotFoundException {
        return null;
    }

    public final int delete(Uri url, String where, String[] selectionArgs) {
        return 0;
    }
}
