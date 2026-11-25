package android.content;

public class SyncAdapterType {
    public final String authority;
    public final String accountType;

    public SyncAdapterType(String authority, String accountType) {
        this.authority = authority;
        this.accountType = accountType;
    }
}
