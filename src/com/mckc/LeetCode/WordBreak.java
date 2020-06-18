package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	
	
	
	public static void main(String args[]) {
		
		String s = "applepenapple";
		//String s1 = "Helo";
		boolean result=false;
		List<String> ls = new ArrayList<>();
		ls.add("abhishek");
		ls.add("pen");
		
		for(int j=0;j<ls.size();j++) {
			if(j==0) {
			result=findIfStringisSub(s, ls.get(0),0);
			}
			else {
				result=findIfStringisSub(s, ls.get(0),ls.get(j-1).length()-1);
			}
			if(result==false) {
				System.out.println(result);
				break;
			}
			
		}
		System.out.println(result);
	
		
		
	}
	
	public static boolean findIfStringisSub(String s, String s1, int index) {
		
		char[] schars = s.toCharArray();
		char[] s1char= s1.toCharArray();
		
		for(index=0;index<schars.length;index++) {
		   if(index<s1char.length)
			if(schars[index]==s1char[index]) {
				if(index==s1.length()-1) {
					return true;
				}
			}
		}
		
		return false;
		
		
		
	}
	

}
