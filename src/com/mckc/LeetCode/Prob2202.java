package com.mckc.LeetCode;

public class Prob2202 {

    public static void main(String[] args) {

        int[] n = {99,95,68,24,18};
        int k=5;
        System.out.println(maximumTop(n,k));

    }

    public static int maximumTop(int[] nums, int k) {

        //return the topmost element in nums
        int res[] = new int[k];

        if(nums.length==1){
            return -1;
        }

        for(int j=0;j<k;j++){
            res[j]=nums[j];
        }

        return findMax(res);
    }


    public  static int findMax(int[] max){

        int maxNum=0;
        for(int i=0;i<max.length;i++){
            if(maxNum<max[i]){

                maxNum=max[i];
            }
        }

        return maxNum;
    }
}
