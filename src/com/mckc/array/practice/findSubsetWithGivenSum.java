package com.mckc.array.practice;

import java.util.ArrayList;
import java.util.List;

public class findSubsetWithGivenSum {
	
	public static void main(String args[]) {
		
		int[] arr = {2,3,4,5,6,12,11};
		int sum =5;
		
		printAllSubsets(arr,sum,arr.length);
		
	}
	
	
	public static void printAllSubsets(int[] arr, int sum, int len) {
		
		List<Integer> ls = new ArrayList<Integer>();
		findAllSubsets(arr,len,ls,sum);
		
	}
	
	
	static void findAllSubsets(int arr[], int n, List<Integer> v,  
            int sum) {
		
		if (sum == 0) {  
	        for (int i=0;i<v.size();i++)  
	            System.out.print( v.get(i) + " ");  
	        System.out.println(); 
	        return;  
	    }  
	  
	    // If no remaining elements,  
	    if (n == 0)  
	        return;  
	  
	    // We consider two cases for every element.  
	    // a) We do not include last element.  
	    // b) We include last element in current subset.  
	    findAllSubsets(arr, n - 1, v, sum);  
	    List<Integer> v1=new ArrayList<Integer>(v); 
	    v1.add(arr[n - 1]);  
	    findAllSubsets(arr, n - 1, v1, sum - arr[n - 1]);  
	}

}
