package com.mckc.recursion;

public class GenerateAllBinaryStrinnWithoutConsecutiveOnes {
	
	public static void main(String args[]) {
		
		int n =4;
		int totalCombinations =1;
		//so binary string are 000, 001, 101 and so on .....
		
		//total number of combinations are 2*2*2 = 8 
		for(int i=0;i<n;i++) {
			
			 totalCombinations = totalCombinations*2;
		}
		
		
		
		System.out.println(totalCombinations);
	}

}
