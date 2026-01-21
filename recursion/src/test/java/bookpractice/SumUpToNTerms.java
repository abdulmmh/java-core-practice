package bookpractice;

import java.util.Scanner;

public class SumUpToNTerms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth terms: ");
        int n = input.nextInt();

        long total = sum(n);
        System.out.println("Sum up to "+ n +" is "+total);
        input.close();
    }
    static long  sum( int n){
        if(n == 0){
            return 0;
        }else
            return n + sum(n - 1);
    }
}
