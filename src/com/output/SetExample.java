package com.output;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        s.stream().forEach(x->System.out.println(x));
        System.out.println(s.iterator().next());

        Object[] arr =  s.toArray();
        System.out.println(arr[0]);


    }
}
