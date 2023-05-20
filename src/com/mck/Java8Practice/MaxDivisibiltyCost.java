package com.mck.Java8Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxDivisibiltyCost {
    public static void main(String[] args) {
        int[] nums = {60,37,60,44,14,62,36,52,73,26,98,86,50,74,68,53,80,90,60,78,56};
        int[] divisors={53,84,2,26,42,83,48,10,24,55,9,100,10,17,17,99,51,32,16,98,99,31};

        System.out.println(maxDivScore(nums,divisors));
    }
        public static int maxDivScore(int[] nums, int[] divisors) {
            //key is index of divisor , value is count
            Map<Integer,Integer> mapOfDivisorandCount = new HashMap();
            for(int j=0;j<divisors.length;j++){
                int value = findDivisorsCount(divisors[j],nums);
                mapOfDivisorandCount.put(j,value);
            }
            AtomicInteger indexOfMaxSoFar= new AtomicInteger();
            mapOfDivisorandCount.entrySet().forEach(map->{
                if(map.getValue()> indexOfMaxSoFar.get()){
                    indexOfMaxSoFar.set(map.getKey());
                }
            });
            return divisors[indexOfMaxSoFar.get()];
        }


        public static int findDivisorsCount(int divisor , int[] nums){
            int res=0;
            for(int i=0;i<nums.length;i++){

                if(nums[i]%divisor==0){
                    res++;
                }
            }
            return res;
        }
    }

