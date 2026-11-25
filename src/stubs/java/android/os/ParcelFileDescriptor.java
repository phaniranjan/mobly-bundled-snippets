package android.os;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class ParcelFileDescriptor implements Closeable {
    public long getStatSize() {
        return 0L;
    }

    @Override
    public void close() throws IOException {}

    public static class AutoCloseInputStream extends InputStream {
        public AutoCloseInputStream(ParcelFileDescriptor pfd) {}

        @Override
        public int read() throws IOException {
            return -1;
        }
    }
}
