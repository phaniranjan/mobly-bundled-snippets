package android.net.wifi;

import java.util.BitSet;

public class WifiConfiguration {
    public int networkId;
    public String SSID;
    public String BSSID;
    public String preSharedKey;
    public boolean hiddenSSID;
    public int status;
    public BitSet allowedKeyManagement = new BitSet();

    public static class KeyMgmt {
        public static final int NONE = 0;
        public static final int WPA_PSK = 1;
    }

    public static class Status {
        public static final String[] strings = {"current", "disabled", "enabled"};
    }
}
