package main;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	public static void main(String[] args) {
		System.out.println("hello all this is first example on mac for Bipredicate");
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 		
		
		
		
	}
	
	public static Integer add(Integer a, Integer b) {
		
		return a+b;
	}

}
