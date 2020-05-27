package com.practice.pattern;

public class PatternExample {
	
	public static void main(String args[]) {
		
		
		/*
		 *      *
		 *      **
		 *      ***
		 *      ****
		 *      *****
		 *      ******
		 *      *****
		 *      ****
		 *      ***
		 *      **
		 *      *
		 *      
		 */
		
		//no of lines would be dependent on the n which is input 
		
		for(int i=1;i<=6;i++) {
			int j=1;
		   while(j<=i) {
			System.out.print("*");
			j++;
			if(j>i) {
				break;
			}
			}
		   
			System.out.println();
		}
		
		/*
		 * 
		 * 
		 */
	}

}
