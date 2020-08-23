package com.mck.Java8Practice;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapsWithSameKey {
	
	public static void main(String args[]) {
		
		Map<String,Integer> map1 =  new HashMap();
		Map<String, Integer> map2 = new HashMap();
		
		map1.put("maths", 45);
		map1.put("physics",57);
		map1.put("chemistry",52);
		map1.put("history", 41);
		
		map2.put("economics", 49);
		map2.put("maths", 42);
		map2.put("biology", 41);
		map2.put("history", 55);
		
		
		
	}

}
