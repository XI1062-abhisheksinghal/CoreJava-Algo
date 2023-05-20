package com.mckc.LeetCode;

public class PowerSetString {

    public static void main(String[] args) {

        subSet(0,"1234","");
    }


    public static void subSet(int i,String s, String c) {

        if(i==s.length()){
            System.out.println(c);
            return;
        }

        subSet(i+1,s,c+s.charAt(i));
        subSet(i+1,s,c);

    }


}
