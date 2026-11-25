package android.bluetooth.le;

import android.os.ParcelUuid;

public final class ScanFilter {
    private ScanFilter() {}

    public static final class Builder {
        public Builder setServiceUuid(ParcelUuid serviceUuid) {
            return this;
        }

        public ScanFilter build() {
            return new ScanFilter();
        }
    }
}
