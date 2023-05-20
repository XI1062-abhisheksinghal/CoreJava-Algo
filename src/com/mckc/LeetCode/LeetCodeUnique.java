package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCodeUnique {

    public static void main(String[] args) {

        int[] nums = {157618,838254,101884,245507,617915,304832,764061,889103,808910,471878,563423,933747,782982,999883,330365,952148,226805,137560,635602,601846,903578,185025,883388,18201,2672,457760,945933,457513,955108,50604,597568,896237,569888,255306,672310,379110,624197,596863,589170,352224,82682,812483,766310,4558,901849,470362,488592,962763,596145,849519,322670,361211,901838};

        System.out.println(countDistinctIntegers(nums));

    }

    public static int countDistinctIntegers(int[] nums) {

        Set<Integer> listOfNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for(int i : nums){
            int reversed = reverseNum(i);
            listOfNums.add(reversed);

        }

        return listOfNums.size();

    }

    public static Integer reverseNum(int num){

        String reverse = "";
        int rem=1;
        if(num<10){
            reverse = String.valueOf(num);
            return Integer.valueOf(reverse);
        }
        while(num/10>=1){

            rem = num%10;
            reverse = reverse+rem;
            num=num/10;
        }
        if(num<=1){
            reverse = reverse+num;
        }
        int j=1;
        while(reverse.startsWith("0")){

            reverse = reverse.substring(j);
            j++;
        }

        return Integer.valueOf(reverse);
    }}

