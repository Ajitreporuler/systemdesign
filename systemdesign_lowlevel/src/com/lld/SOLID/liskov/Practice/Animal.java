package com.lld.SOLID.liskov.Practice;

public class Animal {
 String name;

public Animal(String name) {
	super();
	this.name = name;
}

public void makeSound() {
	System.out.println(name+" makes a generic animal sound");
}


}
