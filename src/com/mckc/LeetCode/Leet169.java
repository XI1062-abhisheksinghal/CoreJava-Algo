package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Leet169 {

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        //find majority element

        int result =0;

        Map<Integer, Integer> map = new HashMap();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        int n = nums.length/2;

        Optional<Map.Entry<Integer,Integer>> ops = map.entrySet().stream().filter(es->es.getValue()>n).findAny();

        if(ops.isPresent()){
            result=ops.get().getKey();
        }

        return result;


    }
}
