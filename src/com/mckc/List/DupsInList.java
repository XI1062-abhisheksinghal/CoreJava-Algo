package com.mckc.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DupsInList {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("Abc");
        ls.add("Abc");
        ls.add("xyz");

        List<String> ls1 = ls.stream().distinct().collect(Collectors.toList());
        ls1.forEach(s-> System.out.println(s));
        System.out.println(ls1.size());

    }
}
