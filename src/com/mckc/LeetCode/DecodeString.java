package com.mckc.LeetCode;

public class DecodeString {

    public static void main(String[] args) {
        String s = "a10";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {

        String s1 = s;
        String s2 = "";
        int num=0;
        String s3 ="";
        Integer num1=0;
        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length;) {
            boolean val = Character.isDigit(chars[i]);
            if(!val){s2=s2+chars[i]; i++;}
            while (val && i<chars.length) {
                  num = chars[i]-48;
                   s3 = s3+String.valueOf(num);
                    num1 = Integer.valueOf(s3);
                  i++;
                    }
            s3="";
            for(int j=0;j<num1;j++){
                //s2=s2+ s1.substring(0,);
            }
                }
        return s2;
    }
}
