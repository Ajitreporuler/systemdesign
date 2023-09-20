package com.lld.sdp;
//Step-3
public class ShopingContextClass {
private PaymentStrategy paymentStrategy;

public ShopingContextClass(PaymentStrategy paymentStrategy) {
	super();
	this.paymentStrategy = paymentStrategy;
}

public void checkout(int amount) {
	paymentStrategy.pay(amount);
}

}
