package com.mck.Java8Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class StaticEg {
	
	static {
		System.out.println("inside static ");
	}
}
public class Sapient  {
	
	static {
		System.out.println("inside static ");
	}
	
	
	
	{
		System.out.println("initialization block");
	}
	
	public Sapient() {
		
		System.out.println("inside constructor");
	}
	
	public static void main(String args[]) {
		
		System.out.println("inside main");
		//Sapient sap = new Sapient();
		
		List<Integer> ls = Arrays.asList(1,2,3,4,56);
		
		List<Integer> evenNumbers = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		
		
	}

}
