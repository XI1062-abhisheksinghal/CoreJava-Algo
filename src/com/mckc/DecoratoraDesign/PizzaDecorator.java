package com.mckc.DecoratoraDesign;

public class PizzaDecorator implements Pizza{
	
	protected Pizza pizza;
	
	
	public PizzaDecorator(Pizza p) {
		this.pizza=p;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		this.pizza.createPizza();
		
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		
		return this.pizza.getCost();
	}
	
	

}
