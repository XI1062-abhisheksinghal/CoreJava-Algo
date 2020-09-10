package com.mckc.LeetCode;

public class LongestPallindromicSeq {
	
	public static void main(String args[]) {
		
		
		String[] arr= new String[]{"flower","flow","flight"};
		System.out.println(commonSeq(arr));
		
		String a = "flower";
		String b="f";
		
		System.out.println(b.indexOf(a));
		
		
		
	}
	
	public static String commonSeq(String[] strs) {
		
		if(strs == null || strs.length == 0)    return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	    	while(strs[i].indexOf(pre) != 0)
	            pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    return pre;
	}

}
