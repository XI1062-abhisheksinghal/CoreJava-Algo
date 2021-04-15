package com.mckc.LeetCode;

public class RemainderProblem {

    public static void main(String[] args) {

        int arr[] = {20,20,40};
        System.out.println(countpairs(arr));
    }

    static public int countpairs(int[] time) {
       int remainders[] = new int[60];
       int count = 0;
       for (int t : time) {
           if (t % 60 == 0) { // check if a%60==0 && b%60==0
               count += remainders[0];
           } else { // check if a%60+b%60==60
               count += remainders[60 - t % 60];
           }
           remainders[t % 60]++; // remember to update the remainders
       }
       return count;

   }

}
