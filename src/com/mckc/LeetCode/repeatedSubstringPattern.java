package com.mckc.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class repeatedSubstringPattern {
	
	public static void main(String args[]) {
		
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	}
	




public static boolean repeatedSubstringPattern(String s) {
    
	
	boolean result = false;
    if(s.length()%2!=0){
        return false;
    }
    
    Set<Character> set = new HashSet<Character>();
    char[] chars= s.toCharArray();
    
    for(int i=0;i<chars.length;i++){
        
        if(!set.add(chars[i])){
            break;
        }
    }
    
    
    StringBuilder sb = new StringBuilder(); 
    for (Character ch : set) { 
        sb.append(ch); 
    } 

    // convert in string 
    String pattern = sb.toString(); 
    String newString = "";
    while(newString.length()<=s.length()) {
    	
    	newString = newString.concat(pattern);
    	if(newString.equals(s)) {
    		result = true;
    		break;
    	}
    }
    
    return result;
    
    
}   
    
}
