package com.dsa.arrays;

public class SumOfElements {

    private static int arraySum(int[] arr){

        if(arr == null){
            return 0;
        }

        int sum = 0;
        for(int i= 0; i < arr.length; i++ ){
            sum+= arr[i];
        }

        return sum;
    }



    public static void main(String[] args){
        int[] arr = {4,8,7,9,6};
        System.out.println(arraySum(arr));
    }
}
