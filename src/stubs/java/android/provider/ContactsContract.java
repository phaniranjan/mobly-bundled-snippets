package android.provider;

import android.net.Uri;

public final class ContactsContract {
    public static final String AUTHORITY = "com.android.contacts";

    public static class RawContacts {
        public static final Uri CONTENT_URI =
                Uri.parse("content://com.android.contacts/raw_contacts");
        public static final String ACCOUNT_TYPE = "account_type";
        public static final String ACCOUNT_NAME = "account_name";
    }

    public static class Data {
        public static final Uri CONTENT_URI = Uri.parse("content://com.android.contacts/data");
        public static final String RAW_CONTACT_ID = "raw_contact_id";
        public static final String MIMETYPE = "mimetype";
    }

    public static final class CommonDataKinds {
        public static final class Email {
            public static final Uri CONTENT_URI =
                    Uri.parse("content://com.android.contacts/data/emails");
            public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
            public static final String ADDRESS = "data1";
            public static final String TYPE = "data2";
            public static final int TYPE_HOME = 1;
            public static final String CONTACT_ID = "contact_id";
        }
    }
}
