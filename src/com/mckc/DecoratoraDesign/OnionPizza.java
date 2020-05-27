package com.mckc.DecoratoraDesign;

public class OnionPizza extends PizzaDecorator {
	
	
	private int price = 30;
	public OnionPizza(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		super.createPizza();
		System.out.println("Added features of Onion pizza");
		
	}
	
	@Override
	public int getCost() {
		
		return price =price+ super.getCost();
	}
	
	


}
