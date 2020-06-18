package com.mckc.dynamicprogramming;

public class EqualSumpartitionProblem {
	
	//Return true if the elements of array can be divided into two subset of equal sum
	
	// if the sum of array is even than the subsets can be divided so find the half of sum and find elements in array if is it possible or not 
	
	public static void main(String args[]) {
		
		int arr[]= {1,5,10,5};
		
		int n = 4;
		
		System.out.println(recursionApproach(arr));
		
		
	}
	
	public static boolean recursionApproach(int arr[]) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			
			 sum = sum+arr[i];
			 
		}
		if(sum%2!=0) {
			return false;
		}
		else if( sum%2==0) {
			
			int halfsum= sum/2;
			//Now the problem is reduced to check if there exist subset whose sum is halfsum so 
			return recursionCallforSubSet(arr,0,halfsum);
			
		}
		return false;
		
	}
	
public static boolean recursionCallforSubSet(int[] arr, int startIndex, int sum) {
		
		
		if (sum == 0)
            return true;
        if (arr.length - startIndex == 1)
             if(arr[startIndex] == sum)
                 return true;
             else
                 return false;
         
         boolean result_1 = recursionCallforSubSet(arr, startIndex + 1, sum - arr[startIndex]);
         
         boolean result_2 = recursionCallforSubSet(arr, startIndex + 1, sum);
         
         return result_1 || result_2;      
	}
	
	
	
	

}
