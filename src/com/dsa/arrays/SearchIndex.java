package com.dsa.arrays;

public class SearchIndex {

    private static int elementIndex(int[] arr, int k) {

        //Safety check for null
        if (arr == null) {
            return -1;
        }

        //Linear search

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 5, 3};
        int k = 8;

        int result = elementIndex(arr, k);
        if (result == -1) {
            System.out.print("Not Found");
        } else {
            System.out.println(result);
        }
    }
}

