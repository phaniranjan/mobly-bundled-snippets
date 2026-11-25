package android.content;

import android.net.Uri;

public class ContentProviderOperation {
    public static Builder newInsert(Uri uri) {
        return new Builder();
    }

    public static Builder newDelete(Uri uri) {
        return new Builder();
    }

    public static class Builder {
        public Builder withValue(String key, Object value) {
            return this;
        }

        public Builder withValueBackReference(String key, int previousResult) {
            return this;
        }

        public ContentProviderOperation build() {
            return new ContentProviderOperation();
        }
    }
}
