package com.mckc.recursion;

public class LongestAlternatingProblem {
	
	public  static void main(String args[]) {
		
		
		//Longest alternationg subarray 
		int[] arr = {1,-2,6,4,-3,2,-4,-3};
		int[] result;
		for(int i=0;i<arr.length;i++) {
            for( int j=i;j<arr.length;j++) {
            	
            	
            }		
		}
		String original ="my name is abhishek";
		//Reverse the abhishek is name my
		
		String[] reverse = original.split(" ");
		
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.println(reverse[i]);
		}
		
		//here longest subsequence is 4, -3, , 2, -4 (based on kadane's algorithm)
		int maxSoFar = 0;
		
		int maxEndHere = 0;
		
		for( int i=0;i<arr.length;i++) {
			
			maxEndHere = maxEndHere +arr[i];
			
			maxEndHere= Integer.max(maxEndHere, 0);
			
			maxSoFar =Integer.max(maxEndHere, maxSoFar);
			
		}
		
		System.out.println(maxSoFar);
		
		
		
		
		
		
		//Largest sub-array sum problem 
		
	}

}
