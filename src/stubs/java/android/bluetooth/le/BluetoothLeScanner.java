package android.bluetooth.le;

import java.util.List;

public final class BluetoothLeScanner {
    public void startScan(ScanCallback callback) {}

    public void startScan(
            List<ScanFilter> filters, ScanSettings settings, ScanCallback callback) {}

    public void stopScan(ScanCallback callback) {}
}
