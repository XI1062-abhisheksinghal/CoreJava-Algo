package com.mckc.array.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueLongestString {
	
	public static void main(String args[]) {
		
		String s = "abcasdedcapsdedaasddesspq";
		String s1 = "";
		Set<Character> set = new HashSet<Character>();
		
		char[] ch = s.toCharArray();
		
		for( Character c : ch) {
			boolean flag =set.add(c);
			if(flag) {
				s1= s1.concat(String.valueOf(c));
			}
		}
		
		System.out.println(s1);
		
	}

}
