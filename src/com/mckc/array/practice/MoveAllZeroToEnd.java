package com.mckc.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeroToEnd {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,0,3,40,0,99,0,32,33,44,0};
		
		//Brute force approach to compare each element in array
		
		//Array Rotation 
		int k = 0;
		for(int i:arr) {
			
			if(i!=0) {
				arr[k++]=i;
			}
			
		}
		
		for(int i=k;i<arr.length;i++) {
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
