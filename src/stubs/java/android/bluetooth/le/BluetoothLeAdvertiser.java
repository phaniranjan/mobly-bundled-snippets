package android.bluetooth.le;

public final class BluetoothLeAdvertiser {
    public void startAdvertising(
            AdvertiseSettings settings, AdvertiseData advertiseData, AdvertiseCallback callback) {}

    public void startAdvertising(
            AdvertiseSettings settings,
            AdvertiseData advertiseData,
            AdvertiseData scanResponse,
            AdvertiseCallback callback) {}

    public void stopAdvertising(AdvertiseCallback callback) {}
}
