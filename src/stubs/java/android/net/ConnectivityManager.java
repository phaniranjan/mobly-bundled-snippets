package android.net;

public class ConnectivityManager {
    public void registerNetworkCallback(
            NetworkRequest request, NetworkCallback networkCallback) {}

    public static class NetworkCallback {
        public void onAvailable(Network network) {}

        public void onLost(Network network) {}
    }
}
