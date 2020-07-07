package com.practice.pattern;

import java.util.Scanner;

public class SandGlassPattern {
	
	public static void main(String args[]) {
		
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * *
		
		//Kind of two inverted pyramid 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int k=i;
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			for(int j=n-i;j>0;j--) {
				
				System.out.print(" * ");
			}
			System.out.println(" ");
			
			
		}
	}

}
