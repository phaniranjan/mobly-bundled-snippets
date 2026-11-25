package android.bluetooth.le;

public final class ScanSettings {
    public static final int SCAN_MODE_LOW_POWER = 0;
    public static final int SCAN_MODE_BALANCED = 1;
    public static final int SCAN_MODE_LOW_LATENCY = 2;

    public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
    public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
    public static final int CALLBACK_TYPE_MATCH_LOST = 4;

    private ScanSettings() {}

    public static final class Builder {
        public Builder setScanMode(int scanMode) {
            return this;
        }

        public ScanSettings build() {
            return new ScanSettings();
        }
    }
}
