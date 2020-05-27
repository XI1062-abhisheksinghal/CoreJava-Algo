package com.mckc.example.graph;

import java.util.HashMap;
import java.util.Map;

public class DisJoint {
	
	private static Map<Integer,Integer> parent = new HashMap();
	
	private static void makeSet(int[] universe) {
		
		for (int i :universe) {
			parent.put(i,i);
		}
		
	}
	
	// Find the root of the set in which element k belongs
		private int Find(int k)
		{
			// if k is root
			if (parent.get(k) == k)
				return k;

			// recur for parent until we find root
			return Find(parent.get(k));
		}

		// Perform Union of two subsets
		private void Union(int a, int b)
		{
			// find root of the sets in which elements
			// x and y belongs
			int x = Find(a);
			int y = Find(b);

			parent.put(x, y);
		}

		public static void printSets(int[] universe, DisJoint ds)
		{
			for (int i : universe)
				System.out.print(ds.Find(i) + " ");

			System.out.println();
		}
	
	public static void main(String args[]) {
		
		// universe of items
				int[] universe = { 1, 2, 3, 4, 5 };

				// initialize DisjointSet class
				DisJoint ds = new DisJoint();

				// create singleton set for each element of universe
				ds.makeSet(universe);
				
				printSets(universe, ds);

				ds.Union(4, 3); // 4 and 3 are in same set
				printSets(universe, ds);

				ds.Union(2, 1); // 1 and 2 are in same set
				printSets(universe, ds);

				ds.Union(1, 3); // 1, 2, 3, 4 are in same set
				printSets(universe, ds);
		
	}

}
