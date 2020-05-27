package com.practice.pattern;

public class PyramidPattern {
	
	/*
	 *         *
	 *        ***
	 *       *****
	 *      *******
	 */
	
	public static void main(String args[]) {
		
		//no of lines 4, n
		
		// no of spaces 3,2,1,0    //n=4
		// no of stars 1,3,5,7    //n =4    on line i  (i*2-1)
		int k=4;
		int m=0;
		for(int i=1;i<=4;i++) {
			
			for(int j=k;j>=1;j--) {
				System.out.print(" ");
			}
			k--;
		     while(m!=2*i-1)
		     {
			System.out.print("*");
			++m;
			}
			System.out.println();
		}
		
		
	}

}
