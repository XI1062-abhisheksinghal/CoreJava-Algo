package com.mckc.LeetCode;

public class ReverseStringWordbyWord {
	
	public static void main(String args[]) {
		
		System.out.println(reverseByWord("the sly is blue"));

}
	
	
	public static String reverseByWord(String s) {
		
		

		
		String[] arr = new String[s.length()];
		String reverse = "";
        arr= s.split(" ");	
        
        for(int i=arr.length-1;i>=0;i--) {
        	
        	reverse =reverse.concat(arr[i]+" ");
        }
        
        return reverse;
		
	}
	
	}
