package android.bluetooth.le;

import android.os.ParcelUuid;

public final class AdvertiseData {
    private AdvertiseData() {}

    public static final class Builder {
        public Builder setIncludeDeviceName(boolean includeDeviceName) {
            return this;
        }

        public Builder setIncludeTxPowerLevel(boolean includeTxPowerLevel) {
            return this;
        }

        public Builder addServiceUuid(ParcelUuid serviceUuid) {
            return this;
        }

        public Builder addServiceData(ParcelUuid serviceDataUuid, byte[] serviceData) {
            return this;
        }

        public Builder addManufacturerData(int manufacturerId, byte[] manufacturerSpecificData) {
            return this;
        }

        public AdvertiseData build() {
            return new AdvertiseData();
        }
    }
}
