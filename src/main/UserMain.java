package main;

import java.util.Arrays;
import java.util.Optional;

public class UserMain {
	
	public static void main(String args[]) {
		
		Integer arr[] = {1,23,44,55,66};
		
		Arrays.asList(arr).forEach(System.out::println);
		
		Optional<Integer> sum = Arrays.asList(arr).stream().reduce((a,b)->a+b);
		if(sum.isPresent()) {
			System.out.println(sum.get());
		}
		
		Integer i =1;
		Integer x =2;
		
		System.out.println(i+x);
		
		
		
		
		
		
	}

}
