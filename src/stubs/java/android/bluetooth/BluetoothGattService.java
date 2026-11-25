package android.bluetooth;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BluetoothGattService {
    public static final int SERVICE_TYPE_PRIMARY = 0;
    public static final int SERVICE_TYPE_SECONDARY = 1;

    private final UUID mUuid;
    private final int mServiceType;
    private final List<BluetoothGattCharacteristic> mCharacteristics = new ArrayList<>();

    public BluetoothGattService(UUID uuid, int serviceType) {
        mUuid = uuid;
        mServiceType = serviceType;
    }

    public boolean addCharacteristic(BluetoothGattCharacteristic characteristic) {
        return mCharacteristics.add(characteristic);
    }

    public UUID getUuid() {
        return mUuid;
    }

    public int getType() {
        return mServiceType;
    }

    public List<BluetoothGattCharacteristic> getCharacteristics() {
        return mCharacteristics;
    }

    public BluetoothGattCharacteristic getCharacteristic(UUID uuid) {
        for (BluetoothGattCharacteristic c : mCharacteristics) {
            if (uuid.equals(c.getUuid())) {
                return c;
            }
        }
        return null;
    }
}
