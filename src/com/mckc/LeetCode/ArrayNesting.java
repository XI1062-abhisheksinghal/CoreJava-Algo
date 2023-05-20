package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayNesting {

    public static void main(String[] args) {
        int[] nums={0,1,2};
        System.out.println(arrayNesting(nums));


    }

    public static int arrayNesting(int[] nums) {

        List<Integer> numsOfSet= new ArrayList<Integer>();


        for(int i=0;i<nums.length;i++){

            int seq =0;
            int j=i;
            List<Integer> addon = new ArrayList<Integer>();
            while(j<nums.length){
                if(!addon.contains(nums[j])){
                    addon.add(nums[j]);
                }else{
                    break;
                }
                seq++;
                int k=nums[j];
                j=k;
            }
            numsOfSet.add(seq);
        }

        List<Integer> sortedList = numsOfSet.stream().sorted().collect(Collectors.toList());

        return sortedList.get(sortedList.size()-1);



    }
}
