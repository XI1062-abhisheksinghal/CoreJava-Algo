package com.practice.pattern;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String args[]) {

//		    *
//		   * *
//		  *   *
//		 *     *
//		*********

		// 9 stars in 5th line , spaces logic as 0 on first line , 1 on second line , 3
		// on 3rd line , 5 on 5th line

		{
            Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter the number of rows: ");
 
            int rows = sc.nextInt();
             
            for (int i=1; i<= rows ; i++)
            {
                for (int j = i; j < rows ; j++) {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= (2*i -1) ;k++) {
                    if( k==1 || i == rows || k==(2*i-1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            sc.close();
        }

	}

}
