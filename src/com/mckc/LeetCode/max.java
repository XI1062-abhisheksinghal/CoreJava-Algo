package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class max {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<Integer>();
        ls.add(34);
        ls.add(45);
        ls.add(12);

        Optional<Integer> maxNum = ls.stream().max(Integer::compareTo);
        System.out.println(maxNum.get());

    }
}
