package com.mckc.LeetCode;

public class IHS {
	
	
	static int solve(int N, int M){
	       // Write your code here

	       if(M%N>N/2){
	           return -1;
	       }
	       int cost =0;
	       int sum=0;
	       int div=0;
	       while(N<M){

	           div = finddivisor(N);
	           if(div==0) {
	        	   return -1;
	           }
	           sum = N+div;
	            cost = cost +N/div;
	           N=sum;

	       }

	       return cost;
	    }

	    public static int finddivisor(int N){

	           int result =0;
	         for(int i=2;i<=N/2;i++){
	              if(N%i==0){
	                  if(i%2==0){
	                  result = i;
	                  }
	              }

	         }
	         return result;
	    }
	    
  public static void main(String args[]) {
	  
	  System.out.println(solve(2, 11));
  }
}
