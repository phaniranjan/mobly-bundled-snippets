package android.content.pm;

public class PackageManager {
    public static final int PERMISSION_GRANTED = 0;
    public static final String FEATURE_WIFI_AWARE = "android.hardware.wifi.aware";
    public static final String FEATURE_WATCH = "android.hardware.type.watch";

    public boolean hasSystemFeature(String featureName) {
        return false;
    }
}
