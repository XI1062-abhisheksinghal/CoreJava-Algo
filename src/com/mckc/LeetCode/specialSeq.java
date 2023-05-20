package com.mckc.LeetCode;

import com.sun.tools.javac.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class specialSeq {

    public static int secondsToRemoveOccurrences(String s) {

        int count =0;
        String t = s;
        boolean flag = false;
        for(int i=0;i<=t.length();i++){
            flag=false;
            for(int j=0;j<t.length();){
                if(j+1<t.length()){
                    if(specialSeq(t.substring(j,j+2))){
                        int len = t.length();
                        String first = t.substring(0,j);
                        String second = t.substring(j+2,len);
                        t=first+"10"+second;
                       flag=true;
                       j=j+1;
                    }
                }
                j++;
            }
            if(flag){
                count++;
            }
        }
        return count;
    }



    public static boolean specialSeq(String seq){

        if(seq.equals("01")){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(secondsToRemoveOccurrences("001011"));
        char c = 'a';
        //kind of circular array
        int val = c-1;
        String s2= String.valueOf(c);
        if(val<97){
            int diff=97-val;
            int finalvalue = 122-diff+1;
            char ch = (char)finalvalue;
            System.out.println(ch);
        }

        String s = "abhishek";
        char c4 = s.charAt(0);



        System.out.println(val);

        List<String> names = List.of("Abhishek","Singhal","Abhishek");

        Map<String, Long> mapOfNames= names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Integer,Integer> map= new HashMap<>();
        map.put(1,2);
        map.put(1,2);

        for(Map.Entry<Integer,Integer> m:map.entrySet()){

            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }

        System.out.println(map.get(1));
    }
}
