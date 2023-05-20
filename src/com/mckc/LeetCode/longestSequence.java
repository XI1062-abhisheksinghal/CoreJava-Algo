package com.mckc.LeetCode;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class longestSequence {

    public static void main(String[] args) {

        String s ="abcd";

        int len = s.charAt(0);

        int len2=1;

        Map<String,Integer> map = new TreeMap<>();
        map.put("Abhishek",1);
        map.put("Singhal",2);
        map.put("Aabh",3);

        List<Integer> sortedHeights = map.entrySet()
                .stream().map(entry->entry.getValue())
                .sorted(Comparator.comparing(Integer::valueOf))
                .filter(val->val>5)
                .collect(Collectors.toList());

        System.out.println(sortedHeights.size());


        //sortByValues
        Map<String, Integer> hashMap=
                map.entrySet().stream()
                        .sorted(Comparator.comparing(Map.Entry::getValue))
                        .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        Integer s4 =hashMap.get(0);

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] names1=sortPeople(names,heights);

        for(String n:names1){
            System.out.println(n);
        }

        List<String> listOfLong = Arrays.asList("934142",
                "93437993303",
                "93441000723",
                "93444007139",
                "93443242865");





        }

         public static String[] sortPeople(String[] names, int[] heights) {

            Map<Integer,String> nameByheights = new TreeMap<Integer,String>();
            String[] arr = new String[names.length];

            for(int i=0;i<names.length;i++){
                nameByheights.put(Integer.valueOf(heights[i]),names[i]);
            }


           List<String> namesCorrect = nameByheights.values().stream()
                   .collect(Collectors.toList());


            int z=0;
            for(int l=namesCorrect.size();l>0;l--){
                arr[z]=namesCorrect.get(l-1);
                z++;
            }
            return arr;


        }


    }

