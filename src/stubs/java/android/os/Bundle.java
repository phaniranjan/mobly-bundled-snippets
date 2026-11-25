package android.os;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bundle implements Parcelable {
    private final Map<String, Object> mMap = new HashMap<>();

    public void putString(String key, String value) {
        mMap.put(key, value);
    }

    public String getString(String key) {
        Object val = mMap.get(key);
        return val instanceof String ? (String) val : null;
    }

    public void putInt(String key, int value) {
        mMap.put(key, value);
    }

    public int getInt(String key) {
        Object val = mMap.get(key);
        return val instanceof Integer ? (Integer) val : 0;
    }

    public void putLong(String key, long value) {
        mMap.put(key, value);
    }

    public long getLong(String key) {
        Object val = mMap.get(key);
        return val instanceof Long ? (Long) val : 0L;
    }

    public void putBoolean(String key, boolean value) {
        mMap.put(key, value);
    }

    public boolean getBoolean(String key) {
        Object val = mMap.get(key);
        return val instanceof Boolean && (Boolean) val;
    }

    public void putByteArray(String key, byte[] value) {
        mMap.put(key, value);
    }

    public byte[] getByteArray(String key) {
        Object val = mMap.get(key);
        return val instanceof byte[] ? (byte[]) val : null;
    }

    public void putBundle(String key, Bundle value) {
        mMap.put(key, value);
    }

    public Bundle getBundle(String key) {
        Object val = mMap.get(key);
        return val instanceof Bundle ? (Bundle) val : null;
    }

    public void putStringArrayList(String key, ArrayList<String> value) {
        mMap.put(key, value);
    }

    public void putParcelableArrayList(String key, ArrayList<? extends Parcelable> value) {
        mMap.put(key, value);
    }

    public void putParcelable(String key, Parcelable value) {
        mMap.put(key, value);
    }

    public boolean containsKey(String key) {
        return mMap.containsKey(key);
    }

    public Object get(String key) {
        return mMap.get(key);
    }
}
