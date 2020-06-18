package com.mckc.LeetCode;

public class LastWordLength {
	
	public static void main(String args[]) {
		
		String s =" ";
		
		if(s!=null || !s.isEmpty()) {
		String[] arr = s.split(" ");
		
		int lastindex = arr.length-1;
		
		System.out.println(arr[lastindex].length());
		
		}
	}

}
