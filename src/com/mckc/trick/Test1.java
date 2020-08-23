package com.mckc.trick;


class base {
	
	public int i=10;
	
	protected void foo() {
		
	}
}
public class Test1 extends base{
	
	@Override
	protected void foo() {
	     int i=20;
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String args[]) {
		
		
		Test1 t = new Test1();
		t.foo();
	}

}
