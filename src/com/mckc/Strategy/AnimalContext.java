package com.mckc.Strategy;

public class AnimalContext {
	
	private animal ani;
	
	public AnimalContext(animal ani) {
		
		System.out.println(ani.sound());
	}

}
