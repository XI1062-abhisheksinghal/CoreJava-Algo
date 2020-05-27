package com.mckc.LeetCode;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MinNumberOfchars {
	
	
	public static void main(String args[]) {
	 Map<Character, Integer> map = new TreeMap<Character, Integer>();
     String s = "aabccc";
     
     char[] ch = s.toCharArray();
     
     for(char c:ch){
         if(map.containsKey(c)){
             map.put(c,map.get(c)+1);
         }else{
             map.put(c,1);
         }
         
     }
     
     //map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+""+x.getValue()));
     sortByValues(map);
     
     
	}
	
	public static void sortByValues(Map<Character, Integer> m) {
		
		List<Map.Entry<Character, Integer>> ls =m.entrySet().stream().sorted((Map.Entry.<Character, Integer>comparingByValue()))
		.collect(Collectors.toList());
		
		for(Map.Entry<Character, Integer> entity: ls) {
			int count = entity.getValue();
			while(count!=0) {
			System.out.print(entity.getKey());
			count--;
			}
			
		}
		
	}
	
}
