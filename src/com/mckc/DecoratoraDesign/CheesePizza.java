package com.mckc.DecoratoraDesign;

public class CheesePizza extends PizzaDecorator{
     
	private int price = 20;
	public CheesePizza(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		super.createPizza();
		System.out.println("Added features of Cheese pizza");
		
	}
    
	
	@Override
	public int getCost() {
		
		return price = price +super.getCost();
	}

}
