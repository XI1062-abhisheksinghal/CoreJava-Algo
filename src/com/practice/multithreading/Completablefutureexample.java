package com.practice.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Completablefutureexample {
	
	static void finalTask() {
		System.out.println("Task called after function 1 and function2");
	}
	
	public static void main(String args[]) {
		
		Function1 func= new Function1();
		Function2 function2 = new Function2();
		
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
	        return "hello";
	    });
		
		
		
		
	}

}
