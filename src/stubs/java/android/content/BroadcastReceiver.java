package android.content;

public abstract class BroadcastReceiver {
    private int mResultCode;

    public abstract void onReceive(Context context, Intent intent);

    public final int getResultCode() {
        return mResultCode;
    }
}
