package android.os;

import java.util.Objects;
import java.util.UUID;

public final class ParcelUuid implements Parcelable {
    private final UUID mUuid;

    public ParcelUuid(UUID uuid) {
        mUuid = uuid;
    }

    public static ParcelUuid fromString(String uuid) {
        return new ParcelUuid(UUID.fromString(uuid));
    }

    public UUID getUuid() {
        return mUuid;
    }

    @Override
    public String toString() {
        return mUuid.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParcelUuid)) return false;
        ParcelUuid that = (ParcelUuid) o;
        return Objects.equals(mUuid, that.mUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mUuid);
    }
}
