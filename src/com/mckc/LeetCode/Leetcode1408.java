package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1408 {

    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> res = stringMatching(words);
        System.out.println(res);
    }
    public static List<String> stringMatching(String[] words) {

        //checking if string is a subString
        List<String> res = new ArrayList<String>();

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()>words[j].length()){
                    if(checkifS1isSubOfS2(words[j],words[i])){
                        res.add(words[j]);
                    }
                }else{
                    if(checkifS1isSubOfS2(words[i],words[j])){
                        res.add(words[i]);
                    }
                }
            }
        }

        return res;

    }


    public static boolean checkifS1isSubOfS2(String s1, String s2){

        int diff = s2.length()-s1.length();

        for(int i=0;i<=diff;i++){

            if(s1.equals(s2.substring(i,i+s1.length()))){
                return true;
            }
        }

        return false;
    }
}
