package com.dsa.numbers.nqt;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n){
        if (n<=1){
            return n;
        }

        int second_last = 0;
        int last= 1;

        for (int i = 2; i <= n ; i++) {
            int current = second_last + last;
            second_last = last;
            last = current;

        }

        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacciNumber(n));
    }

}
