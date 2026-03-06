package com.dsa.arrays;

public class DeleteElement {

    private static int[] addElement(int[] arr ,int index){

        //Safety check
        if(index<0 || index >= arr.length){
            return arr;
        }

        int[] newArr = new int[arr.length - 1];
        for(int i = 0; i<newArr.length; i++){
            if(i<index){
                newArr[i]=arr[i];
            }else{
                newArr[i]=arr[i+1];
            }
        }

        return newArr;
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,7,6};
        int index = 3 ; // To insert at last position index = arr.length as it is storing in new arr.

        int[] result = addElement(arr,index);

        for(int j = 0; j<result.length; j++){
            System.out.print(result[j]+ " ");
        }

    }
}
