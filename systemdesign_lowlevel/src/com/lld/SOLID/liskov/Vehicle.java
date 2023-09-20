package com.lld.SOLID.liskov;

public class Vehicle {
	Integer noOfwheel;
	String type;
	
	
	
	public Vehicle() {
		
	}



	public Vehicle(Integer noOfwheel, String type) {
		super();
		this.noOfwheel = noOfwheel;
		this.type = type;
	}



	public void noOfwheels() {
		System.out.println("The "+type +" is having "+noOfwheel+" no of wheel");
	}

}
