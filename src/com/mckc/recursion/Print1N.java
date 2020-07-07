package com.mckc.recursion;


//Beauty of recursion , print 1 to N and N to 1 using recursion stack 
//This approach is called as IBH ( Induction , Base condition , Hypothesis ) 


public class Print1N {
	
	public static void main(String args[]) {
		
		int n =5;
		print(n);
		
		String s = "abc";
		
		System.out.println(fact(5));
		
		//Sort an array using recursion 
		int[] arr = {1,34,22,11,99,87,100};
		
		//output 1,11,22,34,87,99,100 using recursion 
		
	}
	//Hypothesis that what my function will do 
	static void print(int n) {
		
		if(n==1) {                    //Base condition 
			System.out.println(n);
			return;
		}
		
		print(n-1);
		System.out.println(n);   //Induction code 
		
		
	}
	
	static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int res = n * fact(n-1);
		return res;
	}
	
	static int[] sort(int[] arr, int size) {
		
		int[] result = new int[arr.length];
		
		if(size==1) {
			result[0]= arr[0];
			return arr;
			
		}
		
		sort(arr,size-1);
		for(int i=0;i<arr.length;i++) {
			
		}
		
		return result;
		
	}

}
