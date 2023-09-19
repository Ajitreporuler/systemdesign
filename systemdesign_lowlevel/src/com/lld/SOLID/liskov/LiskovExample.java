package com.lld.SOLID.liskov;


/**
 * @author Ajit
 * 
 * liskov is one of solid principle of object oriented system design which states that object of super class should be 
 * replaceable with subclass object without affecting the behaviour of the class 
 * 
 * in other word subclass should extend the capability of parent class , it should not narrow it down
 *
 */
public class LiskovExample {

	public static void userectangle(Rectangle rectangle) {
		
		int width=rectangle.getWidth();
		
		int area=rectangle.getArea();
		
		System.out.println(width+".....width......");
		System.out.println(area +".....area......");
	}
	
	
	public static void main(String[] args) {
		
		
		  Rectangle rect=new Rectangle(5, 10); 
		  userectangle(rect);
		 
		
		
		Square sqr=new Square(8);
		//passing child obj to method arg
		userectangle(sqr);
		
	}
}
