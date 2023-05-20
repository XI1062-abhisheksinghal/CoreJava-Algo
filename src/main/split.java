package main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class split {

    public static void main(String[] args) {
        String s="/countries/{countryCode}/states";

        String[] splitted = s.split("/");
        String s1 = "USA";
        System.out.println("/"+splitted[1]+"/"+s1+"/"+splitted[3]);

        int i=1;
        System.out.println(String.valueOf(i));


        List<Integer> namesLength = new ArrayList<>();
        List<String> names = Arrays.asList("Abhishek","Rahul");
        Map<String, Integer> mapList = new HashMap<>();

        mapList=names.stream().collect(Collectors.toMap(Function.identity(),name->name.length()));

        names.stream().forEach(name -> {

                int length = name.length();
                namesLength.add(length);

        });

        System.out.println("names length"+namesLength.size());

    }
}
