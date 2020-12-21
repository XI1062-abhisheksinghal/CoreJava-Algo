package com.mckc.LeetCode;

public class LeetCode {

    public static void main(String args[]){

        int result =removeDuplicates();
        System.out.println(result);

    }



    public static int removeDuplicates() {
        int[] nums = {1,1,2,2,3,3,9};

        int i=0;
        for(int j=1;j<nums.length;j++) {
            if (nums[j] != nums[i])
                i++;
                nums[i] = nums[j];
        }


        return i+1;
    }
}
