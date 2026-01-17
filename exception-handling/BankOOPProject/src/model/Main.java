
package model;

import exception.InsufficientBalanceException;
import java.util.*;
import service.BankServiceImpl;


public class Main {
    public static void main(String[] args) {
        /*List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1234567899, "Mr. Rahim", 1000000));
        list.add(new SavingsAccount(1234563549, "Mr. Karim", 2000000));
        list.add(new SavingsAccount(1234545647, "Mr. Hamim", 3000000));
        
        for (Account acc : list) {
            acc.applyInterest();
            System.out.println(acc);
        }
        */
        BankServiceImpl wbalance = new BankServiceImpl();
        Account rahim = new SavingsAccount(1234567899, "Mr. Rahim", 1000000);
        wbalance.deposit(rahim, 2000);
        wbalance.applyInterest(rahim);
        try {
            wbalance.withdraw(rahim, 5000000);
        } catch (InsufficientBalanceException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Try a different amount");
            System.out.println("Your current balance is: " + rahim.getBalance());
        }
       
    }
}
