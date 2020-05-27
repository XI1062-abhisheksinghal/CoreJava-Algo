package com.mckc.array.practice;

import java.util.HashMap;
import java.util.Map;

public class KnapsackProblem {
	
	public static void main(String args[]) {
	
	int[] value = {20,5,10,40,15,25};
	int[] weight= {1,2,3,8,7,4};
	//condition to get the nos combination whose summation is less than 10.
	//like {1,2,3} {1,8} {1,7} {2,3,4}
	
	
	int w = 10;
	//Logic that the weight should be less than 10 and value should be max, weight corresponds to value in index in array
	//Create a map 
	//Parse the int array and convert into Integer 
	
	Map<Integer, Integer> m = new HashMap<Integer,Integer>();
	for(int i=0;i<value.length;i++) {
		
		m.put(Integer.valueOf(value[i]), weight[i]);
	}
	
	
     m.entrySet().forEach((j)->System.out.println(j.getKey()+ " "+ j.getValue()));	
     
     
     
	}
	
	public int knapsackSol(int[] n, int[] v, int W, int noofelement) {
		
		return 0;
		
		
	}
	
	
     
     
}
