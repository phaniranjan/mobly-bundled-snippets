package android.database;

import java.io.Closeable;

public interface Cursor extends Closeable {
    boolean moveToFirst();

    int getColumnIndex(String columnName);

    long getLong(int columnIndex);

    @Override
    void close();
}
