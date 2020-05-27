package com.practice.multithreading;

public class ReadWriteLockImpl {
	
	//Program for Read write impl using Lock Interface
	
	//Can be done by Lock Interface , Synchronized keyword , Synchronized block .
	 
	private static volatile int count = 5;
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
		try {
			callThread1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		callThread2();
		
		}
	}
	
	
	
	
	public static void callThread1() throws InterruptedException{
	Thread t = new Thread(()-> {
		count++;
		System.out.println(count);
		
	});
	 
	t.start();
	t.wait(1000000);
	
	}
	
	public static void callThread2() {
		Thread t1 = new Thread(()-> {
			count++;
			System.out.println(count);
		});
		
		t1.start();
	}
	

}
