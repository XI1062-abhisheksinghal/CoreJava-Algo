package com.mck.Java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {

    public static void main(String[] args) {

        int[] nums = {1,1,2,4,8,16};
        List<Integer> subList = new ArrayList<>();
        List<Integer> numList = Arrays.stream(nums).boxed()
                .collect(Collectors.toList());
        List<String> names = new ArrayList<>();
        names.add("abhishek");
        names.add("singhal");

        System.out.println(names.toString());
        int conv[]=new int[6];

        for(int i=0;i<nums.length;i++){
            int res = convertedNum(numList.subList(0,i+1));
            conv[i]=res;
        }

        for(int k:conv){
            System.out.println(k);
        }


    }

    public static int convertedNum(List<Integer> lists ){
        int sum=0;
        for(int k=0;k<lists.size();k++){
            sum=sum+(lists.get(k)+ maxNum(lists.subList(0,k+1)));
        }
        return sum;
    }

    public static int maxNum(List<Integer> n){
        if(n.size()==1){
            return n.get(0);
        }else{
            return n.stream().max(Comparator.comparing(Integer::intValue)).get();
        }
    }




}
