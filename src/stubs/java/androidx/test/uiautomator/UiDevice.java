package androidx.test.uiautomator;

import android.app.Instrumentation;

public class UiDevice {
    public static UiDevice getInstance(Instrumentation instrumentation) {
        return new UiDevice();
    }

    public <R> R wait(SearchCondition<R> condition, long timeout) {
        return null;
    }

    public UiObject2 findObject(BySelector selector) {
        return new UiObject2();
    }
}
