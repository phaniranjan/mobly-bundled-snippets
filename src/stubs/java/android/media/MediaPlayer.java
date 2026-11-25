package android.media;

import java.io.IOException;

public class MediaPlayer {
    public void reset() {}

    public void setAudioAttributes(AudioAttributes attributes) {}

    public void setAudioStreamType(int streamtype) {}

    public void setDataSource(String path) throws IOException {}

    public void prepare() throws IOException {}

    public void start() {}

    public void stop() {}
}
