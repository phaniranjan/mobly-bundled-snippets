package android.os;

public class RemoteException extends Exception {
    private static final long serialVersionUID = 1L;

    public RemoteException() {
        super();
    }

    public RemoteException(String message) {
        super(message);
    }
}
