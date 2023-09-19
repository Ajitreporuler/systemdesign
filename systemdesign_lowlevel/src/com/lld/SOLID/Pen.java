package com.lld.SOLID;

public class Pen implements Pricing{
	
	Integer quantity;
	
	

	public Pen(Integer quantity) {
		super();
		this.quantity = quantity;
	}



	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return (quantity*10.00);
	}
	
	

}
