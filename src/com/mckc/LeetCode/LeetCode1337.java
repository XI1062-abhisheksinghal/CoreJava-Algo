package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class LeetCode1337 {

    public static void main(String[] args) {
        //Sort map on the basis of valiues

        Map<Integer,Integer> m = new HashMap<>();
        m.put(1,2);
        m.put(2,3);
        m.put(3,1);

        m.entrySet().stream().sorted(comparingByValue())
                .collect( toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));


    }
}
