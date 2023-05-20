package com.mckc.LeetCode;

public class Leetcode1679 {

    public static void main(String[] args) {

        int[] a= {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4,2};
        System.out.println(maxOperations(a,2));

    }

    public static int maxOperations(int[] nums, int k) {

        int count =0;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j< nums.length;j++){
                if(nums[i]>k){
                    break;
                }
                if(nums[i]+nums[j]==k){
                    nums[i]=0;
                    nums[j]=0;
                    count++;
                }
            }
        }

        return count;
    }
}
