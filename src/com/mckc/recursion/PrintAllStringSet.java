package com.mckc.recursion;

public class PrintAllStringSet {

	public static void main(String args[]) {

		//finding the frequency of each character in String 
		
	   String magazine = "hello";
	   
	   int[] fm= new int[26];
	   for(char c: magazine.toCharArray()) {
		   fm[c-'a']++;
	   }
	   
	   for(int i=0;i<fm.length;i++) 
	   
	   if(fm[i]!=0) {
		   System.out.println(fm[i]);
	   }

		
	}

	

}
