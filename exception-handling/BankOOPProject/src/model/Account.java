package model;


public abstract class Account {
    private long accountNumber;
    private String holderName;
    private double balance;
    public abstract double applyInterest();

    public Account(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract double interestRate();
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", holderName=" + holderName + ", balance=" + balance + '}';
    }  
}
