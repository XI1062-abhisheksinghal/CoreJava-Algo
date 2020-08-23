package com.mckc.array.practice;

import java.util.ArrayList;
import java.util.List;

public class RainWaterHarvesting {

	// Problem is to print the product of all the subsets of array
	// First print all the subsets of array
	public static void main(String args[]) {

		int bars[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
		printAllSubArrays(bars, bars.length);

	}

	public static void printAllSubArrays(int[] bars, int len) {

		List<Integer> ls = new ArrayList<Integer>();
		allSubArraysRecursion(bars, bars.length, ls, 0);

	}

	public static void allSubArraysRecursion(int[] bars, int len, List<Integer> ls, int i) {
          
		if(i==len) {
			i++;
			for(int j=0;j<ls.size();j++) {
				System.out.print(ls.get(i)+"");
			}
			System.out.println();
		}
		
		allSubArraysRecursion(bars, ls.size(), ls, i+1);
	}

}
