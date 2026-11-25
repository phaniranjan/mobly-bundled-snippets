package android.app;

import android.content.Context;

public class Instrumentation {
    public Context getContext() {
        return new Context();
    }

    public UiAutomation getUiAutomation() {
        return new UiAutomation();
    }
}
