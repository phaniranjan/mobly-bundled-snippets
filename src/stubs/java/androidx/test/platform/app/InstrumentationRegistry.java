package androidx.test.platform.app;

import android.app.Instrumentation;

public final class InstrumentationRegistry {
    private static final Instrumentation sInstrumentation = new Instrumentation();

    private InstrumentationRegistry() {}

    public static Instrumentation getInstrumentation() {
        return sInstrumentation;
    }
}
