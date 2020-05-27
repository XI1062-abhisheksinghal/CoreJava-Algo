package com.mckc.array.practice;

public class FindDuplicateWithRange {
	
    public static void main(String args[]) {
    	
    	
    	//Findingh the Duplicates with the range given 
    	int arr[] = {1,2,3,2,1};
    	
    	int range = 7;
    	int result =0;
    	for(int i=0;i<arr.length;i++) {
    		if(i+range<arr.length) {
    		if(arr[i]==arr[i+range]) {
    			result = arr[i];
    		}
    		}
    	}
    	
    	System.out.println(result);
    	
    	
    }	

}
