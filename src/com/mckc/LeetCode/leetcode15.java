package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode15 {
	
	public static void main(String args[]) {
		
		//finding the list of 3 pair whose sum is zero from array 
		int [] n = {-1,0,1,2,-2,4}; 
		System.out.println(findTriplets(n));
		
		
	}
	
	
	public static List<List<Integer>> findTriplets ( int[] nums){
		
		if(nums.length==0) {
			return new ArrayList();
		}
		Arrays.parallelSort(nums);
		Set<List<Integer>> res  = new HashSet<>();
		
		for(int i=0;i<nums.length-2;i++) {
			 int j =i+1;
	           int  k = nums.length-1;
	            while(j<k){
	                int sum = nums[i]+nums[j]+nums[k];
	                if(sum==0)
	                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
	                else if ( sum >0) k--;
	                else if (sum<0) j++;
	            }

	        }
	        return new ArrayList<>(res);
	}

}
