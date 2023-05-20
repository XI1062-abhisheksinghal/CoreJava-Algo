package com.mckc.LeetCode;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassByValuePassByRef {

    public static void main(String[] args) {
        String s1 ="singh";
        passByValue(s1);
        System.out.println(s1);

        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(2);
        ls.add(3);

        passByRef(ls);
        List<Integer> ls1=ls.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        List<String> names = new ArrayList<>();
        names.add("Aabhishek");
        names.add("Abhi");
        names.add("Abhiii");

         List<String> n=names.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
         n.forEach(System.out::println);
        List<String> n1=names.stream().sorted(Comparator.comparing(String::new)).collect(Collectors.toList());

        n1.forEach(System.out::println);
        Optional<Integer> maxv=ls.stream().max(Comparator.comparing(Integer::intValue));
        ls.stream().max(Integer::compareTo);
        System.out.println(maxv.get());

        ls1.forEach(System.out::println);

        int[] nums = {2,2,3,2};
        List<Integer> ls2 = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Map<Integer, Long> m=
                ls2.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        m.entrySet().forEach(System.out::println);

        Map.Entry<Integer, Long> res=m .entrySet().stream().filter(ele->ele.getValue()==1).findFirst().get();
        System.out.println("====="+res.getKey());

        Predicate<String> ifAisGreaterthan5 = s->s1.length()>10;
        BiPredicate<String,String> ifAisGreater = (s,s2)->s.length()>s2.length();


    }

    private static void passByValue(String s1){

        s1= "abhi";
        System.out.println(s1);

    }

    private static void passByRef(List<Integer> ls){
        ls.add(4);

    }




}
