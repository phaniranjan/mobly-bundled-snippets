package android.telephony;

public class TelephonyManager {
    public String getSubscriberId() {
        return "";
    }

    public int getCallState() {
        return 0;
    }

    public TelephonyManager createForSubscriptionId(int subId) {
        return this;
    }

    public int getCallStateForSubscription() {
        return 0;
    }

    public int getNetworkType() {
        return 0;
    }

    public int getDataNetworkType() {
        return 0;
    }

    public int getVoiceNetworkType() {
        return 0;
    }
}
