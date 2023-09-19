package com.lld.SOLID.liskov;

public class Square extends Rectangle{
	int side;

	public Square(int side) {
		super(side, side);
		
	}
	
@Override
public void setWidth(int width) {
	// TODO Auto-generated method stub
	super.setWidth(width);
	super.setHight(width);
}

@Override
public void setHight(int hight) {
	// TODO Auto-generated method stub
	super.setHight(hight);
	super.setWidth(hight);
}
}
