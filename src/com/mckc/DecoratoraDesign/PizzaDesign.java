package com.mckc.DecoratoraDesign;

import java.util.HashMap;
import java.util.Map;

public class PizzaDesign {
	
	public static void main(String[] args) {
		
		// Design the pattern for Pizza making 
		// Basic Pizza , or Cheese Pizza , Double cheese pizza , Onion Pizza , Tomato Pizaa 
		
		//Combination of All Pizzas 
		
		
		Pizza p = new CheesePizza(new BasicPizza());
		
		p.createPizza();
		System.out.println("============");
		Pizza p1 = new OnionPizza(new CheesePizza(new BasicPizza()));
		
		p1.createPizza();
		
		int totalcost =p1.getCost();
		
		System.out.println(totalcost);
		
		
		
	}

}
