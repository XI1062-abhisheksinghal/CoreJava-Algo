package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ransomnote {
	
	public static void main(String args[]) {
		
		
		String ransome= "aa";
		String magazine = "ab";
		
		//Find all the substrings of magazine using recursion 
		System.out.println(containsRansome(ransome, magazine));
		
	}
	
	public static boolean containsRansome(String ransome, String magazine) {
		
		
		List<String> allwords = findAllStrings(magazine,0, "");
		
		return allwords.contains(ransome);
	}
	
	public static List<String> findAllStrings(String magazine,int index, String curr){
		
		List<String> result = new ArrayList();

			int n = magazine.length();
			if (index == n) {

				result.add(curr);
				
			}

			findAllStrings(magazine, index + 1, curr + magazine.charAt(index));
			findAllStrings(magazine, index + 1, curr);
			return result;
			
		

	}

}
