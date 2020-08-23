package com.mckc.array.practice;

import java.util.Arrays;

//Two problems are there , 1st count subset than print the subsets 
//Problem Statement 
// Count subset with the given sum in integer array and print subset
public class CountSubsetWithSumX {
	
	public static void main(String args[]) {
		
		int[] arr = {2,1,45,34,23,100,1,2};
		
		int sum = 2;
		int count =0;
		//Output shall be 1
		System.out.println(countPairs(arr, arr.length, sum, count, 0));
		
	}
	
	public static int countPairs(int[] arr,int n , int sum,int count , int i) {
		//base condition 
		if(i==n) {
			if(sum==0) {
				count++;
			}
			return count;
		}
		count = countPairs(arr, arr.length, sum, count, i+1);
		count = countPairs(arr, arr.length, sum-arr[i], count, i+1);
		
		return count;
	}

}
