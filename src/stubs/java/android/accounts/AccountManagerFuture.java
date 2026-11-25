package android.accounts;

import java.io.IOException;

public interface AccountManagerFuture<V> {
    V getResult() throws AccountsException, IOException;
}
