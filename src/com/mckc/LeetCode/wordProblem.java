package com.mckc.LeetCode;

public class wordProblem {
	
	public static void main(String args[]) {
		
		
		System.out.println(wordPattern("abba","dog cat cat dog"));
	}
	
	
	public static boolean wordPattern(String pattern, String str) {
        
        char[] chars = new char[pattern.length()];
        String[] strings = new String[str.length()];
        
       
        chars = pattern.toCharArray();
        strings = str.split(" ");
        boolean result = true;
        
        if(chars.length!=strings.length){
            return false;
        }
        for(int i=0;i<pattern.length()-1;i++){
            
            int j = i+1;
                
                if(chars[i]==chars[j]){
                    if(!strings[i].equals(strings[j])){
                        
                        result= false;
                    }
                    
                }
                 if(chars[i]!=chars[j]){
                    if(strings[i].equals(strings[j])){
                        result= false;
                    }
                }
            
            
                
            
        }
        
        return result;
        
}

}
