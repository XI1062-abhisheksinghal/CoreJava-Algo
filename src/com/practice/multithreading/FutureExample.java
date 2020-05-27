package com.practice.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
	
	public static void main(String args[]) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Future<Integer> fut = es.submit(new CallableTask1());
		
		try {
			Integer value = fut.get();
			System.out.println(value);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
