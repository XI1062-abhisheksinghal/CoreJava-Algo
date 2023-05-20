package com.mckc.LeetCode;

public class Leetcode1652 {

    public static void main(String[] args) {

        int[] arr = {5, 7, 1, 4};
        int k = 3;
        decrypt(arr,k);

    }

    public static int[] decrypt(int[] code, int k) {

        //use the logic to add the numbers of k digits
        int[] res = new int[code.length];
        int sum =0;
        if(k==0){
            return res;
        }

        for(int i=0;i<code.length;i++){

            for(int j=1+i;j<=1+i+3;j++){

                if(j>=code.length){
                    j = j -code.length;
                }
                sum = sum+code[j];

            }
            res[i]=sum;
            sum=0;

        }

        return res;
    }
}
