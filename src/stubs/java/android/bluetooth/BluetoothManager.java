package android.bluetooth;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public final class BluetoothManager {
    public List<BluetoothDevice> getConnectedDevices(int profile) {
        return Collections.emptyList();
    }

    public BluetoothGattServer openGattServer(
            Context context, BluetoothGattServerCallback callback) {
        return new BluetoothGattServer();
    }
}
