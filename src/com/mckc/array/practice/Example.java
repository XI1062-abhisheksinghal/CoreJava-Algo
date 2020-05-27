package com.mckc.array.practice;

public class Example extends Thread {
	
	Example(){
		System.out.println("example");
	}

	public void run() {
		System.out.println("bar");
	}
	
	public void run(String s) {
		System.out.println("baz");
	}
}
