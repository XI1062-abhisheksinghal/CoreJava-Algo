package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeEx {

    public static void main(String[] args) {

        int[] removeele = {25,64,9,4,100};
        System.out.println(pickGifts(removeele,4));
        String s = "aba";
        if(s.charAt(0)=='a'){
            System.out.println("true");

        }
    }

    public static long pickGifts(int[] gifts, int k) {


        List<Integer> listOfint = Arrays.stream(gifts).boxed().collect(Collectors.toList());

        for(int i=0;i<k;i++) {
            Integer max = listOfint.stream().max(Comparator.comparing(Integer::intValue)).get();
            double sqrtOfMax = Math.floor(Math.sqrt(max));
            if(max>sqrtOfMax){
                //double diff = max-sqrtOfMax;
                listOfint.remove(max);
                listOfint.add(Integer.valueOf((int) sqrtOfMax));
            }

        }
        int sumOfValues = listOfint.stream().reduce(0,(a,b)->a+b).intValue();
        return (long)sumOfValues;
    }

}
