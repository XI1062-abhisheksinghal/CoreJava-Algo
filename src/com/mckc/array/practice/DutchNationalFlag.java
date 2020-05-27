package com.mckc.array.practice;

import java.util.Arrays;

public class DutchNationalFlag {
	
	public static void main(String args[]) {
		
		//first taking the two inputs 
		int[] prob = {0,0,1,0,1,0,1,0};
		
		int i =0;
		int first = 0;
		int last = prob.length-1;
		
		while(first<last) {
			if(prob[first]>prob[last]) {
				prob[first]=0;
				prob[last]=1;
				first++;
				last--;
			}else if(prob[first]<prob[last]) {
				first++;
				last--;
			}
			else if(prob[first]==prob[last])
			{
				first++;
				last--;
			}
			
			
		}
		
		Arrays.asList(prob).forEach((j)->System.out.println(j));
		
	}

}
