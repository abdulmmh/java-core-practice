package Model;

public class SavingsAccount extends Account{
    @Override
    public void setInterest() {
        if (this.getBalance() >= 100000) {
            double interest = 0.10;
            this.setBalance((this.getBalance() * interest) + this.getBalance());
        }
    }
}
