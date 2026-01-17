package service;

import exception.InsufficientBalanceException;
import model.Account;


public class BankServiceImpl implements BankService{

    @Override
    public void deposit(Account acc, double amount) {
        if (amount > 0) {
            acc.setBalance(acc.getBalance() + amount);
        }
    }

    @Override
    public void withdraw(Account acc, double amount) throws InsufficientBalanceException {
        if (amount > acc.getBalance()) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        if (amount <= acc.getBalance()) {
            acc.setBalance(acc.getBalance() - amount);
        } 
        
    }

    @Override
    public void applyInterest(Account acc) {
        acc.applyInterest();
    }
    
}
