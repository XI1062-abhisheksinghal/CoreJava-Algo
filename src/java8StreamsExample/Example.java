package java8StreamsExample;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(3,4,5,6,71,12);
		
		//Square the numbers , find the number greater than 10,000 and then find average of them 
		
		 numbers.stream().mapToInt(x->(x*x)).forEach(System.out::println);
		 
		
	}

}
