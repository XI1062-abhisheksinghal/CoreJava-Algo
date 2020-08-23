package com.mckc.array.practice;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class IHSExample {
	
	public static void main(String args[]) {
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		
		SortedSet<Integer> ss = new TreeSet<Integer>();
		
		ss.add(12);
		ss.add(34);
		ss.add(100);
		ss.add(1);
		
		for(Integer j:ss) {
			System.out.println(j);
		}
		
		lset.add(23);
		lset.add(34);
		lset.add(12);
		lset.add(100);
		lset.add(100);
		
		System.out.println(lset.size());
		for(Integer i :lset) {
			System.out.println(i);
		}
	}

}
