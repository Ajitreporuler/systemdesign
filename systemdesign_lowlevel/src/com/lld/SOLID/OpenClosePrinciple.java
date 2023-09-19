package com.lld.SOLID;

/**
 * @author Ajit
 * 
 * open/close principle is one of principle of object oriented programming design pattern which states that it should be open for extension 
 * but close for modification.   
 * 
 * in other word we should be able to extend the behaviour without modifying the source code
 * 
 *for an example - ==>class OpenClosePrinciple and Pen both implements  pricing 
 */
public class OpenClosePrinciple implements Pricing{
int quantity;

	public OpenClosePrinciple(int quantity) {
	super();
	this.quantity = quantity;
}

	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return (quantity*20.00);
	}

}
