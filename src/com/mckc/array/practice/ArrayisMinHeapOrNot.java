package com.mckc.array.practice;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ArrayisMinHeapOrNot {
	
	//Program to find the given array is Min Heap or not 
	
	public static void main(String args[]) {
		List<Integer> ints  = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 2;

		System.out.println("K'th largest element in the array is " +
				minHeap(ints, k));
		
	}
	
	public  static int minHeap(List<Integer> ints, int k) {
		
		// create an min-heap using PriorityQueue class and insert
				// first k elements of the array into the heap
				PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));

				// do for remaining array elements
				for (int i = k; i < ints.size(); i++)
				{
					// if current element is more than the root of the heap
					if (ints.get(i) > pq.peek())
					{
						// replace root with the current element
						pq.poll();
						pq.add(ints.get(i));
					}
				}

				// return the root of min-heap
				return pq.peek();
	}

}
