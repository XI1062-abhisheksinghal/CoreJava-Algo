package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode228 {

    public static void main(String[] args) {
        int[] n = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(n));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<String>();

        if (nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        for (int i = 0; i < nums.length; ) {
            String s = "";
            int start = nums[i];
            int end = 0;
            if (i < nums.length - 1) {
                while (nums[i + 1] == nums[i] + 1) {
                    end = nums[i + 1];
                    i++;
                    if(i+1>nums.length-1){
                        break;
                    }
                }
                if (end > 0) {
                    s = start + "->" + end;
                }
                else if(end==0){
                    s = String.valueOf(start);

                }

                result.add(s);
                i++;
            }else{
                s=String.valueOf(start);
                result.add(s);
                i++;

            }

        }


        return result;

    }
}
