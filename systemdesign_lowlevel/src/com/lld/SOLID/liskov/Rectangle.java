package com.lld.SOLID.liskov;

public class Rectangle {
	int width;
	int hight;
	public Rectangle(int width, int hight) {
		super();
		this.width = width;
		this.hight = hight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	 public int getArea() {
		 return width*hight;
	 }

}
