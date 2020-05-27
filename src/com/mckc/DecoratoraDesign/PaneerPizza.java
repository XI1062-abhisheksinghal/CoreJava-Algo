package com.mckc.DecoratoraDesign;

public class PaneerPizza extends PizzaDecorator {
	
	int price = 40;
	public PaneerPizza(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPizza() {
		// TODO Auto-generated method stub
		super.createPizza();
		System.out.println("Added features of Paneer pizza");
		
	}
    
	
	@Override
	public int getCost() {
		return price =price+ super.getCost();
	}
	

}
