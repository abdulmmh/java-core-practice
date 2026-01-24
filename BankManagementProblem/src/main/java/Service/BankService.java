package Service;

import Model.Account;
import util.InsufficientBalanceException;

public class BankService {
    public void transfer(Account from, Account to, double amount)throws InsufficientBalanceException{

                from.withdraw(amount);
                to.deposit(amount);

    }
}
