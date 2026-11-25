package android.util;

import java.util.ArrayList;
import java.util.List;

public class SparseArray<E> {
    private final List<Integer> mKeys = new ArrayList<>();
    private final List<E> mValues = new ArrayList<>();

    public int size() {
        return mKeys.size();
    }

    public int keyAt(int index) {
        return mKeys.get(index);
    }

    public E get(int key) {
        int idx = mKeys.indexOf(key);
        return idx >= 0 ? mValues.get(idx) : null;
    }

    public void put(int key, E value) {
        int idx = mKeys.indexOf(key);
        if (idx >= 0) {
            mValues.set(idx, value);
        } else {
            mKeys.add(key);
            mValues.add(value);
        }
    }
}
