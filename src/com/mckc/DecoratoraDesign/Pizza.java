package com.mckc.DecoratoraDesign;

import java.util.HashMap;
import java.util.Map;

//have to create the Pizza Application 
// Map to store the Pizza ingredients and rate 
//  Map<String, Integer> m = new HashMap();
  
// Different options of Pizza 
//
//    1. Basic Pizza 
//    2. Capsicum Pizza 
//    3. Cheese Pizza 
//    4. Double Cheese Pizza 

// MultiSelect option should be there for pizza 


public interface Pizza {
	
	public void createPizza();
	
	public int getCost();
	
    
	 
}
