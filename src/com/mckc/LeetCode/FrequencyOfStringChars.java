package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfStringChars {

    public static void main(String[] args) {

        String s ="zaabdccc";
        System.out.println(findString(s));
    }


    public static String findString(String s){

        char[] chars = s.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<Character,Integer>();
        String result="";
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }
            else{
                map.put(chars[i],1);
            }
        }

        for(Map.Entry m:map.entrySet()){
            String key = String.valueOf(m.getKey());
            String value = String.valueOf(m.getValue());
            result= result+key+value;
        }

        return result;
    }
}
