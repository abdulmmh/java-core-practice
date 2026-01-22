package bookpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while(index <= n){
            list.add(fibonacci(index, n));
            index++;
        }

        for(int value: list){
            System.out.println(value + " ");
        }
    }

    static int fibonacci(int index, int n){
        if (n == 0) {
            return 0;
        }else
            return  index + fibonacci(index, n - 1) + fibonacci(index, n - 2);
    }
}
