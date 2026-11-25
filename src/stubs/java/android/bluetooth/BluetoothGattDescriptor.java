package android.bluetooth;

import java.util.UUID;

public class BluetoothGattDescriptor {
    public static final int PERMISSION_READ = 0x01;
    public static final int PERMISSION_READ_ENCRYPTED = 0x02;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = 0x04;
    public static final int PERMISSION_WRITE = 0x10;
    public static final int PERMISSION_WRITE_ENCRYPTED = 0x20;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 0x40;
    public static final int PERMISSION_WRITE_SIGNED = 0x80;
    public static final int PERMISSION_WRITE_SIGNED_MITM = 0x100;

    private final UUID mUuid;
    private final int mPermissions;

    public BluetoothGattDescriptor(UUID uuid, int permissions) {
        mUuid = uuid;
        mPermissions = permissions;
    }

    public UUID getUuid() {
        return mUuid;
    }

    public int getPermissions() {
        return mPermissions;
    }
}
