package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeContest {

    public static void main(String[] args) {

        int[] chargeTimes={3,6,1,3,4};
        int[] runningCosts={2,1,3,4,5};
        int bud =25;

        System.out.println(maximumRobots(chargeTimes,runningCosts,bud));
    }


    public static int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {

        //return max number of consecutive robots
        List<Integer> ls= Arrays.stream(chargeTimes).boxed().collect(Collectors.toList());
        List<Integer> runningCost = Arrays.stream(runningCosts).boxed().collect(Collectors.toList());
        int result =0;
        Integer max=0;
        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size();j++){
                max = maxEle(ls.subList(i,j));
                if(max+(j-i)*sumOfEle(runningCost.subList(i,j))<=budget){
                    if(result<j-i){
                        result=j-i;
                    }
                }
            }


        }
        return result;
    }

    public static Integer sumOfEle(List<Integer> nums){
        return nums.stream().reduce(0,(a,b)->a+b);
    }

    public static Integer maxEle(List<Integer> nums){

        return nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }
}
