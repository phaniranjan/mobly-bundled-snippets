package android.net;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Uri {
    private final String mUriString;

    private Uri(String uriString) {
        mUriString = uriString;
    }

    public static Uri parse(String uriString) {
        return new Uri(uriString);
    }

    public List<String> getPathSegments() {
        List<String> segments = new ArrayList<>();
        try {
            String path = URI.create(mUriString).getPath();
            if (path != null) {
                for (String part : path.split("/")) {
                    if (!part.isEmpty()) {
                        segments.add(part);
                    }
                }
            }
        } catch (IllegalArgumentException ignored) {
            // Best-effort fallback for non-RFC URIs.
        }
        return segments;
    }

    @Override
    public String toString() {
        return mUriString;
    }
}
