package com.mckc.SingletonPattern;

public class SingletonExampleMain {
	
	public static void main(String args[]) {
		
		SingletonExample se = null;
		
		SingletonExample s =se.getInstance();
		s.setName("Abhishek Singhal");
		s.setId(12);
		
		SingletonExample s1 = se.getInstance();
		s1.setName("Rakesh");
		s1.setId(13);
		
		System.out.println(s.getName());
		System.out.println(s.getId());
		
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
