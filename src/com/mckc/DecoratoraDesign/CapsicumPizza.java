package com.mckc.DecoratoraDesign;

public class CapsicumPizza extends PizzaDecorator {
  
	
	private int price =10;
	public CapsicumPizza(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		super.createPizza();
		System.out.println("Added features of Capsicum pizza");
		
	}
	
	@Override
	public int getCost() {
		return price =price+ super.getCost();
	}


}
