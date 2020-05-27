package com.mckc.divideAndConquer;

public class NoOfRotationsInCircularArray {
	
	public static void main(String args[]) {
		
		//Program to rotate an array 
		
		int[] arr= {1,2,3,4,5,6,7};
		
		String x = "Societe Anonyme De La Manufacture D'horlogerie Audemars Piguet & Cie";
		
		int leftrotate =2;
		//Output would be 3,4,5,6,7,1,2
		int rightrotate =2;
		//output would be 6,7,1,2,3,4,5
		
		int[] temp ;
		
		for(int i=0;i<leftrotate;i++) {
			
			rotateByOne(arr);
			printArray(arr);
		}
		
		
		
		
	}
	
	static void printArray(int[] print) {
		for(int i:print) {
			System.out.print(i);
		}
	}
	
	static void rotateByOne(int[] arr) {
		
		int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < arr.length - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
		 
	}
	
	

}
