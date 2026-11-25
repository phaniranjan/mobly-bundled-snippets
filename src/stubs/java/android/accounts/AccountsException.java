package android.accounts;

public class AccountsException extends Exception {
    private static final long serialVersionUID = 1L;

    public AccountsException() {
        super();
    }

    public AccountsException(String message) {
        super(message);
    }
}
