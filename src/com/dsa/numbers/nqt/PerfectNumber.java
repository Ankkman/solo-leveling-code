package com.dsa.numbers.nqt;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if(num <= 1){
            return false;
        }
        int sum =1;
        int range = (int) Math.sqrt(num);
        for(int i = 2; i<=range; i++){

            if(num%i == 0){
                sum = sum+i;

                //Prevent adding the same factor twice for perfect squares(25=5*5)
                if(i != num/i){

                    sum=sum + (num/i);

                }

            }

        }

        return (num==sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(checkPerfectNumber(n));
    }
}
