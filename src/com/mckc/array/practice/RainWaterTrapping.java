package com.mckc.array.practice;

public class RainWaterTrapping {
	
	public static void main(String args[]) {
		
		int[] n =  {3,0,0,2,0,4};
		int compare = 0;
		if(n[0]>n[n.length]) {
			compare =n[0]-n[n.length];
		}
		else if(n[0]<n[n.length]) {
			compare = n[n.length]-n[0];
		}
		
		
		//Calculate the amount of water that can be trapped 
		for(int i=1;i<n.length-1;i++) {
			
			
			
		}
		
		
		
	}
}
