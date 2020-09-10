package com.mckc.LeetCode;

public class Max2Digit {
	
	public static void main(String args[]) {
		
		//Max 2 digit number less than 24 from the array of four elements 
		
		int[] arr = {1,2,3,4};
		//here max digit is 23 
		int max[] = new int[2];
		 max[0]=arr[0];
		 max[1]= arr[1];
		 
		 Integer maximum =0;
		 String s = maximum.toString();
		 s= String.valueOf(arr[0]);
		 s=s.concat(String.valueOf(arr[1]));
		 
		 maximum= Integer.valueOf(s);
		 System.out.println(maximum);
		 
		 //System.out.println(s.concat(String.valueOf(2)));
		 System.out.println(s);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				Integer num1 = arr[i];
				Integer num2 = arr[j];
				
				
			}
		}
	}

}
