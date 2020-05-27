package com.practice.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task1 implements Runnable {
	
	private CyclicBarrier cyclicBarrier;
	public Task1(CyclicBarrier cyclicBarrier) {
		
		this.cyclicBarrier= cyclicBarrier;
	}

	@Override
	public void run() {
       		
		
		try {
			
			System.out.println("Inside Task1");
			
				cyclicBarrier.await();
		
		} catch (Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
