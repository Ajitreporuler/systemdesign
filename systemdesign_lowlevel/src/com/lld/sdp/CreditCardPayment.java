package com.lld.sdp;
//Step-2
public class CreditCardPayment implements PaymentStrategy{
private String cardNumber;

public CreditCardPayment(String cardNumber) {
	super();
	this.cardNumber = cardNumber;
}

@Override
public void pay(int amount) {
	System.out.println("paid "+amount +" Rs using credit card "+cardNumber);
	
}

}
