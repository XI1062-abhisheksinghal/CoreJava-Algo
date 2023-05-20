package com.mckc.LeetCode;

public class LeetCode1880 {

    public static void main(String[] args) {

        System.out.println(isSumEqual("acb","cba","cdb"));

        String s = "-abc";
        System.out.println(s.substring(0,1));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        String first = valueOfString(firstWord);
        String second = valueOfString(secondWord);
        String target = valueOfString(targetWord);

        int sum = Integer.valueOf(first)+Integer.valueOf(second);

        if(sum==Integer.valueOf(target)){
            return true;
        }

        return false;

    }

    public static String valueOfString(String str){

        char[] chars = str.toCharArray();

        String s1 ="";
        for(int i=0;i<chars.length;i++){

            int val = chars[i]-97;
            s1= s1+ val;
        }

        return s1;
    }
}
