package android.app;

import android.content.Context;
import android.content.Intent;

public final class PendingIntent {
    public static final int FLAG_IMMUTABLE = 1 << 26;

    public static PendingIntent getBroadcast(
            Context context, int requestCode, Intent intent, int flags) {
        return new PendingIntent();
    }
}
