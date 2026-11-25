package android.media;

public class MediaRouter {
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;

    public RouteInfo getSelectedRoute(int type) {
        return new RouteInfo();
    }

    public static class RouteInfo {
        public int getDeviceType() {
            return 0;
        }

        public CharSequence getName() {
            return "";
        }
    }
}
