package com.mckc.refratoring;

import java.util.List;

public class Customer {
	
	String name ;
	List<Rentals> listOfRental;
	public static int amount=0;
	
	public Customer(String name, List<Rentals> list) {
		this.name = name;
		this.listOfRental= list;
	}
	
	
	public int bill() {
		
		for(int i=0;i<this.listOfRental.size();i++) {
			
		Rentals rent = listOfRental.get(i);
		int days = rent.days;
		Movie movie = rent.movie;
		MovieType type = movie.type;
		
		if(type.equals(MovieType.children)){
				this.amount = this.amount+daysAmount(days);
				this.amount= this.amount+10;
		}
		else if(type.equals(MovieType.newRelease)){
				 this.amount = this.amount+daysAmount(days);
				this.amount= this.amount+20;
		}
		else if(type.equals(MovieType.regular)) {
				this.amount = this.amount+daysAmount(days);
				this.amount= this.amount+30;
				
			}
		}		
		return amount;
		
		
		}
		
	
	
	public int daysAmount ( int days) {
		
		
		if(days<1) {
			throw new IllegalDaysException("Days cannot be negative");
		}
		
		
		if(days>=2) {
			return 20;
		}
		else if(days==1) {
			return 10;
		}
		
		return 0;
		
	}

	
	

}
