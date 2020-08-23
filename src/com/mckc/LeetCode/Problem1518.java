package com.mckc.LeetCode;

public class Problem1518 {
	
	public static void main(String args[]) {
		
		 int numBottles=19;
		 int numExchange=4;
	     System.out.println(numWaterBottles(numBottles, numExchange));
	}
	
	 public static int numWaterBottles(int numBottles, int numExchange) {
	        
		 
		 //edge condition 
		 if(numBottles<numExchange) {
			 return numBottles;
		 }
	      int result =0;
	        result = numBottles;
	         
	        
	        int quo = numBottles/numExchange;
	        int rem = numBottles%numExchange;
	        result = result+quo;
	        
	        while((rem!=0 && quo!=0 ) || (rem==0 && quo!=0)){
	        	int bottleLeft = quo+rem;
	            
	            quo = bottleLeft/numExchange;
	            rem= bottleLeft%numExchange;
	            result = result+quo;
	        }
	        
	        return result;
	        
	    }
}
