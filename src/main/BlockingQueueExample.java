package main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueExample {
	
	public static void main(String args[]) {
		
		BlockingQueue<Integer> blocking = new ArrayBlockingQueue<Integer>(2);
		BlockingQueue<String> linkedblockingqueue = new LinkedBlockingDeque<String>();
		
		try {
			blocking.put(12);
			//blocking.put(13);
			blocking.put(14);
			blocking.put(15);
			
			linkedblockingqueue.add("abhishek");
		
			
			System.out.println("inside of put of blocking queue");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
