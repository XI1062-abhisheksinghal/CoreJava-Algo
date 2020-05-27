package com.mckc.recursion;

public class RodCuttingProblem {
	
	public static void main(String args[]) {
		
		int n =10;
		//just a simple program to understand the recursion using stack
		//print(n);
		
		//Rod Cut problem 
		int[] lenght = {1,2,3,4,5,6,7,8};
		int[] prices = {1,5,8,9,10,17,17,20};
		int lengthOfRod= 4;
		int peices = 2;
		
		int result =findMaxPrice(prices,lengthOfRod);
		System.out.println(result);
	}
	
	static void print(int n) {
		
		if(n==0) {
			return ;
		}else {
			print(n-1);
			System.out.println(n);
		}
	}
	
	static int findMaxPrice(int[] prices, int n) {
		
		if (n==0) {
			return 0;
		}
		
		int maxValue = Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			
		int cost = prices[i-1] + findMaxPrice(prices, n-i);
		if(cost>maxValue) {
			maxValue=cost;
		}
		}
		return maxValue;
		
	}

}
