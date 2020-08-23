package com.mckc.LeetCode;

public class Problem43 {
	
	public static void main(String args[]) {
		
		
		System.out.println(mul("123","12"));
		
	}
	
	public static String mul(String num1, String num2) {
		
		Integer i =Integer.valueOf(num1);
		Integer i2 =Integer.valueOf(num2);
		
		
		return String.valueOf(i*i2);
		
		
	}

}
