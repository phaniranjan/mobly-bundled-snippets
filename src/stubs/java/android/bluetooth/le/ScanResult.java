package android.bluetooth.le;

import android.bluetooth.BluetoothDevice;

public final class ScanResult {
    public BluetoothDevice getDevice() {
        return new BluetoothDevice();
    }

    public int getRssi() {
        return 0;
    }

    public ScanRecord getScanRecord() {
        return new ScanRecord();
    }

    public long getTimestampNanos() {
        return 0L;
    }
}
