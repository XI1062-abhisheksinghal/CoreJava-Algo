package com.mckc.LeetCode;

public class applyOperation {

    public static void main(String[] args) {
        System.out.println(applyOperations(new int[]{847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272}));
    }


    public static int[] applyOperations(int[] nums) {


        for(int i=0;i<nums.length-1;){

            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;

            }
            i++;
        }

        return shiftAllZero(nums);
    }

    public static int[] shiftAllZero(int[] nums){

        for(int j=0;j<nums.length-1;j++){
            if(nums[j]==0 && nums[j+1]!=0){
                int temp=nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }

        return nums;
    }
}
