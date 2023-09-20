package com.lld.sdp;

/**
 * Strategy Design Pattern is one of behavioural design pattern, it is used to define a family of algorithms, encapsulation each on of them, and make them interchangeable
 * 
 * key component for SDP---->
 * Context
 * Strategy
 * Concrete Strategies
 * 
 * // Step 1: Define the Strategy interface
 * Step 2: Create Concrete Strategy classes
 * Step 3: Create the Context class
 * Step 4: Client code
 */
public class StrategyDesignPatternMain {

	public static void main(String[] args) {
	CreditCardPayment creditCardPayment=new CreditCardPayment("XXX-XXX-XXX-001");
		ShopingContextClass setStrategy=new ShopingContextClass(creditCardPayment);
		setStrategy.checkout(5000);
		
		System.out.println("Setting UPI stratgy...........");
		UpiPayment up=new UpiPayment("00000000010");
		ShopingContextClass setStrategyForUpi=new ShopingContextClass(up);
		
		setStrategyForUpi.checkout(100);
		
	}
}
