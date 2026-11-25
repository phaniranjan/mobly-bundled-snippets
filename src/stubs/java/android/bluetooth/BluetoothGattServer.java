package android.bluetooth;

import java.util.UUID;

public class BluetoothGattServer {
    public boolean addService(BluetoothGattService service) {
        return false;
    }

    public void close() {}

    public void cancelConnection(BluetoothDevice device) {}

    public BluetoothGattService getService(UUID uuid) {
        return null;
    }

    public int notifyCharacteristicChanged(
            BluetoothDevice device,
            BluetoothGattCharacteristic characteristic,
            boolean confirm,
            byte[] value) {
        return 0;
    }

    public boolean sendResponse(
            BluetoothDevice device, int requestId, int status, int offset, byte[] value) {
        return false;
    }
}
