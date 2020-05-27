package com.mckc.recursion;

public class recursion {
	
	static int count =0;
	
	public static void main(String args[]) {
		printNum();
		
	}
	
	static void printNum() {
		
		count++;
		if(count<=10) {
			
			System.out.println(count);
		}else {
			return;
		}
		printNum();
	}

}
