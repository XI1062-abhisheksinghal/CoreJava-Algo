package com.mckc.array.practice;

public class MaxProductOfArray {
	
	public static void main(String args[]) {
		
		int[] arr= {1,2,45,56,9,3,4};
		//Max product in array 
		
		//Brute force method 
		int maxproduct =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				
				if(arr[i]*arr[j]>maxproduct) {
					maxproduct = arr[i] *arr[j];
				}
				
			}
		}
		
		System.out.println(maxproduct);
		
		
	}

}
