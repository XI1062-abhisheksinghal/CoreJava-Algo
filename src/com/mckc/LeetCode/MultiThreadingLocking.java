package com.mckc.LeetCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class MultiThreadingLocking {

    public static int val =0;
    public static void main(String[] args) {

        call();
    }

    public static void call(){

        ExecutorService service = Executors.newFixedThreadPool(5);

        Runnable r = (()->{
            Lock lock = new ReentrantLock();
              lock.lock();
               val = val + 1;
                try {
                    Thread.sleep(1000);
                    System.out.println(val);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                lock.unlock();
            }
        });
        IntStream.range(1,10).forEach((str)-> {
            try {
                Thread.sleep(100);
                service.execute(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });


    }




    }

