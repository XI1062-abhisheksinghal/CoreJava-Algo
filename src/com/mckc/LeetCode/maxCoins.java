package com.mckc.LeetCode;

public class maxCoins {

    public static void main(String[] args) {

        int[] nums = {1,5};

        System.out.println(maxCoins(nums));

    }

    public static int maxCoins(int[] nums){

        int sum =0;

        //maxCoins
        for(int i=0;i<nums.length;i++){

            if(i==0){
                sum = sum+(1*nums[0]*nums[1]);
            }
            else if(i==nums.length-1){
                sum = sum + ((nums[nums.length-2])*1*nums[nums.length-1]);
            }
            else if(i>0 && i<nums.length-1){
                sum = sum+(nums[i-1]*nums[i]*nums[i+1]);
            }
        }

        return sum ;

    }
}
