package android.accounts;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public class AccountManager {
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_ERROR_MESSAGE = "errorMessage";

    public static AccountManager get(Context context) {
        return new AccountManager();
    }

    public AccountManagerFuture<Bundle> addAccount(
            String accountType,
            String authTokenType,
            String[] requiredFeatures,
            Bundle addAccountOptions,
            Activity activity,
            AccountManagerCallback<Bundle> callback,
            Handler handler) {
        return null;
    }

    public boolean removeAccountExplicitly(Account account) {
        return false;
    }

    public Account[] getAccountsByType(String type) {
        return new Account[0];
    }
}
