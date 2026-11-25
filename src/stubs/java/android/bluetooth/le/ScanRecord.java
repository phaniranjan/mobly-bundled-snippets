package android.bluetooth.le;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

public final class ScanRecord {
    public String getDeviceName() {
        return "";
    }

    public int getTxPowerLevel() {
        return 0;
    }

    public List<ParcelUuid> getServiceUuids() {
        return Collections.emptyList();
    }

    public byte[] getServiceData(ParcelUuid serviceDataUuid) {
        return null;
    }

    public SparseArray<byte[]> getManufacturerSpecificData() {
        return new SparseArray<>();
    }
}
