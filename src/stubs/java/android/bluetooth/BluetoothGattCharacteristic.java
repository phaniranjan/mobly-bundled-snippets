package android.bluetooth;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BluetoothGattCharacteristic {
    public static final int PROPERTY_BROADCAST = 0x01;
    public static final int PROPERTY_READ = 0x02;
    public static final int PROPERTY_WRITE_NO_RESPONSE = 0x04;
    public static final int PROPERTY_WRITE = 0x08;
    public static final int PROPERTY_NOTIFY = 0x10;
    public static final int PROPERTY_INDICATE = 0x20;
    public static final int PROPERTY_SIGNED_WRITE = 0x40;
    public static final int PROPERTY_EXTENDED_PROPS = 0x80;

    public static final int PERMISSION_READ = 0x01;
    public static final int PERMISSION_READ_ENCRYPTED = 0x02;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 0x04;
    public static final int PERMISSION_WRITE = 0x10;
    public static final int PERMISSION_WRITE_ENCRYPTED = 0x20;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 0x40;
    public static final int PERMISSION_WRITE_SIGNED = 0x80;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 0x100;

    private final UUID mUuid;
    private final int mProperties;
    private final int mPermissions;
    private final List<BluetoothGattDescriptor> mDescriptors = new ArrayList<>();
    private byte[] mValue;

    public BluetoothGattCharacteristic(UUID uuid, int properties, int permissions) {
        mUuid = uuid;
        mProperties = properties;
        mPermissions = permissions;
    }

    public boolean addDescriptor(BluetoothGattDescriptor descriptor) {
        return mDescriptors.add(descriptor);
    }

    public List<BluetoothGattDescriptor> getDescriptors() {
        return mDescriptors;
    }

    public UUID getUuid() {
        return mUuid;
    }

    public int getProperties() {
        return mProperties;
    }

    public int getPermissions() {
        return mPermissions;
    }

    public byte[] getValue() {
        return mValue;
    }

    public boolean setValue(byte[] value) {
        mValue = value;
        return true;
    }
}
