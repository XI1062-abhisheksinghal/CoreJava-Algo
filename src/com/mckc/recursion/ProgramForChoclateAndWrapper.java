package com.mckc.recursion;

public class ProgramForChoclateAndWrapper {
	
	public static void main(String args[]) {
		
		int money = 3;
		int price = 2;
		int wrap =2;
		
		//Find no of chocolates you can get 
		int choco =0;
		
		choco = money/price;

		 int wrappers = choco;
		 
		 while(wrappers>=wrap) {
			 int newchocolate = wrappers/wrap;
			 int remainderWrapper = wrappers%wrap;
			 choco= choco+ newchocolate ;
			 wrappers= newchocolate;
			 wrappers = wrappers+remainderWrapper;
		}
		
		System.out.println(choco);
		
	}

}
