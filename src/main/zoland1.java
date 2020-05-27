package main;

import java.util.Arrays;

public class zoland1 {
	
	public static void main(String args[]) {
		
		int[] n = new int[]{34,98,2,3};
		if(n.length==0) {
			System.out.println("there isno element on array ");
		}
		
		Arrays.sort(n);
		
		Arrays.stream(n).forEach(i->System.out.println(i));
		
		
		
		}

}
