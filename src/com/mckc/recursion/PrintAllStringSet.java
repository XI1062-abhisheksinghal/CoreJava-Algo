package com.mckc.recursion;

public class PrintAllStringSet {

	public static void main(String args[]) {

		String s = "abc";

		String curr = "";

		printpowerSetRecursion(s, 0, curr);
	}

	public static void printpowerSetRecursion(String s, int index, String curr) {

		int n = s.length();
		if (index == n) {

			System.out.println(curr);
			return;
		}

		printpowerSetRecursion(s, index + 1, curr + s.charAt(index));
		printpowerSetRecursion(s, index + 1, curr);

	}

}
