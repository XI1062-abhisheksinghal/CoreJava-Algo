package com.mckc.LeetCode;

import java.util.*;

public class LeetCode890 {

    public static void main(String[] args) {
        String[] wors = {"a","b","c"};
        String pattern="a";
        System.out.println(findAndReplacePattern(wors,pattern));
    }


    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        List<String> result = new ArrayList<String>();
        List<Integer> values = new ArrayList<Integer>();
        List<Integer> pattValues= new ArrayList<Integer>();
        char[] chars = pattern.toCharArray();

        for(char cp :chars){
            if(hmap.containsKey(cp)){
                hmap.put(cp,hmap.get(cp)+1);
            }else{
                hmap.put(cp,1);
            }
        }

        for(Integer val: hmap.values()){
            pattValues.add(val);
        }

        for(int i=0;i<words.length;i++){

            String s = words[i];
            char[] charsOfWords = s.toCharArray();
            Map<Character, Integer> mapOfWord = new LinkedHashMap<Character, Integer>();
            for(char c: charsOfWords){
                if(mapOfWord.containsKey(c)){
                    mapOfWord.put(c,mapOfWord.get(c)+1);
                }else{
                    mapOfWord.put(c,1);
                }
            }
            for(Integer v: mapOfWord.values()){
                values.add(v);
            }
            if(pattValues.equals(values)){
                result.add(s);
            }
            values.clear();
        }
        return result;
    }
}
