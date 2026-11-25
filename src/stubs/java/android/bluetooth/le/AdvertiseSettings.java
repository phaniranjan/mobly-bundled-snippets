package android.bluetooth.le;

public final class AdvertiseSettings {
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;

    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = 0;
    public static final int ADVERTISE_TX_POWER_LOW = 1;
    public static final int ADVERTISE_TX_POWER_MEDIUM = 2;
    public static final int ADVERTISE_TX_POWER_HIGH = 3;

    private final int mMode;
    private final int mTxPowerLevel;
    private final int mTimeout;
    private final boolean mConnectable;

    private AdvertiseSettings(int mode, int txPowerLevel, int timeout, boolean connectable) {
        mMode = mode;
        mTxPowerLevel = txPowerLevel;
        mTimeout = timeout;
        mConnectable = connectable;
    }

    public int getMode() {
        return mMode;
    }

    public int getTxPowerLevel() {
        return mTxPowerLevel;
    }

    public int getTimeout() {
        return mTimeout;
    }

    public boolean isConnectable() {
        return mConnectable;
    }

    public static final class Builder {
        private int mMode = ADVERTISE_MODE_LOW_POWER;
        private int mTxPowerLevel = ADVERTISE_TX_POWER_MEDIUM;
        private int mTimeout = 0;
        private boolean mConnectable = true;

        public Builder setAdvertiseMode(int advertiseMode) {
            mMode = advertiseMode;
            return this;
        }

        public Builder setTimeout(int timeoutMillis) {
            mTimeout = timeoutMillis;
            return this;
        }

        public Builder setConnectable(boolean connectable) {
            mConnectable = connectable;
            return this;
        }

        public Builder setTxPowerLevel(int txPowerLevel) {
            mTxPowerLevel = txPowerLevel;
            return this;
        }

        public AdvertiseSettings build() {
            return new AdvertiseSettings(mMode, mTxPowerLevel, mTimeout, mConnectable);
        }
    }
}
