package com.mckc.array.practice;

public class KadaneAlgorithm {
	
	//Finding the maximum Sum , subarray from the given array
	public static void main(String args[]) {
		   int n[] = {1,2,3,-2,5};
	       System.out.println(maxSubArraySum(n));
	}
	
	public static  int maxSubArraySum(int[] n) {
		
		//int n[] = {1,2,3,-2,5};
		//Max Sum subarray would be 1,2,3,-2,5 and sum would be 9.
		int maxSofar =0;
		int maxEndhere =0;
		
		
		for(int i=0;i<n.length;i++) {
			maxEndhere = maxEndhere+n[i];
			 if(maxEndhere<0) {
				 maxEndhere=0;
			 }
			 if(maxSofar<maxEndhere) {
				 maxSofar= maxEndhere;
			 }
		}
		   
		return maxSofar;
		
	}
}
