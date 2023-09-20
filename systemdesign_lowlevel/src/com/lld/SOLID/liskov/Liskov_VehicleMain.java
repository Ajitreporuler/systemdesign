package com.lld.SOLID.liskov;

import java.util.ArrayList;

import java.util.List;

public class Liskov_VehicleMain {

	public static void main(String[] args) {

		List<Vehicle> vehicle = new ArrayList<Vehicle>();
		vehicle.add(new Car(4, "Car"));
		vehicle.add(new Bicycle(2, "Bocycle"));
		for (Vehicle vehi : vehicle) {
			vehi.noOfwheels();
		}

		List<EngineVehicle> engine = new ArrayList<EngineVehicle>();
		engine.add(new Car("BMW-i7", Boolean.FALSE));

		// engine.add(new Bicycle(1, ""));

		for (EngineVehicle engineVehicle : engine) {
			engineVehicle.vahicleIsHavingEngine();
		}
	}

}