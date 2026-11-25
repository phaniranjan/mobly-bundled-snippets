package android.os;

public final class SystemClock {
    private SystemClock() {}

    public static long elapsedRealtimeNanos() {
        return System.nanoTime();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
