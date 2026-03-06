package com.dsa.arrays;

public class AvgArray {

    private static double avgArray(int[] arr){
        if(arr==null || arr.length ==0){
            return 0.0;
        }

        int sum = 0;
        for(int i = 0; i<arr.length ; i++){
            sum += arr[i];
        }

        return (double) sum/arr.length;
    }
    public static void main(String[] args){
        int[] arr = {5,8,6,1,3};

        System.out.println(avgArray(arr));
    }
}
