package com.mckc.LeetCode;

import javafx.application.Application;
import javafx.stage.Stage;

public class LeetCode1309 {

    public static void main(String[] args){

        System.out.println(freqAlphabets("10#11#12"));

    }

    public static String freqAlphabets(String s) {

        String res ="";
        int start=0;
        int last =0;

        char[] chars = s.toCharArray();

        while(last<chars.length){
            last = start+2;
            char c1 = chars[start];
            char c2 = chars[last];

            if(c2=='#'){
                int i = start;
                int r=0;
                while(i<=last){
                    r =r+ chars[start];
                    i++;
                    char ch = (char)r;
                    res= res+String.valueOf(ch);
                }
            }else{
                int q = chars[start];
                char ch1 = (char)q;
                res = res+String.valueOf(ch1);
            }
            start++;

        }

        return res;
    }


}
