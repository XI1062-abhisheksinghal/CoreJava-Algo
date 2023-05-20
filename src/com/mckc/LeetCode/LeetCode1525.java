package com.mckc.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1525 {

    public static void main(String[] args) {

        System.out.println(numSplits("aaaaa"));
    }

    public static int numSplits(String s) {

        //calculate the good splits
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        int res =0;
        for(int i=0;i<s.length();i++){
            String sub1 = s.substring(0,i+1);
            String sub2 = s.substring(i+1,s.length());

            for(int k=0;k<sub1.length();k++){
                set1.add(sub1.charAt(k));
            }

            for(int j=0;j<sub2.length();j++){
                set2.add(sub2.charAt(j));
            }

            if(set1.size()==set2.size()){
                res++;

            }

            set1.clear();
            set2.clear();

        }

        return res;
    }
}
