package com.lld.sdp;
//Step-2
public class UpiPayment implements PaymentStrategy{
private String mobileNumber;

public UpiPayment(String mobileNumber) {
	super();
	this.mobileNumber = mobileNumber;
}

@Override
public void pay(int amount) {
	System.out.println(amount +" rs paid  using mobile number "+mobileNumber);
}

}
