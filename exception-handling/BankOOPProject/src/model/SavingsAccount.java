/**
 * Must extend Account
    Must implement the abstract method
    Interest rate should be fixed (e.g. 4%)
    Constructor must call super(...)
    Do NOT change Account.java
 */
package model;


public class SavingsAccount extends Account{

    public SavingsAccount(long accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double interestRate() {
        double interest = 0.04;
        return interest;
    }

    @Override
    public double applyInterest() {
        double newBalance = getBalance() + (getBalance() * interestRate());
        setBalance(newBalance);   
        return getBalance();    
    } 
}
