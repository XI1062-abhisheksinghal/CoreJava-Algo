package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
	
	public static void main(String args[]) {
		
		int [] stockprice = {100, 80, 60, 70, 60, 75, 85};
		
		List<Integer> ls = new ArrayList<Integer>();
		
		for(int i=0;i<stockprice.length;i++) {
			int count =0;
			for(int j=i;j>=0;j--) {
				if(stockprice[i]<stockprice[j]) {
					break;
				}
				if(stockprice[i]>=stockprice[j]) {
					
					count++;
				}
			}
			ls.add(count);
		}
		
		for(int i:ls) {
			System.out.println(i);
		}
	}
	
	
	

}
