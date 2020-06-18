package com.mckc.dynamicprogramming;

public class PrintingAllSubSetsAndCountNo {

	public static void main(String args[]) {

		int[] arr = { 1, 2, 3 };

		int sum = 1;

		int count = countSubsetUsingRecursion(arr, sum, arr.length, 0, 0);
		System.out.println(count);
		// output would be {} {1} {1,2} {2} {1,2,3} {3} {1,3}

	}

	public static int countSubsetUsingRecursion(int[] arr, int sum, int n, int i, int count) {

		if (i == n) {
			if (sum == 0) {
				count++;
			}
			return count;
		}

		count = countSubsetUsingRecursion(arr, sum - arr[n - 1], arr.length, i + 1, count);

		count = countSubsetUsingRecursion(arr, sum, arr.length, i + 1, count);

		return count;

	}

}
