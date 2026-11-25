package android.bluetooth;

import java.util.Collections;
import java.util.List;

public final class BluetoothGatt {
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_READ_NOT_PERMITTED = 0x2;
    public static final int GATT_WRITE_NOT_PERMITTED = 0x3;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = 0x5;
    public static final int GATT_REQUEST_NOT_SUPPORTED = 0x6;
    public static final int GATT_INVALID_OFFSET = 0x7;
    public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 0xd;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = 0xf;
    public static final int GATT_CONNECTION_CONGESTED = 0x8f;
    public static final int GATT_FAILURE = 0x101;

    public List<BluetoothGattService> getServices() {
        return Collections.emptyList();
    }

    public BluetoothDevice getDevice() {
        return new BluetoothDevice();
    }

    public boolean discoverServices() {
        return false;
    }

    public void disconnect() {}

    public boolean readCharacteristic(BluetoothGattCharacteristic characteristic) {
        return false;
    }

    public boolean writeCharacteristic(BluetoothGattCharacteristic characteristic) {
        return false;
    }

    public boolean requestMtu(int mtu) {
        return false;
    }

    public void close() {}
}
