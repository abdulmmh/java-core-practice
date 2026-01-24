import Model.Account;
import Model.SavingsAccount;
import Service.BankService;
import util.InsufficientBalanceException;

public class Test {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setAccountNumber(1111);
        acc1.setAccountHolder("Mahadi");
        acc1.setBalance(100000);
        acc1.setInterest();

        Account acc2 = new Account();
        acc2.setAccountNumber(2222);
        acc2.setAccountHolder("Tasrif");
        acc2.setBalance(200000);
        acc2.setInterest();

        Account acc3 = new SavingsAccount();
        acc3.setAccountNumber(3333);
        acc3.setAccountHolder("Zayed");
        acc3.setBalance(300000);
        acc3.setInterest();

        BankService bs = new BankService();
        try {
            bs.transfer(acc1, acc2, 1000);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Successfully handled");
        }
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

    }
}
