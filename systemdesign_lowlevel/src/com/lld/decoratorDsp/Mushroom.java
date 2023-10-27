package com.lld.decoratorDsp;

public class Mushroom extends ToppingDecorator{
BasePizza basePizza;

	public Mushroom(BasePizza basePizza) {
	super();
	this.basePizza = basePizza;
}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+20;
	}

}
