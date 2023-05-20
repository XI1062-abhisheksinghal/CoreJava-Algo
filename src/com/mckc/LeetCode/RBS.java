package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RBS {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        lock.lock();

        lock.lock();

        HashMap<String, String> map = new HashMap<>();

        map.put(null,"a");
        map.put("a","b");
        map.put("a","c");

        System.out.println(map.size());

    }
}
