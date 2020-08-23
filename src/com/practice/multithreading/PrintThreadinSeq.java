package com.practice.multithreading;

public class PrintThreadinSeq {
	
	//Use Case Thread 1 prints A , Thread 2 prints B , print ABABAB 3 times each thread 
	
	private static boolean flag ;
	
	public static synchronized void printValues(boolean flag, int valueofA, int valueofB) {
		
		if(!flag)
			
			System.out.println("A");
			
		else {
			System.out.println("B");
		}
	}
	
	
	public static void main(String args[]) throws InterruptedException {
		
		
		Thread t = new Thread(()-> {
			flag = false;
			printValues(flag,0,0);
		});
		
		
     Thread t1 = new Thread(()-> {
			flag = true;
			printValues(flag,0,0);
		});
		
     
     t.start();
     
     t1.start();
     
	}

}
