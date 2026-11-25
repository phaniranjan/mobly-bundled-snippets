package android.telephony;

import android.app.PendingIntent;
import java.util.ArrayList;

public final class SmsManager {
    public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
    public static final int RESULT_ERROR_RADIO_OFF = 2;
    public static final int RESULT_ERROR_NULL_PDU = 3;
    public static final int RESULT_ERROR_NO_SERVICE = 4;

    public static SmsManager getDefault() {
        return new SmsManager();
    }

    public ArrayList<String> divideMessage(String text) {
        return new ArrayList<>();
    }

    public void sendMultipartTextMessage(
            String destinationAddress,
            String scAddress,
            ArrayList<String> parts,
            ArrayList<PendingIntent> sentIntents,
            ArrayList<PendingIntent> deliveryIntents) {}

    public void sendTextMessage(
            String destinationAddress,
            String scAddress,
            String text,
            PendingIntent sentIntent,
            PendingIntent deliveryIntent) {}
}
