package com.mckc.array.practice;

public class ZeroOne {

    public static void main(String[] args) {

        int[] arr = {0,1,0,1,0,1};
        //output [0,0,0,1,1,1]
        sortNums(arr);
        for (int x:arr){
            System.out.println(x);
        }
    }

    public static int[] sortNums(int[] arr){

        int zeroPos=0;
        int onePos= arr.length-1;
        int temp=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[zeroPos]==0 && zeroPos<onePos){
                zeroPos++;
            }
            if(arr[onePos]==1 && onePos>zeroPos){
                onePos--;
            }
            //swap the nos
            if(arr[zeroPos]==1 && arr[onePos]==0){
                temp = arr[onePos];
                arr[onePos]= arr[zeroPos];
                arr[zeroPos]=temp;
            }
        }

        return arr;
    }
}
