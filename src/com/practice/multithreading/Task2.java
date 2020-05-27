package com.practice.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task2 implements Runnable{
	
	private CyclicBarrier cbr;
	
	public Task2(CyclicBarrier cb) {
		this.cbr =cb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Task2");
		try {
			cbr.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
