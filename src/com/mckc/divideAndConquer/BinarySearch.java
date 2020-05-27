package com.mckc.divideAndConquer;

public class BinarySearch {
	
	//Search an element in the array by using algorithm of divide and conquer 
	
	public static void main(String args[]) {
		
		int[] arr = {2,3,5,7,9};
		
		 int searchElement = 5;
		 int midIndex=0;
		 int startIndex=0;
		 int endIndex=0;
		 
		 if(arr.length%2==0) {
			 midIndex= arr.length/2+1;
			 
		 }else {
			 midIndex= arr.length/2;
		 }
		 
		 if(searchElement==arr[midIndex]) {
			 System.out.println("Element found at index" + midIndex);
		 }
		 if(searchElement>arr[midIndex]) {
			 startIndex= midIndex +1;
			 endIndex= arr.length-1;
			 
			 while(startIndex<=endIndex) {
				 if(searchElement==arr[startIndex]) {
					 System.out.println("Element found at location" + startIndex);
					 break;
				 }
				 startIndex++;
			 }
		 }
		 
		 else if(searchElement<arr[midIndex]) {
			 startIndex= 0;
			 endIndex= midIndex-1;
			 while(endIndex>=startIndex) {
				 if(searchElement==arr[endIndex]) {
					 System.out.println("Element found at location" + startIndex);
					 break;
				 }
				 endIndex--;
			 }
			 
			 
		 }
		}

}
