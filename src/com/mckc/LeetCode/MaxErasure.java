package com.mckc.LeetCode;

import java.util.*;

public class MaxErasure {


    int j = 0;
    static List<Integer> values = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] nums = {5,2,1,2,5,2,1,2,5};
        boolean  flag = true;
        System.out.println(maximumUniqueSubarray(nums,flag));

    }

        public static int maximumUniqueSubarray ( int[] nums, boolean flag){

            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < nums.length; i++) {
                int j = i;
                while (flag && j < nums.length) {
                    if (!set.add(nums[j])) {
                        flag = false;
                    }
                    j++;
                }
                flag = true;
                Optional<Integer> sumOfSetValues = set.stream().reduce((a, b) -> a + b);
                values.add(sumOfSetValues.get());
                set.clear();
            }

            return values.stream().max(Comparator.comparing(Integer::valueOf))
                    .get();
        }
}
