package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckListEqual {



    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(3);
        l2.add(2);

        Collections.unmodifiableList(l1);

        if(l1.equals(l2)){
            System.out.println("two lists are equal");
        }





    }
}
