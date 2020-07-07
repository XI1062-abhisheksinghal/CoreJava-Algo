package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TriangleProblem {
	
	public static void main(String args[]) {
		
		List<List<Integer>> input = new ArrayList<>();
		List<Integer> row1 = new ArrayList<>();
		List<Integer> row2 = new ArrayList<>();
		List<Integer> row3 = new ArrayList<>();
		List<Integer> row4 = new ArrayList<>();
		
		row1.add(2);
		
		row2.add(3);
		row2.add(4);
		
		row3.add(6);
		row3.add(5);
		row3.add(7);
		
		row4.add(4);
		row4.add(1);
		row4.add(8);
		row4.add(3);
		
		input.add(row1);
		input.add(row2);
		input.add(row3);
		input.add(row4);
		
		
		
		System.out.println(findsumMin(input));
		
		List<Integer> negativeNumbers = Arrays.asList(2,-3,-4);
		System.out.println(findMinfromList(negativeNumbers));
		
		
	}
	
	
	public static int findsumMin(List<List<Integer>> triangle) {
		int result =0;
		
		for(int i=0;i<triangle.size();i++) {
			
			int minNum=findMinfromList(triangle.get(i));
			 result = result+minNum;
			
		}
		return result;
		
		
	}
	
	public static int findMinfromList(List<Integer> numbers) {
		
		return numbers.stream().min(Comparator.naturalOrder()).get();
	}

}
