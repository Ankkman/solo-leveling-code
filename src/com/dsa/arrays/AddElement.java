package com.dsa.arrays;

public class AddElement {

    private static int[] addElement(int[] arr ,int index, int value){
        int[] newArr = new int[arr.length +1];
        for(int i = 0; i<newArr.length; i++){
            if(i<index){
                newArr[i]=arr[i];
            }else if(i==index){
                newArr[i] =  value;
            }else{
                newArr[i]=arr[i-1];
            }
        }

        return newArr;
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,7,6};
        int index = 0 ; // To insert at last position index = arr.length as it is storing in new arr.
        int value = 10;

        int[] result = addElement(arr,index ,value);


        for(int j = 0; j<result.length; j++){
            System.out.print(result[j]+ " ");
        }



    }
}
