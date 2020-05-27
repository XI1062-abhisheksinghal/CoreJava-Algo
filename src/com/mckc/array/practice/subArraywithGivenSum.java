package com.mckc.array.practice;

public class subArraywithGivenSum {
	
	public static void main(String args[]) {
		
        int arr[] = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};	
        int sum = 15;
        subArraySu(arr,sum);
       

}
	
	//DO without use of 2 loops , reduce complexity from n square to logn or use only single loop 
	
	
	public static void subArrayoptimised(int arr[],int sum) {
		
		for(int i=0;i<arr.length;i++) {
			
			int subSum = arr[i];
			int j =i+1;
			
			
			
		}
		
	}
	
	//Print all the subArray patterns with given sum 
	
	
	
	
	 public static void subArraySu(int[] arr,int sum) {
     	
     	int start=0, end=0;
         boolean found = false;
         int prev;
         
         //finding the index for the subarray starting and end position 
         
         for(int i=0;i<arr.length;i++) {
         	prev = arr[i];
         	
         	if(arr[i]==sum) {
         		start= i+1;
         		end= i+1;
         		found = true;
         		break;
         	}
         	for(int j=i+1;j<arr.length;j++) {
         		 
         		 prev = prev+arr[j];
         		if(prev==sum) {
         			start = i+1;
         			end= j+1;
         			found = true;
         			break;
         		}
         	}
         	prev=0;
         }
         if(found) {
         System.out.println(start +" "+ end);
         }
         else {
         	System.out.println(-1);
         }
         
 	}
}
     
     
