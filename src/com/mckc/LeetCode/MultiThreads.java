package com.mckc.LeetCode;

import java.util.concurrent.CompletableFuture;

public class MultiThreads {
	
	public void first() {
		System.out.print("first");
	}
	
	public void second() {
		System.out.print("second");
	}
	
	public void third() {
		System.out.print("third");
	}
	
	public String fourth() {
		return "Inside Fourth method";
	}
	
	
	public static void main(String args[]){
		
		int [] input= {1,2,3};
		
		MultiThreads mul = new MultiThreads();
		Thread t = new Thread(()-> {
			
			mul.first();
		});
		t.start();

		Thread t2 = new Thread(()-> {
			mul.second();
		});
		t2.start();
		
		Thread t3 = new Thread(()-> {
			mul.third();
		} );
		t3.start();
		
		
		
		
	}
}
