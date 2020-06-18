package com.mckc.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	public static void main(String args[]) {
		
		String pattern = "abba";
		String word = "dog dog dog dog";
		System.out.println(checkPatterinString(pattern, word));
		
	}
	
	
	
	public static boolean checkPatterinString(String pattern, String word) {
       Map<Character, String> map = new HashMap<Character, String>();
		
		char[] key = pattern.toCharArray();
		String[] values = word.split(" ");
		
		if(key.length!=values.length) {
			return false;
		}
		for(int i=0;i<key.length;i++) {
		     if(map.containsKey(key[i])) {
		    	 String value = map.get(key[i]);
		    	 if(!value.equals(values[i])) {
		    		 return false;
		    	 }
		    	 
		     }
		     else {
		    	 if(map.containsValue(values[i])) {
		    		 return false;
		    	 }
		    	 map.put(key[i], values[i]);
		     }
		}
		return true;
		
		
	}

}
