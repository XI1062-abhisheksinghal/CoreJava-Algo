package com.practice.systemdesign;

public class Lift {
	
	private int liftCapacity;
	private int totalFloors;
	
	private int liftPosition;
	private int currentCapacity;
	
	public Lift(int liftCapacity, int totalFloors) {
		
		this.liftCapacity= liftCapacity;
		this.totalFloors = totalFloors;
	}
	
	
	public void upButtonPressed(int floor, int load) {
		
		this.liftPosition = floor;
		if(this.currentCapacity+load>this.liftCapacity) {
			System.out.println("Lift overload");
		}else {
			this.currentCapacity= this.currentCapacity+load;
					
		}
		
		
	}
	
	public void downButtonPressed(int floor, int load) {
		this.liftPosition = floor;
		if(this.currentCapacity+load>this.liftCapacity) {
			System.out.println("Lift overload");
		}else {
			this.currentCapacity= this.currentCapacity+load;
					
		}
		
	}
		
	
	public boolean startLift(int persons, int floor) throws InvalidFloorException, InvalidLiftCapacity {
		//Considering the lift can be started from any floor with any number of persons 
		if(floor>this.totalFloors) {
			throw new InvalidFloorException("Floor is not valid");
		}
		if(persons>this.liftCapacity) {
			throw new InvalidLiftCapacity("Size is too BiG");
		}
		
		this.liftPosition= floor;
		this.currentCapacity = persons;
		
		
		return true;
		
		
	}
	
	public int getLiftPosition() {
		
		return this.liftPosition;
	}
	
	public int getLiftCapacity() {
		
		return this.liftCapacity;
	}
	

}
