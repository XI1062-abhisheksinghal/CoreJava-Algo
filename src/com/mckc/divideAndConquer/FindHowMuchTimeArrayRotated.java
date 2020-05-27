package com.mckc.divideAndConquer;

public class FindHowMuchTimeArrayRotated {

	public static void main(String args[]) {

		int[] arr = { 2, 4, 6, 8, 9, 10 };
		int rotated = 0;
		// Array is rotated 3 times , left rotated
		// Check if the array is sorted or not
		// left rotate by one and and increment counter and check if array is sorted or
		// not
		while (!isSorted(arr)) {
			leftRotateOneTime(arr);
			rotated++;
		}
		for (int i : arr)
			System.out.println(i);
		System.out.println("Rotated" + rotated);

	}

	public static void leftRotateOneTime(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = temp;
	}

	public static boolean isSorted(int[] arr1) {
		boolean flag = true;
		for (int j = 0; j < arr1.length - 1; j++) {
			if (arr1[j] > arr1[j + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
