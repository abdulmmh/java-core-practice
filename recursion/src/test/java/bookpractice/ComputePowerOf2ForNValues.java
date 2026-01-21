package bookpractice;

import java.util.Scanner;

public class ComputePowerOf2ForNValues {
    static int num = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        int total  = power(n);
        System.out.println("2 to the power "+ n + " is " + total);
        input.close();
    }
    static int power(int n){
        if(n == 0){
            return 1;
        }else {
            return num * power(n - 1);
        }
    }
}
