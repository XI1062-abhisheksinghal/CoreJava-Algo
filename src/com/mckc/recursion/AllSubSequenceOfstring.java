package com.mckc.recursion;

public class AllSubSequenceOfstring {
	
	public static void main(String args[]) {
		
		String s = "abcdefghi";
		//Output would be a, b, c , ab, bc , ac, abc
		
		permute(s, " ");
		String s1 = "abcdefgh";
		System.out.println("==="+s1.substring(0,0));
		
		
	}
	
	public static void permute(String unfixed, String fixed) {
		
		if(unfixed.length()==0) {
			System.out.println(fixed);
			return;
		}
		
		
		for(int i=0;i<unfixed.length();i++) {
			
			// ith character of str 
	        char ch = unfixed.charAt(i); 
			 String rest = unfixed.substring(0, i) +  
                     unfixed.substring(i + 1); 

        // Recurvise call 
        permute(rest, fixed + ch); 
		}
		
	}

}
