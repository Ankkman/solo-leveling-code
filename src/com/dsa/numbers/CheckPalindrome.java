package com.dsa.numbers;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean isPalindrome(int n){

        if(n<0) return false; // For negative numbers

        int temp = n;
        int rev = 0;

        while(temp>0){
            rev = rev * 10 + temp%10;
            temp /= 10;
        }

        return rev ==n;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
