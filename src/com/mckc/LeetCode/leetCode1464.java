package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class leetCode1464 {

    public static void main(String[] args) {
            int[] arr = {3,4,5,2};
        int sum =Arrays.stream(arr).boxed().reduce((a,b)->a+b).get();

        System.out.println(sum);
        System.out.println(maxVal(arr));
    }

    public static int maxVal(int[] nums){

        //return indexes of max and second max element
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i!=j)
                if((nums[i]-1)*(nums[j]-1)>max){
                    max=((nums[i]-1)*(nums[j]-1));
                }
            }
        }

        return max;

    }
}
