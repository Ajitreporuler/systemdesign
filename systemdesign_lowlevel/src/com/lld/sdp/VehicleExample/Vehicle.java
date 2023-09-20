package com.lld.sdp.VehicleExample;

public class Vehicle {
	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}

	void drive() {
		driveStrategy.drive();
	}
}
