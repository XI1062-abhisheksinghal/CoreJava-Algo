package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem3 {

	public static void main(String args[]) {

		String s = " ";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		
		if(s.trim().isEmpty()) {
			return 1;
		}
		 if(s.trim().length()==0){
            return 0;
        }

		List<Character> ls = new ArrayList<Character>();
		int count = 0;
		List<Integer> result = new ArrayList<Integer>();
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			ls.clear();
			count = 0;
			for (int j = i; j < charArray.length; j++) {

				if (!ls.contains(charArray[j])) {
					ls.add(charArray[j]);
					count++;

				} else if (ls.contains(charArray[j])) {
					result.add(count);
					break;
				}
			}

		}

		return result.stream().max(Comparator.comparing(Integer::valueOf)).get();

	}

}
