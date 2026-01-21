package bookpractice;

import java.util.Scanner;

public class ComputePower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = input.nextInt();

        System.out.print("Enter a non-negative exponent: ");
        int n = input.nextInt();

        int total  = power(base, n);
        System.out.println(base + " to the power "+ n + " is " + total);
        input.close();
    }
    static int power(int base, int n){
        if(n == 0){
            return 1;
        }else {
            return base * power(base, n - 1);
        }
    }
}
