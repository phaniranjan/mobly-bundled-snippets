package android.content;

import android.content.pm.PackageManager;
import android.os.Handler;

public class Context {
    public static final String AUDIO_SERVICE = "audio";
    public static final String MEDIA_ROUTER_SERVICE = "media_router";
    public static final String DOWNLOAD_SERVICE = "download";
    public static final String TELEPHONY_SERVICE = "phone";
    public static final String TELEPHONY_SUBSCRIPTION_SERVICE = "telephony_subscription_service";
    public static final String WIFI_AWARE_SERVICE = "wifiaware";
    public static final String WIFI_SERVICE = "wifi";
    public static final String CONNECTIVITY_SERVICE = "connectivity";
    public static final String BLUETOOTH_SERVICE = "bluetooth";
    public static final int RECEIVER_EXPORTED = 2;

    public Object getSystemService(String name) {
        return null;
    }

    public Context getApplicationContext() {
        return this;
    }

    public ContentResolver getContentResolver() {
        return new ContentResolver();
    }

    public PackageManager getPackageManager() {
        return new PackageManager();
    }

    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return null;
    }

    public Intent registerReceiver(
            BroadcastReceiver receiver,
            IntentFilter filter,
            String broadcastPermission,
            Handler scheduler,
            int flags) {
        return null;
    }

    public void unregisterReceiver(BroadcastReceiver receiver) {}

    public void startActivity(Intent intent) {}

    public int checkCallingOrSelfPermission(String permission) {
        return PackageManager.PERMISSION_GRANTED;
    }
}
