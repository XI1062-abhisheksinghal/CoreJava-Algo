package com.mckc.LeetCode;

import javafx.collections.transformation.SortedList;

import java.util.*;
import java.util.stream.Collectors;

public class AlienDictionary {

    public static void main(String[] args) {

        String[] words = {"aaaabhi","aabhi","aaabhi","abhi","aaaa"};

       Collections.sort(Arrays.asList(words));

        List<String> ls =Arrays.asList(words).stream().sorted().collect(Collectors.toList());

        for (String l : ls) {
            System.out.println(l);
        }

        String s = "LeetCode";
        StringBuilder sb = new StringBuilder(s);

        int[] arrays = {1,34,22,33};

       int val= Arrays.stream(arrays).boxed().min(Integer::compareTo).get();

        System.out.println(val);

        HashSet<String> set = new HashSet<String>();
        set.add("abhishek");
        set.add("aabhishek");
        set.add("aaabhishek");

        set.remove("abhishek");

        List<Integer> set1 = new ArrayList<Integer>();
        set1.add(1);
        set1.add(34);
        set1.add(20);
        Collections.sort(set1);
        System.out.println(set1.get(1).intValue());





    }

}
