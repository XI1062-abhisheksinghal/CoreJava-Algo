package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode217 {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        boolean result =containsDuplicate(nums);
        System.out.println(result);

    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> num = Arrays.stream(nums).boxed()
                .collect(Collectors.toList());

        for(Integer n:num){
            int count =Collections.frequency(num,n);
            if(count>2){
                return true;
            }
        }

        return false;

    }
}
