package android.os;

import java.io.File;

public class Environment {
    public static String DIRECTORY_DOWNLOADS = "Download";

    public static File getExternalStorageDirectory() {
        return new File("/sdcard");
    }

    public static File getRootDirectory() {
        return new File("/system");
    }
}
