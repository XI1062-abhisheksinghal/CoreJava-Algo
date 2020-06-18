package com.mckc.recursion;

public class RobHouseorNotRob {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4};
		System.out.println(recursiveSol(arr,arr.length-1));
		
	}
	
	static int recursiveSol(int[] arr,int i) {
		if(i<0) {
			return 0;
		}
		
		return Math.max((arr[i]+recursiveSol(arr, i-2)),recursiveSol(arr, i-1));
	}

}
