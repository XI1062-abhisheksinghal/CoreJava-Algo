package com.mckc.Strategy;

import java.util.HashMap;
import java.util.Map;

public class ShoopingCart {
	
	private Map<String,Integer> mapOfItems ;
	
	private Map<String,Integer> itemCost;
	
	private Integer totalCost=0;
	
	public ShoopingCart() {
		itemCost = new HashMap<String, Integer>();
		this.itemCost.put("Pencil", 1);
		this.itemCost.put("pen", 10);
		this.itemCost.put("erasure", 2);
	}
	
	
	public void createShoppingCart() {
		mapOfItems= new HashMap();
		this.mapOfItems.put("Pencil",5);
		this.mapOfItems.put("pen", 20);
		this.mapOfItems.put("erasure", 5);
		
	}
	
	public void calculateCost(Payement method) {
		
		this.mapOfItems.entrySet().forEach(i->{
			String item =i.getKey();
			Integer quantity = i.getValue();
			
			if(itemCost.containsKey(item)) {
				
				this.totalCost= totalCost +(itemCost.get(item)*quantity);
				
			}
		});
		
		 
		
		System.out.println("total amount paid is" +totalCost +" by method"+ method.pay());
		
	}	
	
	
	
    

}
