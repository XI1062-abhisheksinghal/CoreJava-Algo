package com.mckc.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Leetcode1578 {

	 public static void main(String[] args) {
		 
		 String s = "aaabbbabbbb "; 
		 int[] cost= {3,5,10,7,5,3,5,5,4,8,1};
		System.out.println(minCost(s,cost));
	}




public static int minCost(String s, int[] cost) {
    
    int firstptr;
    int secondptr;
    int result=0;
    
    
    List<Integer> list = Arrays.stream(cost).boxed().collect(Collectors.toList());
    
    for(int i=0;i<s.length()-1;i++){
        firstptr=i;
        secondptr=i+1;
        
        
        
        if(s.charAt(firstptr)==s.charAt(secondptr)){
            if(list.get(firstptr)<list.get(secondptr)){
                result = result+cost[firstptr];
                list.remove(firstptr);
            }else{
                result = result+cost[secondptr];
                list.remove(secondptr);
            }
        }
        
        
        
    }
    
    return result;
}

}
