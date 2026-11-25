package android.content;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class Intent {
    public static final int FLAG_ACTIVITY_NEW_TASK = 0x10000000;

    private String mAction;
    private final Bundle mExtras = new Bundle();
    private final Map<String, Parcelable> mParcelables = new HashMap<>();
    private int mFlags;

    public Intent() {}

    public Intent(String action) {
        mAction = action;
    }

    public String getAction() {
        return mAction;
    }

    public Bundle getExtras() {
        return mExtras;
    }

    public Intent setFlags(int flags) {
        mFlags = flags;
        return this;
    }

    public Intent putExtra(String name, int value) {
        mExtras.putInt(name, value);
        return this;
    }

    @SuppressWarnings("unchecked")
    public <T extends Parcelable> T getParcelableExtra(String name) {
        return (T) mParcelables.get(name);
    }
}
