package com.mckc.trick;

//Example for Builder pattern
public class Pizza {
	
	

	public Pizza(Builder builder) {
		// TODO Auto-generated constructor stub
		base=builder.base;
		size= builder.size;
		toppings=builder.toppings;
		cheese= builder.cheese;
	}

	//Two required params 
	private String base ;
	private int size;
	
	//Optional param
	private String toppings;
	private String cheese;
	
	public static class Builder{
		
		//Two required params 
		private String base ;
		private int size;
		
		//Optional param
		private String toppings;
		private String cheese;
		
		public Builder(String base,int size) {
			
			this.base=base;
			this.size=size;
		}
		
		public Builder toppings(String val) {
			{base = val; return this;}
		}
		
		public Builder cheese(String val) {
			{cheese = val; return this;}
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
		
		
		
	}

}
