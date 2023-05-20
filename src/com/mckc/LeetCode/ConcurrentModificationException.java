package com.mckc.LeetCode;

import java.util.*;

public class ConcurrentModificationException {

    public static void main(String[] args) {

        Set<String> setOfnames= new HashSet<>();
        setOfnames.add("Abhishek");
        setOfnames.add("01234");

        List<String> setOfNamesList = new ArrayList<>();
        setOfNamesList.add("0123");


        System.out.println(trimFMNO("00233"));

        setOfnames.forEach(name-> System.out.println(name));

        List<Integer> nums = Arrays.asList(1,2,3,4,5,1);
        Integer smallest = nums.stream().min(Comparator.comparing(Integer::intValue)).get();
        System.out.println(smallest);
        
        //nums.forEach(num-> System.out.println(num));
    }

    public static String trimFMNO(String fmno){

        String trimmedFmno = fmno;
        while(trimmedFmno.startsWith("0")){

            trimmedFmno= trimmedFmno.substring(1);

        }
        return trimmedFmno;
    }
}
