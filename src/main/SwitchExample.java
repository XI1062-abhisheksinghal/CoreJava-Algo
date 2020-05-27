package main;

import java.util.Arrays;
import java.util.List;

public class SwitchExample {
	
	public static void main(String args[]) {
		
		String turn="Player1";
		
		List<Integer> missiles = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		for(int i=0;i<missiles.size();) {
		switch(turn) {
		
		case "Player1":
			if(missiles.get(i)%2==0) {
			System.out.println("Player 1 Turn"+missiles.get(i));
			turn="Player2" ;
			i++;
		}
		 break;//call break here so nothing is printed 
		
		case "Player2":
			if(missiles.get(i)%2!=0) {
				
			System.out.println("Player 2 Turn"+missiles.get(i));
			turn="Player1";
			i++;	
			
			}
		
		default:
		    System.out.println("No Match");
		}	
	}
		
	}

}
