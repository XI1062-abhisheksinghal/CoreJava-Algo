package com.mckc.recursion;

public class Factorial {
	
	public static void main(String args[]) {
		
		int n = 50;
		
		//factorial of a no using recursion 
		
		int result = fact(n);
		//System.out.println(result);
		
		int fibresult = fib(6);
		System.out.println(fibresult);
		
		printfib(5);
		
		//print fibonacci series 
		
	}
	
	static public int fact(int n) {
		if (n==0) {
			return 1;
		}
		return n* fact(n-1);
	}
	
	static public int fib (int n) {
		
		if(n==1 || n==2) {
			return 1;
		}else {
			return (fib(n-1)+fib(n-2));
		}
			
	}
	
	static public void printfib(int n) {
		
		if(n>1) {
			int f1 = 0;
			int f2 = 1;
		   for(int i=0;i<n;i++) {
			   int print = f1+f2;
			   
			   System.out.print(f2+ " ");
			   
			   f1= f2;
			   f2= print;
			   
			   
		   }
		
		}
		else {
			System.out.println(" series length cannot be less than zero ");
		}
		
	}
	
	

}
