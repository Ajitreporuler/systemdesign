package com.lld.FactoryPattern;

public class FactoryPatternMain {
public static void main(String[] args) {
	ShapeFactory sf=new ShapeFactory();
	Shape shape=sf.getShape("react");
	shape.drow();
}
}
