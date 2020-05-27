package com.practice.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ExtrinsicLockingEg {
	
	public static int sharedResource = 10;
	
	
	public static void main(String args[]) {
		ReentrantLock rn = new ReentrantLock();
		
		Thread t1 = new Thread(new Worker1(rn));
		Thread t2 = new Thread(new Worker2(rn));
		
		t1.start();
		t2.start();
	}

}



