package com.mckc.LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class HappyNumbers {
	
	static boolean isHappy(int n) {
		//till how long it will run depends on number of digits in a number
		Set<Integer> ls = new LinkedHashSet<Integer>();
		boolean flag = false;
		int square =0;
		
		while(n!=0 && ls.add(n)) {
			
		int num =n%10;
		 square = num*num +square;
		 ls.add(square);
		 
		 n = n/10;
		 if(square==1 && n==0) {
		     flag=true;
				break;
		 }
		 if(n==0 && square!=0) {
			 n=square;
			 square =0;
		 }
	}
		return flag;
	}
	
	static void reverseNumber(int n) {
		//if n =10 , print 01 , n =234 , print 432
		
		while(n!=0) {
			int remainder = n%10;
			System.out.print(remainder);
			 n = n/10;
			}
	}
	
	public static void main(String args[]) {
		
		reverseNumber(123456789);
		//failing for 1111111
		boolean result = isHappy(19);
		System.out.println("==="+result);
		
	}
	
	

}
