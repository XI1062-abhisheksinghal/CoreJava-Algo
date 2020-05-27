package com.mckc.Strategy;

public class StrategyDesignPatternMain {
	
	public static void main(String args[]) {
		
		
		ShoopingCart shoppingcart = new ShoopingCart();
		
		
		Payement payment = new CreditCardPayment();
		Payement payment1 = new CashPayment();
		  
		 shoppingcart.createShoppingCart();
		 shoppingcart.calculateCost(payment);
		 ShoopingCart shoppingcart1 = new ShoopingCart();
		 shoppingcart1.createShoppingCart();
		 shoppingcart1.calculateCost(payment1);
		
	}

}
