package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class LeetCode1732 {

    public static void main(String[] args) {

        int res = calVal(5,15);
        System.out.println(res);

    }


    public static int calVal(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 1;
        for (int i = lowLimit; i <= highLimit; i++) {

            if (i > 9) {
                int num = i;
                int rem = num / 10;
                int sum = 0;
                while (rem > 0) {
                    int digit = num % 10;
                    rem = num / 10;
                    sum = sum + digit;
                    num = rem;
                }

                if (map.containsKey(sum)) {
                    map.put(sum,map.get(sum)+1);
                } else {
                    map.put(sum,1);
                }

            } else {
                map.put(i,1);
            }
        }

        //return the key whose MapValue is Max
        int val=0;
        int res=0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            int newval = m.getValue();
            if(newval>val){
                val=newval;
                 res = m.getKey();
            }

        }

        map.entrySet().stream().
                sorted(Map.Entry.comparingByValue())
                .collect(toMap(e -> e.getKey(), e -> e.getValue()));


        return val;
    }
}

