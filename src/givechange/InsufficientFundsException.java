package givechange;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient money provided");
    }
}
