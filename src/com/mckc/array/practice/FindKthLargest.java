package com.mckc.array.practice;

import java.util.Arrays;

public class FindKthLargest {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int k=2;
        //second largest is 4
        Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);

        //min heap max heap
        
    }
}
