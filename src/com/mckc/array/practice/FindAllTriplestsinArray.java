package com.mckc.array.practice;

import java.util.Arrays;

public class FindAllTriplestsinArray {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//check if pair is there with given sum 
		// int sum = 10
		System.out.println(hasSum(arr,17));
		
		
	}
	
	//Program to print if sum exists in array or not with 2 elemnts 
	public static boolean hasSum(int[] arr, int sum) {
		
		boolean flag = false;
		if(arr.length==0) {
			flag= false;
		}
		
		
		
		Arrays.sort(arr);
		int low =0;
		int end = arr.length-1;
		
		while(low<=end) {
		if(arr[low]+arr[end]==sum) {
			flag= true;
			System.out.println("The elements in array with sum is "+arr[low]+" "+arr[end]);
			break;
		}
		else if(arr[low]+arr[end]>sum) {
			end--;
		}
		else if(arr[low]+arr[end]<sum) {
			low++;
		}
		
		
		}
		
		return flag;
	}
	
	//function to print the triplet with given sum 
	public void printTriplets(int[] arr,int sum) {
		
		Arrays.sort(arr);
		
		
	}

}
