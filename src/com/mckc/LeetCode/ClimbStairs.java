package com.mckc.LeetCode;

public class ClimbStairs {
	
	public static void main(String args[]) {
	
	int result =0;
    int n=4;
    System.out.println(findStep(n)); 
    
	}
    public static int findStep(int n) 
    { 
        if (n == 1 || n == 0) 
            return 1; 
        else if (n == 2) 
            return 2; 
  
        else
            return findStep(n - 3) + findStep(n - 2) + findStep(n - 1); 
    } 
  
    
    

}
