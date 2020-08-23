package com.mckc.LeetCode;

import java.util.HashMap;

public class Problem1 {
	
	public static void main(String args[]) {
	   int[] nums = {1,1,1};
//	   int[] result = twoSum(nums,6);
//	   
//	   for(int i:result) {
//		   System.out.println(i);
//	   }
	   
	   System.out.println(subarraySum(nums,2));
	
	}
		  public static int[] twoSum(int[] nums, int target) {
		        
		        int[] result=new int[2];
		        boolean found = false;
		        for(int i=0;i<nums.length;i++){
		            for(int j=1;j<nums.length;j++){
		                if(nums[i]+nums[j]==target)
		                {
		                    result[0]=i;
		                    result[1]=j;
		                    found = true;
		                }
		                break;
		            }
		            if(found)
		            	break;
		        }
		        
		        return result;
		        
		    }
		  
		  
		  public static int subarraySum(int[] nums, int k) {
		        
			     int count = 0;
			        for (int start = 0; start < nums.length; start++) {
			            int sum=0;
			            for (int end = start; end < nums.length; end++) {
			                sum+=nums[end];
			                if (sum == k)
			                    count++;
			            }
			        }
			        return count;
			    }		        
		    }
	


