package com.mckc.LeetCode;

public class LeetCode1750 {

    public static void main(String[] args) {

        String s = "cabaabac";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {

        String res=s;
        int start=0;

        char prefix = s.charAt(0);
        char suffix = s.charAt(s.length()-1);

        int end =s.length()-1;

        while(prefix==suffix){
            start=start+1;

            res = res.substring(start,end);
            prefix = res.charAt(0);
            suffix= res.charAt(res.length()-1);
            end=res.length();

        }

        return res.length();

    }
}
