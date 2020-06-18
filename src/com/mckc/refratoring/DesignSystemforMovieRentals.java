package com.mckc.refratoring;

import java.util.ArrayList;
import java.util.List;

public class DesignSystemforMovieRentals {
	
	public static void main(String args[]) {
		
		
		   Rentals rentals = new Rentals(2,new Movie("DDLJ",MovieType.regular));
		   Rentals rentals1= new Rentals(1,new Movie("SwissMovie", MovieType.newRelease));
		   
		   List<Rentals> list = new ArrayList<Rentals>();
		   list.add(rentals);
		   list.add(rentals1);
		   
		   
		   Customer cust = new Customer("Abhishek",list);
		   System.out.println(cust.bill());
		
	}

}
