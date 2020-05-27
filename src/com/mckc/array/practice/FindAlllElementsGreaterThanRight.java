package com.mckc.array.practice;

import java.util.Stack;

public class FindAlllElementsGreaterThanRight {
	
	public static void main(String args[]) {
		
		
		//Finding all the elements which are greater than all elements to its right 
		//REsponse would be 23 as all the elements to its right are smaller than it 
		//If do by using stack , push in to stack  if stack.peep is smaller than pop else push and print elements which are in stack
		int[] arr= {3,4,5,23,22,12,18};
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && st.peek()<arr[i]) {
				
				st.pop();
			}
			
			st.push(arr[i]);
			
		}
		
		System.out.println(st);
		
		
		
		
		
	}

}
