package com.mckc.array.practice;

public class KadaneAlgo {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,-2,5,-8};

        //Kadane's algotithm is
        //Finding the max sum of contigous array

        int maxSoFar =0;
        int MaxEndinghere =0;
         int currlength=0;
        for(int i:arr){

            MaxEndinghere= MaxEndinghere+i;
            MaxEndinghere= Integer.max(MaxEndinghere,0);

            maxSoFar= Integer.max(MaxEndinghere,maxSoFar);
        }

        System.out.println(maxSoFar);


    }
}
