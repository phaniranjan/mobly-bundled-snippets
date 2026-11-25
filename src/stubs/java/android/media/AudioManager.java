package android.media;

public class AudioManager {
    public static final int STREAM_VOICE_CALL = 0;
    public static final int STREAM_RING = 2;
    public static final int STREAM_MUSIC = 3;
    public static final int STREAM_ALARM = 4;
    public static final int GET_DEVICES_OUTPUTS = 2;

    public void setMicrophoneMute(boolean on) {}

    public boolean isMicrophoneMute() {
        return false;
    }

    public boolean isMusicActive() {
        return false;
    }

    public int getStreamVolume(int streamType) {
        return 0;
    }

    public int getStreamMaxVolume(int streamType) {
        return 0;
    }

    public void setStreamVolume(int streamType, int index, int flags) {}

    public AudioDeviceInfo[] getDevices(int flags) {
        return new AudioDeviceInfo[0];
    }
}
