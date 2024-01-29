package coupling.account2;

import coupling.exceptions.InsufficentBalanceException;

public class Withdraw implements AccountAction{

    @Override
    public double act(double balance, double amount) throws InsufficentBalanceException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficentBalanceException(balance, amount);
        }
        return balance;
    }
}
