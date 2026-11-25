package android.bluetooth;

import java.util.Collections;
import java.util.List;

public final class BluetoothHeadset implements BluetoothProfile {
    public static final String ACTION_CONNECTION_STATE_CHANGED =
            "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";
    public static final String ACTION_AUDIO_STATE_CHANGED =
            "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED";

    public int getConnectionState(BluetoothDevice device) {
        return STATE_DISCONNECTED;
    }

    public boolean startVoiceRecognition(BluetoothDevice device) {
        return false;
    }

    public boolean stopVoiceRecognition(BluetoothDevice device) {
        return false;
    }

    public boolean isVoiceRecognitionSupported(BluetoothDevice device) {
        return false;
    }

    public List<BluetoothDevice> getConnectedDevices() {
        return Collections.emptyList();
    }
}
