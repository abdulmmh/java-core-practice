/**
 * Create CurrentAccount class:
        Also extends Account
        Interest rate = 0 (current accounts don’t earn interest)
 */
package model;


public class CurrentAccount extends Account{
    

    public CurrentAccount(long accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double interestRate() {
        double interest = 0.0;
        return interest;          
    }

    @Override
    public double applyInterest() {
        double newBalance = getBalance() + (getBalance() * interestRate());
        setBalance(newBalance);   
        return getBalance();    
    }   
}
