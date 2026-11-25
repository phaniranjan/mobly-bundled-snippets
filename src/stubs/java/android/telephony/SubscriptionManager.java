package android.telephony;

public class SubscriptionManager {
    public static final int INVALID_SUBSCRIPTION_ID = -1;

    public static int getDefaultSubscriptionId() {
        return INVALID_SUBSCRIPTION_ID;
    }

    public SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIndex) {
        return null;
    }

    public SubscriptionInfo getActiveSubscriptionInfo(int subId) {
        return null;
    }

    public String getPhoneNumber(int subscriptionId) {
        return "";
    }
}
