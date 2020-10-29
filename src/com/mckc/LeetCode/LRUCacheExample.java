package com.mckc.LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheExample {

    Map<Integer,Integer> cache;
    int initialCapcity=0;

    LRUCacheExample(int capacity){
        this.initialCapcity= capacity;
        cache = new LinkedHashMap<Integer, Integer>(initialCapcity);
    }

    public void printCache(Map<Integer, Integer> m){

        for(Map.Entry<Integer, Integer> print : m.entrySet()){

            System.out.println(print.getKey()+ " "+ print.getValue());
        }
    }

    public int get(int key) {

        if(cache.containsKey(key)){
            return cache.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {

    }

    public static void main(String[] args) {
        LRUCacheExample lruCacheExample = new LRUCacheExample(2);
        lruCacheExample.put(1,1);
        lruCacheExample.put(2,2);





    }


}
