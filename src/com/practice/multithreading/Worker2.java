package com.practice.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Worker2 implements Runnable{
	
	ReentrantLock lock ;
	
	public  Worker2(ReentrantLock lock) {
		// TODO Auto-generated constructor stub
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Worker2 Thread" +Thread.currentThread().getName());
		
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
