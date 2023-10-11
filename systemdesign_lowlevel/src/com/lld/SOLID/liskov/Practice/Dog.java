package com.lld.SOLID.liskov.Practice;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(super.name+"  barks");
	}
	 public void wagTail() {
	        System.out.println(super.name + " wags its tail.");
	    }
}
