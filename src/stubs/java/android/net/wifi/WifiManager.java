package android.net.wifi;

import android.net.DhcpInfo;
import java.util.Collections;
import java.util.List;

public class WifiManager {
    public static final int WIFI_STATE_DISABLING = 0;
    public static final int WIFI_STATE_DISABLED = 1;
    public static final int WIFI_STATE_ENABLING = 2;
    public static final int WIFI_STATE_ENABLED = 3;
    public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";

    public WifiInfo getConnectionInfo() {
        return new WifiInfo();
    }

    public List<WifiConfiguration> getConfiguredNetworks() {
        return Collections.emptyList();
    }

    public boolean removeNetwork(int netId) {
        return false;
    }

    public int getWifiState() {
        return WIFI_STATE_DISABLED;
    }

    public boolean setWifiEnabled(boolean enabled) {
        return false;
    }

    public boolean startScan() {
        return false;
    }

    public List<ScanResult> getScanResults() {
        return Collections.emptyList();
    }

    public int addNetwork(WifiConfiguration config) {
        return -1;
    }

    public boolean disconnect() {
        return false;
    }

    public boolean enableNetwork(int netId, boolean attemptConnect) {
        return false;
    }

    public boolean reconnect() {
        return false;
    }

    public DhcpInfo getDhcpInfo() {
        return new DhcpInfo();
    }

    public boolean is5GHzBandSupported() {
        return false;
    }

    public boolean isTdlsSupported() {
        return false;
    }

    public boolean isP2pSupported() {
        return false;
    }

    public static class LocalOnlyHotspotCallback {
        public static final int ERROR_NO_CHANNEL = 1;
        public static final int ERROR_GENERIC = 2;
        public static final int ERROR_INCOMPATIBLE_MODE = 3;
        public static final int ERROR_TETHERING_DISALLOWED = 4;
    }
}
