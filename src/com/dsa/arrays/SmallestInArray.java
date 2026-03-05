package com.dsa.arrays;

public class SmallestInArray {


    public static void main(String[] args){
        int[] num = {4,8,9,3,6};

        int smallest = num[0];
        int largest = num[0];

        for(int i =1; i< num.length; i++){

            if(num[i]< smallest){
                smallest = num[i];
            }else if(num[i]>largest){   // Optimized: skip if already found to be smaller
                largest = num[i];
            }

        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
