package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode443 {

    public static void main(String[] args) {
        char[] res = {'a','a','b','b','c','c','c'};
        System.out.println(compress(res));
       // String s = "97";
        char c = '1';
        char d ='0';

        int e = c+d;
        char f = (char) e;
        System.out.println(f);

    }

    public static int compress(char[] chars) {

        String s ="";
        List<Character> ls = new ArrayList<>();
        for(char c:chars){
            ls.add(c);
        }
        for(int i=0;i<chars.length;){

            int f = Collections.frequency(ls,chars[i]);
            s= s+String.valueOf(chars[i])+String.valueOf(f);
            i=i+f;
        }

        return s.length();
    }
}
