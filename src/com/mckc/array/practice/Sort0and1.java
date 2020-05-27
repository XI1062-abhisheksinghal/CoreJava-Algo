package com.mckc.array.practice;

import java.util.Arrays;

public class Sort0and1 {
	
	public static void main(String args[]) {
		
		
		int[] arr = {1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1};
		
		//Approach to print as sorted as 0 0 0 0 0 0 0 1 1 1 1 1 
		
		int first =0;
		int last = arr.length-1;
		
		//Arrays.parallelSort(arr);
	   
	    
	    
	    for (int i = 0; i < arr.length; i++) {
	    	   int left=0;
	    	   int right=arr.length-1;
	    	   while(arr[left]==0)
	    	   {
	    	    left++;
	    	   }
	    	   while(arr[right]==1)
	    	   {
	    	    right--;
	    	   }
	    	   
	    	   if(left<right)
	    	   {
	    	    int temp=arr[left];
	    	    arr[left]=arr[right];
	    	    arr[right]=temp;
	    	   }
	    	  }
	    Arrays.stream(arr).forEach(System.out::println);	}

}
