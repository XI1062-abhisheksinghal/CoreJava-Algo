package com.mckc.DecoratoraDesign;

public class BasicPizza implements Pizza {

	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		
		System.out.println("basicPizza created");
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

	
}
