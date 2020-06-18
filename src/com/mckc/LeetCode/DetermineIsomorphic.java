package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class DetermineIsomorphic {
	
	public static void main(String args[]) {
		
		String s = "ab";
		String t = "aa";
		//Output No two string are isomorphic
		System.out.println(isIsomorphic(s, t));
	}
	
	
	public static boolean isIsomorphic(String s , String t) {
        Map<Character, Character> map = new HashMap<>();
		
		char[] keys = s.toCharArray();
		char[] values = t.toCharArray();
		
		if(keys.length!=values.length) {
			return false;
		}
		
		for(int i=0;i<keys.length;i++) {
		
			if(map.containsKey(keys[i])) {
				Character v =map.get(keys[i]);
				
					if(values[i]!=v) {
						return false;
					}
				
			}else {
				if(map.containsValue(values[i])) {
					return false;
				}
				map.put(keys[i], values[i]);
			}
		
		}
		return true;
	}
	
}
