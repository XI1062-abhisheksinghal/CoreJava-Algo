package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;

public class MaxConcat {

    public static void main(String[] args) {

        System.out.println(maxLength(Arrays.asList("cha","r","act","ers")));

    }

    public static int maxLength(List<String> arr) {

        if (arr.size() == 1) {
            return arr.get(0).length();

        }
        int maxLength = 0;


        for (int i = 0; i < arr.size(); i++) {
                String combined="";
                boolean flag = true;
                int j=i;
                 while(j<arr.size()-1 && flag){
                         if(checkIfAllCharsAreUnique(arr.get(i), arr.get(i+1))){
                              combined = combined+arr.get(i) + arr.get(i+1);
                         if (combined.length() > maxLength) {
                             maxLength = combined.length();
                         }
                    }else{
                             flag = false;
                             break;
                         }
                         j++;
                }
            }



        return maxLength;
    }

    public static boolean checkIfAllCharsAreUnique(String s1, String s2) {

        String shorter = s1.length() < s2.length() ? s1 : s2;

        char[] charShorter = shorter.toCharArray();

        for (char c : charShorter) {
            if (!shorter.equals(s1)) {
                if (s1.contains(String.valueOf(c))) {
                    return false;
                }
            } else {
                if (s2.contains(String.valueOf(c))) {
                    return false;
                }
            }
        }

        return true;

    }
}
