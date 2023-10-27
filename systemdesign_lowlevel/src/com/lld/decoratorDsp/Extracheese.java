package com.lld.decoratorDsp;

public class Extracheese extends ToppingDecorator{
BasePizza basePizza;

	public Extracheese(BasePizza basePizza) {
	super();
	this.basePizza = basePizza;
}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+50;
	}

}
