package android.bluetooth;

import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

public final class BluetoothAdapter {
    public static final int STATE_OFF = 10;
    public static final int STATE_ON = 12;
    public static final int SCAN_MODE_NONE = 20;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
    public static final String ACTION_REQUEST_ENABLE =
            "android.bluetooth.adapter.action.REQUEST_ENABLE";
    public static final String ACTION_DISCOVERY_FINISHED =
            "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
    public static final String ACTION_REQUEST_DISCOVERABLE =
            "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
    public static final String EXTRA_DISCOVERABLE_DURATION =
            "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";

    private static final BluetoothAdapter sDefaultAdapter = new BluetoothAdapter();

    public static BluetoothAdapter getDefaultAdapter() {
        return sDefaultAdapter;
    }

    public BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        return new BluetoothLeAdvertiser();
    }

    public BluetoothLeScanner getBluetoothLeScanner() {
        return new BluetoothLeScanner();
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean enable() {
        return false;
    }

    public boolean disable() {
        return false;
    }

    public int getState() {
        return STATE_OFF;
    }

    public Set<BluetoothDevice> getBondedDevices() {
        return Collections.emptySet();
    }

    public boolean setName(String name) {
        return false;
    }

    public String getName() {
        return "";
    }

    public String getAddress() {
        return "00:00:00:00:00:00";
    }

    public boolean isDiscovering() {
        return false;
    }

    public boolean startDiscovery() {
        return false;
    }

    public boolean cancelDiscovery() {
        return false;
    }

    public BluetoothDevice getRemoteDevice(String address) {
        return new BluetoothDevice(address);
    }

    public int isLeAudioSupported() {
        return 0;
    }

    public boolean getProfileProxy(
            Context context, BluetoothProfile.ServiceListener listener, int profile) {
        return false;
    }
}
