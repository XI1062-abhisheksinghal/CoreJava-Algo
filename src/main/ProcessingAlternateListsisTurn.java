package main;

import java.util.Arrays;
import java.util.List;

public class ProcessingAlternateListsisTurn {
	
	public static void main(String args[]) {
		
		List<Integer> l1 = Arrays.asList(1,3,3,5,7,9);
		List<Integer> l2 = Arrays.asList(2,4,6,8,10,12,14,16,18);
		
		//Ask is to print alternate elements of each list 
		//Output should be 1,2,3,4,5,6,7,8,9,10,12,14,16,18
		
		
		
		for(int j=0;j<l2.size();j++) {
			
			if(j<l1.size()) {
				
			//Process element of list1
			System.out.println(l1.get(j));
			
			}
			
			//Process element of lists
			System.out.println(l2.get(j));
		
		}
	}

}
