package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveBoxes {

    public static void main(String[] args) {

        int[] boxes = {1,2,1,2,1};

        List<Integer> ls = Arrays.stream(boxes).boxed().collect(Collectors.toList());

        Map<Integer, Long> countOfValues = ls.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       int sum = countOfValues.entrySet().stream().mapToInt(x-> (int) (x.getValue()*x.getValue())).sum();

        System.out.println(sum);


    }
}
