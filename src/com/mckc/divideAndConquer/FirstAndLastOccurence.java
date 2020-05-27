package com.mckc.divideAndConquer;

public class FirstAndLastOccurence {
	
	public static void main(String args[]) {
		
		//Array given is sorted 
		int[] arr = {2,5,5,5,6,6,8,9,9,9};
		
		int target = 5;
		int startindex=0;
		int lastIndex=0;
		
		//First occurrence 1 , last occurrence 3
		
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				
				
				startindex=i;
				
			}
			
		}
	}

}
