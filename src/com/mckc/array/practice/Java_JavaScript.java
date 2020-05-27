package com.mckc.array.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_JavaScript {
	
	public static void main(String args[]) {
		
		Map<String, Integer> fruits = new HashMap();
		
		fruits.put("orange", 2);
		fruits.put("apple", 1);
		fruits.put("pineapple", 2);
		
		//Write code in Java to remove element whose fruit value is 1
		
		Map<String, Integer> result =
				fruits.entrySet().stream().filter(m->!(m.getValue()<=1))
		 .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		
		
		
		System.out.println(result);
		//Write code in javaScript for to remove fruit whose value is 1
		
		
	}

}
