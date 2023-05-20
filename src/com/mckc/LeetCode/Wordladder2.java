package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wordladder2 {

    public static void main(String[] args) {

        List<List<String>> ls = findLadders("hit","cog", Arrays.asList("hot","dot","dog","lot","log","cog"));

        ls.stream().forEach(ls1->ls1.stream().forEach(ls2-> System.out.println(ls2)));
        List<Integer> ls3 = new ArrayList<>();
        ls3.add(1);
        ls3.add(2);
        ls3.add(3);

        int sum =ls3.stream().reduce((a,b)->a+b).get();
        ls3.clear();
        System.out.println(ls3.size());
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ls = new ArrayList<>();
        List<String> ls1 = new ArrayList<>();
        if (!wordList.contains(endWord)) {
            ls1.add("");
        }

        ls1.add(beginWord);


        return ls;


    }

    public static boolean differByoneChar(String s, String s1){

        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();
        int count =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}




