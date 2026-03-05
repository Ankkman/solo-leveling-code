package com.dsa.arrays;

public class ReverseArray {


    public static void main(String[] args){
        int[] arr = {4,5,6,7,8};

        int x = 0;
        int y = arr.length - 1;

            while(x<y) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;

                x++;
                y--;
            }

        for(int j =0; j< arr.length ; j++ ){
            System.out.print(arr[j] + " ");

        }
    }
}
