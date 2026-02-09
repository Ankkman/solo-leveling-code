package com.dsa.numbers;

import java.util.Scanner;

public class PerfectSquare {

    /*      367. Valid Perfect Square


        The Overflow Rule: Instead of (L + R) / 2 , use left + (right - left) / 2 to avoid negative number glitches.
        Big Math: Use long for squares (mid * mid) to prevent the 2.1 billion int limit from breaking your logic.
        Syntax Check:
        == is for asking (Comparison).
        = is for telling (Assignment)
     */

    public static boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;



        while(left <= right){
            long mid = left + (right-left)/2;
            long squre = mid*mid;

            if(squre == num){
                return true;
            }else if (squre>num){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }


}
