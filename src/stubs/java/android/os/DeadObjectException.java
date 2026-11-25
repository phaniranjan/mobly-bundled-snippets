package android.os;

public class DeadObjectException extends RemoteException {
    private static final long serialVersionUID = 1L;

    public DeadObjectException() {
        super();
    }

    public DeadObjectException(String message) {
        super(message);
    }
}
