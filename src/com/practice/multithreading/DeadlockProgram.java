package com.practice.multithreading;

public class DeadlockProgram {
	
	static String x = "I am X";
	static String y = "I am Y";
	
	public static void main(String args[]) throws InterruptedException {
		
		DeadlockProgram dead = new DeadlockProgram();
		
		Thread t = new Thread(()->{
			dead.callX();
			
		}); 
		t.start();
		
		Thread t1 = new Thread(()->{
			dead.callY();
		});
		t1.start();
		
	}
	
	public static void callX() {
		
		synchronized(x) {
			synchronized(y) {
				System.out.println("Inside callX program");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	public static void callY() {
		synchronized(y) {
			synchronized (x) {
				System.out.println("Insed callY program");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
