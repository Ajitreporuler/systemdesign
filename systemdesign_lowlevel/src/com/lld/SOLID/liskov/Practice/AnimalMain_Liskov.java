package com.lld.SOLID.liskov.Practice;

public class AnimalMain_Liskov {
public static void interectAnimal(Animal animal) {
animal.makeSound();

}

public static void main(String[] args) {
	Dog dogObj=new Dog("sheru");
	Tiger tiger=new Tiger("killbill");
	interectAnimal(dogObj);
	dogObj.wagTail();
	interectAnimal(tiger);
}
}
