package com.mckc.dynamicprogramming;

//This has to be solved by recursion first , than apply memoization + recursion i.e. Dynamic Programming 
public class KnapSackProblem {

	public static void main(String args[]) {

		int wt[] = { 1, 3, 5, 7, 9 };
		int val[] = { 10, 30, 50, 70, 90 };
		int n = 5;

		int maxWt = 10;

		System.out.println(knapSack(wt, val, maxWt, n));
		
		System.out.println(knapSackByDPmatrix(wt,val,maxWt,n));
	}

	// Solve recursively :- Create a Choice Diagram
	// 2steps :- 1. Find the base condition .( Think of the valid smallest input)
	// 2. Code Choice Diagram --- Solve for nth element and do for n-1 elements.

	static int knapSack(int[] wt, int[] val, int maxWt, int n) {
		int[][] dp = new int[n + 1][maxWt + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < maxWt + 1; j++) {

				dp[i][j] = -1;
			}
		}
		
		//base condition( think of valid smallest input and return the expected output 
		if (n == 0 || wt.length == 0) {
			return 0;
		}

		if ((dp[n][maxWt]) != -1) {
			return dp[n][maxWt];
		}

		if (wt[n - 1] <= maxWt) {
			return dp[n][maxWt] = Math.max((val[n - 1] + knapSack(wt, val, maxWt - wt[n - 1], n - 1)),
					knapSack(wt, val, maxWt, n - 1));
		}

		else if (wt[n - 1] > maxWt) {
			return dp[n][maxWt] = knapSack(wt, val, maxWt, n - 1);
		}
		return 0;

		// To solve it for DP you have to create the DP Matrix with paramters that
		// change eg in this case n , max wt
	}
	
	
	//Solved by using the Dynamic Programming by Matrix Method
	// jUst replaced n-->i and maxWt--->j
	static int knapSackByDPmatrix(int[] wt, int[] val, int maxWt, int n) {
		
		int[][] dp = new int[n + 1][maxWt + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < maxWt + 1; j++) {

				if(i==0 || j==0) {
					dp[i][j]=0;
				}
			}
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<maxWt+1;j++) {
				if(wt[i-1]<=j) {
					dp[i][j]= Math.max((val[i-1]+dp[i-1][j-wt[i-1]]), dp[i-1][j]);
				}
				
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		
		return dp[n][maxWt];
		
		
	}
	}
	


