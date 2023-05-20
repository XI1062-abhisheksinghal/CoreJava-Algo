package com.mck.Java8Practice;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

public class practiceGround {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(2, 3, 4, 5, 6);
        Map<Integer, Integer> squareOfVal = new HashMap<>();

        squareOfVal = ls.stream().collect(Collectors.toMap(key -> key, val -> val * val));
        squareOfVal.entrySet().forEach(System.out::println);



        List<String> names = Arrays.asList("Ram", "Kabir", "Ram");

        //print the name which is duplicate
        Map<Object, Long> namesFreq = names.stream().collect(Collectors.
                groupingBy(name -> name, Collectors.counting()));



        Map<String,Integer> mapsOfnameslength = names.stream().collect(Collectors.toMap(name->name,
                name->name.length()));


        mapsOfnameslength.entrySet().forEach(namess->
                System.out.println(namess.getValue()));






    }

}