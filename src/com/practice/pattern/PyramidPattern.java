package com.practice.pattern;

import java.util.Scanner;

public class PyramidPattern {
	
	
	//Pattern 1
	/*                  Line---> No of Spaces
 	 *         *   //1    0--->3
	 *        ***  //3    1--->2
	 *       ***** //5    2--->1
	 *      ******* //7   3--->0
	 */
	
	public static void main(String args[]) {
		
		//no of lines 4, n
		
		// no of spaces 3,2,1,0    //n=4
		// no of stars 1,3,5,7    //n =4    on line i  (i*2-1)
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int k=n; //no of lines 
		/*
		 * for(int i=1;i<=4;i++) {
		 * 
		 * for(int j=k;j>=1;j--) { System.out.print(" "); } k--; while(m!=2*i-1) {
		 * System.out.print("*"); ++m; } System.out.println(); }
		 */
		
		for(int i=0;i<k;i++) {
			for(int j=k-1-i;j>=0;j--) {
				System.out.print(" ");
			}
			int l = 2*i+1;
			while(l>0) {
				System.out.print("*");
				l--;
			}
			System.out.println();
		}
		
		for(int m=0;m<k;m++) {
			for(int o=m+1;o>=0;o--) {          //0-->5
			  System.out.print(" ");        //1-->3
			}                                 //2-->1
			int p= ((k+1)-2*m)+1;
			while(p>0) {
				System.out.print("*");
				p--;
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
