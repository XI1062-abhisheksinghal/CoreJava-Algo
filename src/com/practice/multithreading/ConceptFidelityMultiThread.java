package com.practice.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConceptFidelityMultiThread {
	
	
	public static void main(String args[]) {
		
		List<Integer> ls = new ArrayList<>();
		
		Collections.synchronizedList(ls);
		
		
		for(int i=1;i<=10;i++) {
			ls.add(i);
		}
		
		for(Integer in:ls) {
			
		}
		
		
	}
	
	public void processNumber(int n) {
		
		
		Thread evenProcess = new Thread(()-> {
			if(n%2==0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    System.out.println(n);
			System.out.println("Thread to process even numbers ");
			
			}
			
		});
		
		Thread oddProcess = new Thread(()-> {
			if(n%2==1) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			System.out.println(n);
			System.out.println("Thread to process odd numbers");
			}
		});
		
		evenProcess.start();
		oddProcess.start();
		
		
		
		}

}
