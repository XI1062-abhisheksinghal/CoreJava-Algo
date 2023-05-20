package com.mckc.LeetCode;

public class interleavingString {

    public static void main(String[] args) {

        System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {

        if((s1=="") && (s2=="") && (s3=="")){

            return true;
        }
        //index to monoitor for string s1
        int i=0;
        //index to monitor for string s2
        int j=0;

        char[] s3chars = s3.toCharArray();

        for(char c:s3chars){
            if(i<s1.length()) {

                if (c == s1.charAt(i)) {
                    i++;
                    continue;
                }
            }
            if(j<s2.length()) {
                if (c == s2.charAt(j)) {
                    j++;
                }
            }
                else{
                    break;
                }
        }

        if((i== s1.length()-1) && (j==s2.length()-1)){
            return true;
        }

        return false;

    }
}
