package com.practice.systemdesign;

import java.io.ObjectInputStream.GetField;

public class LiftMain {
	
	public static void main(String args[]) {
		
		
		//Button press on specific floor 
		//Total floors in building 
		// Capacity of lift with persons 
		
		
		System.out.println("Lift Design System ");
		//Creating a lift with the total persons and Floor
		Lift lift = new Lift(10,4);
		
		try {
			
			//Starting the lift operation
			lift.startLift(10, 4);
			
			
			lift.downButtonPressed(1, 0);
			System.out.println(lift.getLiftPosition());
			System.out.println(lift.getLiftCapacity());
			
			lift.upButtonPressed(3, 1);
			System.out.println(lift.getLiftPosition());
			
			
			
			//lift.upButtonPressed(floor, load);
		} catch (InvalidFloorException | InvalidLiftCapacity e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
