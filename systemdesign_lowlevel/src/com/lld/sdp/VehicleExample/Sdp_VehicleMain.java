package com.lld.sdp.VehicleExample;

public class Sdp_VehicleMain {
public static void main(String[] args) {
	Vehicle vehicle=new OffroadVehicle();
	vehicle.drive();
	System.out.println(".........set goods vahicle strategy...");
	
	Vehicle goodsVehicle=new GoodsVehicle();
	goodsVehicle.drive();
}
}
