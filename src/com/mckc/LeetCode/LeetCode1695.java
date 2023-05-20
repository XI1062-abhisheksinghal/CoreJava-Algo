package com.mckc.LeetCode;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class LeetCode1695 {

    public static void main(String[] args) {
        int[] n = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(n));

    }

    public static  int maximumUniqueSubarray(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        int sumOfset=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                if(set.add(nums[j])){
                    Optional<Integer> add = set.stream().reduce((a, b)->(a+b));
                    Integer ans = add.get();
                    sumOfset=   ans;
                    if(sumOfset>maxSum){
                        maxSum=sumOfset;
                    }
                }else{
                    break;
                }

            }

            set.clear();
            sumOfset=0;

        }

        return maxSum;

    }
}
