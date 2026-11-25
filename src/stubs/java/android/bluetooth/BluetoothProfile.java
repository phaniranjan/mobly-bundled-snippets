package android.bluetooth;

public interface BluetoothProfile {
    int HEADSET = 1;
    int A2DP = 2;
    int GATT = 7;
    int HEARING_AID = 21;
    int LE_AUDIO = 22;

    int STATE_DISCONNECTED = 0;
    int STATE_CONNECTING = 1;
    int STATE_CONNECTED = 2;
    int STATE_DISCONNECTING = 3;

    interface ServiceListener {
        void onServiceConnected(int profile, BluetoothProfile proxy);

        void onServiceDisconnected(int profile);
    }
}
