package com.mckc.LeetCode;

public class Problem62 {
	
	public static void main(String args[]) {
		
		
		System.out.println(uniquePaths(2,2));
	}
	
	
	
	public static int uniquePaths(int m, int n) {
        
        if(m==1 || n==1){
            return 1;
        }
        
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

}
