package com.mckc.LeetCode;

public class LeetCode5 {
	
	
	public static void main(String args[]) {
		
		System.out.println(longestPalindrome("babad"));
	}
	
	
public static String longestPalindrome(String s) {
        
        int maxlen =0;
        int len=0;
        int end =s.length();
        String result="";
        if(s.length()==0 || s.length()==1){
            return s;
        }
        if(s==null){
            return null;
        }
        //char[] chars = s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String pall = pallindrome(s.substring(i,j));
                if(pall!=null){
                    len=pall.length();
                    result = pall;
                    if(len>maxlen){
                    maxlen =len;
                        result = pall; 
                    }
                }
            }
        }
        
    
        
        return result;
        
        
        
    }
    
    
    @SuppressWarnings("unlikely-arg-type")
	public static String pallindrome(String s){
        
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse())){
            return s;
        }
        
        return null;
        
    }

}
