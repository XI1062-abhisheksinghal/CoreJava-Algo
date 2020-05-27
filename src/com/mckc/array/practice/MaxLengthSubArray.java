package com.mckc.array.practice;


public class MaxLengthSubArray {
	
	public static void main(String args[]) {
		
		//Given array find max sub length array having alternate 0's and 1's.
		
		int[] arr= {0,0,1,0,1,0,0};
		
		//Output would be {0,1,0,1} {1,0,1,0}	
		int startposition =0;
		int lastpoition=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				startposition=i+1;
			}
			if(arr[startposition]!=arr[i]) {
				lastpoition=i;
			}
		}
		
		for(int j=startposition;j<lastpoition;j++) {
			
			System.out.println(arr[j]);
		}
		
	
	
	}

}
