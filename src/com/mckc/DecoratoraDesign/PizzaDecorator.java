package com.mckc.DecoratoraDesign;

public class PizzaDecorator implements Pizza{
	
	protected Pizza pizza;
	
	
	public PizzaDecorator(Pizza p) {
		this.pizza=p;
	}

	@Override
	public void createPizza() {
		this.pizza.createPizza();
		
		
	}

	@Override
	public int getCost() {
		
		return this.pizza.getCost();
	}
	
	

}
