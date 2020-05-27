package com.practice.multithreading;

public class Function2 {
	
	void func2() {
		
		try {
			Thread.sleep(1000);
			System.out.println("This is inside func2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
