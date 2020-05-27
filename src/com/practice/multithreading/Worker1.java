package com.practice.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Worker1 implements Runnable{
	
    
	public Worker1(ReentrantLock lock) {
		this.lock=lock;
	}

	ReentrantLock lock;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run method of thread"+Thread.currentThread().getName());
		
		lock.lock();
		
		try {
			ExtrinsicLockingEg.sharedResource++;
			System.out.println(ExtrinsicLockingEg.sharedResource);
			System.out.println(lock.getHoldCount());
		}
		finally {
			lock.unlock();
		}
		
	}
	
	
	
	
	

}
