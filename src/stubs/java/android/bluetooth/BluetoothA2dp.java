package android.bluetooth;

import java.util.Collections;
import java.util.List;

public final class BluetoothA2dp implements BluetoothProfile {
    public int getConnectionState(BluetoothDevice device) {
        return STATE_DISCONNECTED;
    }

    public List<BluetoothDevice> getConnectedDevices() {
        return Collections.emptyList();
    }

    public boolean isA2dpPlaying(BluetoothDevice device) {
        return false;
    }
}
