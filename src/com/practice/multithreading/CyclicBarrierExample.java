package com.practice.multithreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	
	public static void main(String args[]) {
		
		CyclicBarrier cb = new CyclicBarrier(2, ()-> {
			System.out.println("Cyclic barrier");
		});
		
		Thread t1 = new Thread(new Task1(cb));
		Thread t2 = new Thread(new Task2(cb));
		
		t1.start();
		t2.start();
		
		
		
		
		
	}
	
	

}
