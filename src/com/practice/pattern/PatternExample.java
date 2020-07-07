package com.practice.pattern;

import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
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
		for(int k=n-1;k>=0;k--) {
			int l=0;
			while(l<k) {
				System.out.print("*");
				l++;
				if(l>k) {
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
