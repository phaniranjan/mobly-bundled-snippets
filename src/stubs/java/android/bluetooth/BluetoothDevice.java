package android.bluetooth;

import android.content.Context;
import android.os.ParcelUuid;
import android.os.Parcelable;

public final class BluetoothDevice implements Parcelable {
    public static final int BOND_NONE = 10;
    public static final int BOND_BONDING = 11;
    public static final int BOND_BONDED = 12;

    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_CLASSIC = 1;
    public static final int DEVICE_TYPE_LE = 2;
    public static final int DEVICE_TYPE_DUAL = 3;

    public static final String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
    public static final String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
    public static final String ACTION_PAIRING_REQUEST =
            "android.bluetooth.device.action.PAIRING_REQUEST";

    private final String mAddress;

    public BluetoothDevice() {
        this("00:00:00:00:00:00");
    }

    public BluetoothDevice(String address) {
        mAddress = address;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getName() {
        return "";
    }

    public int getBondState() {
        return BOND_NONE;
    }

    public int getType() {
        return DEVICE_TYPE_UNKNOWN;
    }

    public ParcelUuid[] getUuids() {
        return null;
    }

    public BluetoothAddress getIdentityAddressWithType() {
        return new BluetoothAddress(mAddress);
    }

    public BluetoothGatt connectGatt(
            Context context, boolean autoConnect, BluetoothGattCallback callback) {
        return new BluetoothGatt();
    }

    public boolean setPairingConfirmation(boolean confirm) {
        return false;
    }

    public static final class BluetoothAddress {
        private final String mAddress;

        public BluetoothAddress(String address) {
            mAddress = address;
        }

        public String getAddress() {
            return mAddress;
        }
    }
}
