package com.lld.SOLID.liskov;

public class EngineVehicle extends Vehicle {
	String vahicleName;
	Boolean isElectricEngine;
	
	
	
public EngineVehicle() {
		super();
		
	}



	public EngineVehicle(Integer noOfwheel, String type) {
		super(noOfwheel, type);
		
	}



public EngineVehicle(String vahicleName, Boolean isElectricEngine) 
{
	
		this.vahicleName = vahicleName;
		this.isElectricEngine = isElectricEngine;
	}



public void vahicleIsHavingEngine() {
	
	System.out.println("The vehicle name is = "+vahicleName +"is it electric engine? =" +isElectricEngine);
}
}
