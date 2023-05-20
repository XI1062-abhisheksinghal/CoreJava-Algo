package com.mckc.LeetCode;

public class LeetCode1662 {

    public static void main(String[] args) {
        String[] word1={"a","bc"};
        String[] word2= {"ab","c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1="";
        String str2="";

        for(String s: word1){

            str1=str1+s;
        }

        for(String s1:word2){

            str2= str2+s1;
        }

        if(str1.equals(str2)){
            return true;
        }

        return false;
    }
}
