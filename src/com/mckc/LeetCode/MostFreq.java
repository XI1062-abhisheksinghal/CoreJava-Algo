package com.mckc.LeetCode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFreq {

    public static void main(String[] args) {
        int[] nums = {8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290};
        System.out.println(mostFrequentEven(nums));

    }

    public static Map<Integer, Long> mapOffreq(int[] nums) {
        List<Integer> listOfnums = Arrays.stream(nums).boxed().collect(Collectors.toList());

        List<Integer> ls = Arrays.asList(2, 1, 3);
        List<Integer> subs = ls.subList(0, 0);
        Integer max = ls.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer sum1 = ls.stream().reduce(0, (a, b) -> a + b);
        ls.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());

        System.out.println(sum1);

        return listOfnums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }

    public static int mostFrequentEven(int[] nums) {

        //create Map storing the number and its frequency

        Map<Integer, Integer> mapOfEvens = new TreeMap<Integer, Integer>();

        int maxval = 0;
        int returnKey = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (mapOfEvens.containsKey(nums[i])) {
                    mapOfEvens.put(nums[i], mapOfEvens.get(nums[i]) + 1);
                } else {
                    mapOfEvens.put(nums[i], 1);

                }
            }
        }
        if (mapOfEvens.size() > 0) {
            for (Map.Entry<Integer, Integer> map : mapOfEvens.entrySet()) {
                if (map.getValue() > maxval) {
                    returnKey = map.getKey();
                    maxval = map.getValue();
                }
            }
        } else {
            returnKey = -1;
        }
        return returnKey;

    }



}
