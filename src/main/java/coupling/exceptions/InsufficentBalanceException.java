package coupling.exceptions;

public class InsufficentBalanceException extends Exception{
    public InsufficentBalanceException(String action, double balance, double amount) {

    }

    public InsufficentBalanceException(double balance, double amount) {

    }
}
