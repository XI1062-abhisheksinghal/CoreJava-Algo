package com.practice.multithreading;

import java.util.concurrent.TimeUnit;

public class Concurrecny1 {
	
	
	public static void main(String args[]) {
		
	 boolean stopRequest=false;
		
		Thread t = new Thread(()-> {
			
			try {
			System.out.println("Thread spanned ");
			int i=0;
			
			while(!stopRequest) {
				System.out.println(i);
				i++;
			}
			
			
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		});
		
		t.start();
	}

}
