package com.mckc.array.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTriplets {
	
	public static void main(String args[]) {
		
		//Counting the triplets 
		//sum of two numbers is equal to 3rd number .
		
		Integer[] arr = {1,5,3,2,-6};
		//Can be done by two pointer algorithm .
		//Arrays.sort(arr);
		Arrays.asList(arr).forEach(i->{System.out.println(i);});
		
		
		// final int count=0;;
		//List<Integer> convertedList = Arrays.asList(arr);
		List<Integer> ls = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			 int pairSum= arr[i]+ arr[j];
			 ls.add(pairSum);	 
		}
		
	}
		
		int count =0;
		ls.forEach(i->{
			
			});
			
		
		

}
}