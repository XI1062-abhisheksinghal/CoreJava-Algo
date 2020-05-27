package com.mckc.GreedyAlgorithmProblems;

public class RecursionDemo {
	
	public static void main(String args[])
	{
		//Factorial is 5*4*3*2*!
		System.out.println(demo(2));
		
		//Fibonacci Series 
		//0 1 1 2 3 5
		System.out.println(fib(5));
		
	}
	
	public static int demo(int n) {
		if(n==0) {
           return 1;
		}
		int result = n *demo(n-1);
		
		return result;
		//Factorial of a number using reci=ursion 
		
	}
	
	public static int fib(int n) {
		
		if(n<1) {
			return 0;
		}
		
		else if(n==1 || n==2) {
			return n-1;
		}
		
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	

}
