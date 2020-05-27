package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenThreads {
	
	
	//Create the two threads which prints 1 and 2 in sequence 
	
	// Thread1 prints ---> 1,3,5
	//Thread2 prints ---> 2, 4,6,8
	
	
	//This lock can behave as shared resource where both the threads acquire lock one by one and execute  it
	
	//Concept of CyclicBarrier , CountDownlatch , Semaphore , 
	//Concept of CompletableFuture 
	//Code to implement BlockingQueue :- Concept of Blocking Queue , suppose there are 5 threads try to read data from queue , how blocking queue will behaave
	
	private volatile static Integer lock= 0;
	public static void main(String args[]) {
		
		Thread t = new Thread(()->{
			try {
			System.out.println("This is inside Thread 1");
			lock++;
			System.out.println(lock);
			Thread.sleep(9000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		 Thread t1 = new Thread(()-> {
		    	System.out.println("This is inside Thread 2");
		    	lock++;
		    	System.out.println(lock);
		    });
		 
//		 t.start();
//		 t1.start();
		 
		 
		 //How we can maintain the lifecycle of threads using ExecutorService 
		 // We send the runnable or callable task to the executor service
		 
		 ExecutorService es = Executors.newFixedThreadPool(10);
		 for(int i=0;i<4;i++) {
		 es.execute(t);
		 es.execute(t1);
		 }
		 
		 
		 
		 
		 
	}
	
	   
	    
	
	

}
