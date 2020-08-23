package com.mckc.trick;



class Parent{
	private int i;
	
	Parent(){}
	
	Parent(int i){
		this.i=i;
	}
	
}
public class TrickyQuestions extends Parent {
	
	private static int i;
	private int x;
	private String name="Singhal";
	private static final int y=10;
	{
		System.out.println("inside init block");
	}
	static {
		System.out.println("inside static block");
	}
	
	{
		System.out.println("inside initialization block");
	}
	
	TrickyQuestions(int i){
		this.i=i;
	}
	
	TrickyQuestions(){
		
		i=15;
		System.out.println("inside constructor");
	}
	
	
	public static void main(String args[]) {
		
		
		TrickyQuestions trick = new TrickyQuestions();
		String name ="Abhishek";
		int i=2;
		int y=5;
		System.out.println(y);
		System.out.println(trick.y);
		System.out.println(name);
		System.out.println(i);
		System.out.println(trick.i);
		
		Parent p = new TrickyQuestions();
		
		
		
		
	}

}
