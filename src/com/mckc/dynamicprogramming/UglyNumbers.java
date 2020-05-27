package com.mckc.dynamicprogramming;

public class UglyNumbers {
	
	public static void main(String args[]) {
		
		//Ugly Numbers are number whose prime factors are 2,3 and 5.
		
		//Check if number is ugly or not 
		
		//Finding all the factors of a number's
		
		int n = 4;
		System.out.println(checkNo(n));
		
		int[] printfactorials = factors(n);
		
		for(int x :printfactorials) {
			if(x!=0) {
		
				System.out.println(x);
			}
		}
		
	}
	
	public static boolean checkNo ( int n) {
		
		if(n%2==0 || n%3==0 || n%5==0) {
			return true;
		}
		
		return false;
	}
    
	
	public static int[] factors(int n) {
		
		int[] results = new int[5];
		int j=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				
				results[j] = i;
				j++;
			}
		}
		return results;
	
	}
	
	//Input no then result the ugly number 
	//1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
	// m =7 , value is 8 
	
}
