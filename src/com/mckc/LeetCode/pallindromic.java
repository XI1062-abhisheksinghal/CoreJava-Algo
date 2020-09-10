package com.mckc.LeetCode;

public class pallindromic {
	
	public static void main(String args[]) {
		
		String s = "aaaabbbbaaaa";
		
		//Finding the longest pallindromic 
		
		String s1 = "babad";
		
		
		
		//check if string is pallindromic 
		int len = s.length();
		
		String first = s.substring(0,len/2);
		
		String second = s.substring(len/2,len);
		
		System.out.println(first);
		
		StringBuffer buf = new StringBuffer(second);
		if(first.contentEquals(buf.reverse())) {
			System.out.println("true");
			return ;
		}
		System.out.println("false");
		
		
	}

}
