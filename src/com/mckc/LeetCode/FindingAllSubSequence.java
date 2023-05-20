package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindingAllSubSequence {
    // Declare a global list
    static List<String> al = new ArrayList<>();

    public static void main(String[] args) {

        String s = "abcd";
        findAllSubSequence(s, ""); // Calling a function
        System.out.println(al);
    }

    public static void findAllSubSequence(String s, String ans){

        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        findAllSubSequence(s.substring(1), ans + s.charAt(0));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findAllSubSequence(s.substring(1), ans);
    }
}
