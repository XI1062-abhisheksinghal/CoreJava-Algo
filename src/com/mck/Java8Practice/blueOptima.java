package com.mck.Java8Practice;


class A {
	A(){
		
		System.out.println("const a");
	}
	
	static {
		System.out.println("static a");
	}
	
	static {
		System.out.println("static a1");
	}
	
}

public class blueOptima extends A {
	
	 blueOptima() {
		 
		 System.out.println("const b");
	}
	 
	 static {
		 System.out.println("static b");
	 }
	 
	 static {
		 System.out.println("static b1");
	 }
	
	
	
	public static void main(String args[]) {
		
		A a = new blueOptima();
		
	}

}
