package com.practice.multithreading;

import java.util.Arrays;

public class CustomBlockingQueue {
	
	    //add operation , dequeue operation 
		//add not allowed if queue is full , dequeue is not allowed if queue is empty 
		
		private static int[] queue ;
		private int size;
		int pos =0;
		int start=0;
		public CustomBlockingQueue(int size) {
			 this.size= size;
			 queue = new int[size];
			
		}
		
		
		public synchronized void add(int element) throws Exception {
			
			if(pos>=size) {
				throw new Exception("queue size is full , wait");
				
			}
			
			this.queue[pos++]=element;
			System.out.println("Element inserted successfully");
			
		}
		
		public synchronized int dequeue() throws Exception{
			
			if(this.queue.length==0) {
				throw new Exception("queue is already empty no element to pop");
			}
			
			int dequeued =this.queue[0];
			System.out.println("element dequeued");
			return dequeued;
			
		}
		
		public static void printQueue() {
			Arrays.stream(queue).forEach(System.out::println);
		}
		
		
		public static void main(String args[]) {
			
			CustomBlockingQueue cbq = new CustomBlockingQueue(2);
			try {
				cbq.add(10);
				cbq.add(20);
				cbq.dequeue();
				
				printQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	

}
