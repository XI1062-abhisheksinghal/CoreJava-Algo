package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode1748 {

    public static void main(String[] args) {
        int[] nos = {1,2,3,2};

        System.out.println(sumOfUnique(nos));
    }

    public static int sumOfUnique(int[] nums) {

        int sum =0;
        //return sum of unique numbers

        for(int i=0;i<nums.length;i++){

            int freq = Collections.frequency(Arrays.asList(nums),nums[i]);
            if(freq==1){
                sum = sum+nums[i];
            }
        }

        return sum;

    }
}
