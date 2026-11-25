package android.content;

import android.net.Uri;

public class ContentUris {
    public static Uri withAppendedId(Uri contentUri, long id) {
        return Uri.parse(contentUri.toString() + "/" + id);
    }
}
