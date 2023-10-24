package com.lld.sdp.VehicleExample;

public class Car {
private CarDriveStrategy strategy;

public Car(CarDriveStrategy strategy) {
	super();
	this.strategy = strategy;
}
 void drive() {
	 strategy.drive();
 }
}
