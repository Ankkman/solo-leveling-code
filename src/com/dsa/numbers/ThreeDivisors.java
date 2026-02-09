package com.dsa.numbers;

import java.util.Scanner;

public class ThreeDivisors {
    /*

    A number has exactly 3 divisors
    Only if It is a perfect square and its square root is prime.

    For any number n, divisors come in pairs. If n is not a perfect square → divisors are always even in count.
    That's why 3 divisors is possible only for perfect squares.

    If Root is prime:
    9=3*3 . so divisors are 1,3 9.
    49 = 7*7. divisors are 1,7,49.

     */

    public static boolean isThree(int n){

        int root = (int) Math.sqrt(n);

        // Check if n is a perfect square
        if (root * root != n){
            return false;
        }

        // Check if root is prime

        // Edge case: for n=1 root is 1. it will skip the next loop as 2*2<=1 is false ,ending up returning true.
        if (root<2){
            return false;
        }

        for (int i = 2; i*i <= root  ; i++) {
            if (root%i==0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isThree(n));
        sc.close();

    }
}
