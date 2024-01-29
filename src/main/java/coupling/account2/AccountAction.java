package coupling.account2;

import coupling.exceptions.InsufficentBalanceException;

public interface AccountAction {
    double act(double balance, double amount) throws InsufficentBalanceException;
}
