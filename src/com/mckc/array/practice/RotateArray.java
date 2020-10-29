package com.mckc.array.practice;

public class RotateArray {


    public static void main(String args[]){

        int[] arr = {1,2,3,4,5};
        int k=1;
        //result by rotating array by 1 right
        //{5,1,2,3,4}

        for(int i=0;i<k;i++){
            int[] res= rotateRightByOne(arr);

        }

    }

    public static int[] rotateRightByOne(int[] arr1){

        int temp=arr1[arr1.length-1];

        for(int j=0;j<arr1.length-2;j++){

            arr1[j+1]=arr1[j];

        }
        arr1[0]=temp;

        return arr1;
    }

}
