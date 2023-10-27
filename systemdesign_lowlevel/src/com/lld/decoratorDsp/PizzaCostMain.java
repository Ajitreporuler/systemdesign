package com.lld.decoratorDsp;

public class PizzaCostMain {
	public static void main(String[] args) {
		//50+50
		BasePizza extracheesfaramHousePizza=new Extracheese(new FarmHousePizza());
		System.out.println(extracheesfaramHousePizza.cost());
		//50+20+40
		BasePizza extraCheesMashroomVegDelight=new Extracheese(new Mushroom(new VegDelightPizza()));
	
	System.out.println(extraCheesMashroomVegDelight.cost());
	
	}

}
