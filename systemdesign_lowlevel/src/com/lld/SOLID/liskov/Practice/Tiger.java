package com.lld.SOLID.liskov.Practice;

public class Tiger extends Animal{

	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void makeSound() {
		System.out.println(super.name+" Roars");
	}
	public void denger() {
		System.out.println(super.name+" can kill animal");
	}
}
