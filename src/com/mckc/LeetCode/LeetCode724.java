package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode724 {

    public static void main(String[] args) {
        int[] n = {1,7,3,6,5,6};
        System.out.println(pivotIndex(n));
    }

    public static int pivotIndex(int[] nums) {

        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i : nums)
        {
            list.add(i);
        }

        int res =0;
        for(int j=1;j<nums.length;j++){

            int sumLeft = returnSum(list.subList(0,j));
            int sumRight = returnSum(list.subList(j+1,nums.length));

            if(sumLeft==sumRight){
                res= j;
                break;
            }
        }

        if(res>=0){
            return res;
        }
        return -1;
    }

    public static int returnSum(List<Integer> ls){
        int sum =0;
        for(Integer i:ls){
            sum = sum +i;
        }
        return sum;
    }
}
