package android.net.wifi;

public class WifiInfo {
    public int getNetworkId() {
        return -1;
    }

    public int getFrequency() {
        return 0;
    }

    public int getRssi() {
        return 0;
    }

    public int getMaxSupportedTxLinkSpeedMbps() {
        return 0;
    }

    public String getSSID() {
        return "";
    }

    public SupplicantState getSupplicantState() {
        return SupplicantState.DISCONNECTED;
    }
}
