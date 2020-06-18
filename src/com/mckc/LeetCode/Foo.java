package com.mckc.LeetCode;

public class Foo {
	
	public void printFirst() {
		System.out.println("first");
	}
	
	public void printSecond() {
		System.out.println("second");
	}
	
	public void printthird() {
		System.out.println("third");
	}
	
	public static void main(String args[]) {
		
		Foo f = new Foo();
		Thread t1 = new Thread(()-> {
			f.printFirst();
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
		
		Thread t2 = new Thread(()->
		{
			f.printSecond();
		}
		);
		
		Thread t3 = new Thread(()->{
			f.printthird();
		});
		
		t2.run();
		t3.run();
		t1.run();
	}
	
	

}
