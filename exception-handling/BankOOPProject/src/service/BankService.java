
package service;

import exception.InsufficientBalanceException;
import model.Account;



public interface BankService {
    void deposit(Account acc, double amount);
    void withdraw(Account acc, double amount)throws InsufficientBalanceException;
    void applyInterest(Account acc);
}
