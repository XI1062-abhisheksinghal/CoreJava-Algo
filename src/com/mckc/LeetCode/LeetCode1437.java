package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1437 {

    public static void main(String[] args) {
        int nums[] = {1,0,0,1,0,1};
        kLengthApart(nums,2);
    }



    public static boolean kLengthApart(int[] nums, int k) {
        List<Integer> ls = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ls.add(i);
            }
        }

        for(int j=0;j<ls.size();j++){
            int l=j+1;

            if((ls.get(l) - ls.get(j))<=k){
                return false;
            }

        }

        return true;
    }
}
