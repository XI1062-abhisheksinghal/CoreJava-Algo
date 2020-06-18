package com.mckc.dynamicprogramming;

public class SubSetProblemusingDP {
	
	public static void main(String args[]) {
		
		int[] arr= {1,3,7,8,10};
		int sum = 2;
		
		//System.out.println(subsetyesorno(arr,sum));
		
		System.out.println(SubsetSumByRecusrions(arr,sum));
		
	}
	
	
	
	public static
	boolean subsetyesorno(int[] arr, int sum) {
        boolean dp[][] = new boolean[arr.length+1][sum+1];
		
		//problem is to find if the subset exists whose sun is equal to 11.
		
		// Write a recusrive approach 
		
		//Write a Top Down Dynamic Programming approach 
		
		//if comparing it with knapsack probkem 
		//arr is wt array , maxWt is sum
		
		// Main trick is to do initialization 
		for(int i=0;i<arr.length+1;i++) {
			for(int j=0;j<sum+2;j++) {
				if(arr[i]==0) {
					dp[i][j]= true;
				}
				if(arr[j]==0) {
					dp[i][j]= false;
				}
			}
		}
		
		for(int i=1;i<arr.length+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]= dp[i][j-arr[i-1]]|| dp[i-1][j];
				}
				
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		
		return dp[arr.length][sum];
		
		
		
	}
	
	public static boolean SubsetSumByRecusrions(int[] arr, int sum) {
		
		if(arr.length<1) {
			return false;
			
		}
		
		if(arr.length==1) {
			if(arr[0]==sum) {
				return true;
			}
			else {
				return false;
			}
			
			
		}
		
		return recursionCallforSubSet(arr,0,sum);
		
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
