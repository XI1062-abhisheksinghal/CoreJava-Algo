package com.mck.Java8Practice;

import java.util.*;
import java.util.stream.Collectors;

public class MapOperationsJava8 {

    public static void main(String[] args) {
        //Finding frequency of Characters in Map and store them in Map sort by reverse order in Map
        char[] chars = {'a','b','c','a','b'};

        //Counting frequency of each element in nums

        Map<Character, Integer> map = new HashMap<Character,Integer>();

        for(Character c:chars) {
            if (map.containsKey(c)){
                map.put(c,(map.get(c))+1);
            }else{
                map.put(c,1);
            }
        }

        map.entrySet().stream().
                collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        map.entrySet().forEach(x-> System.out.println(x.getKey() + "" + x.getValue()));



    }
}
