 package Ecomsystem.ExceptionsFile;

public class BalanceInsuffiecientException extends Exception {

    public BalanceInsuffiecientException() {
        super("Balance is insufficient to complete the transaction.");
    }

    public BalanceInsuffiecientException(String s) {
        super(s);
    }
}