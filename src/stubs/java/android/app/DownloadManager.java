package android.app;

import android.net.Uri;

public class DownloadManager {
    public static final String ACTION_DOWNLOAD_COMPLETE =
            "android.intent.action.DOWNLOAD_COMPLETE";

    public long enqueue(Request request) {
        return 0L;
    }

    public Uri getUriForDownloadedFile(long id) {
        return null;
    }

    public int remove(long... ids) {
        return 0;
    }

    public static class Request {
        public Request(Uri uri) {}

        public Request setDestinationInExternalPublicDir(String dirType, String subPath) {
            return this;
        }
    }
}
