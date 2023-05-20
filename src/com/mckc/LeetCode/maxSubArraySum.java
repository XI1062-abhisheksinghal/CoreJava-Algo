package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class maxSubArraySum {

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }


    public static long maximumSubarraySum(int[] nums, int k) {

        Set<Integer> setOfnums = new HashSet<Integer>();

        List<Integer> listOfnums = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int maxSum =0;

        for(int i=0;i<=nums.length-3;i++){
            int sum=0;
            List<Integer> sub = listOfnums.subList(i,i+3);
            for(int j=0;j<3;j++){
                setOfnums.add(sub.get(j));
            }
            if(setOfnums.size()==3){
                sum=setOfnums.stream().reduce((a,b)->a+b).get();
            }
            if(sum>maxSum){
                maxSum=sum;
            }
            setOfnums.clear();

        }
        return maxSum;
    }
}
