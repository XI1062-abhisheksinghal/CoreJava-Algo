package com.mckc.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trikcy {
	
	public static void main(String args[]) {
		
		
		List<Integer> ls = new ArrayList();
		
		ls.add(3);
		ls.add(4);
		ls.add(1);
		ls.add(6);
		
		Collections.sort(ls);
		for(Integer i :ls) {
			System.out.println(i);
		}
		
		//Passed the comparator to sort list of Integers in reverse order
		Collections.sort(ls, (a,b)->b-a);
		for(Integer i:ls) {
			System.out.println(i);
		}
		
		
		
		
	}

}
