package com.lld.odp.POC;

public class EcomMain {
public static void main(String[] args) {
	EcomAppObservable observable=new EcomAppObservableImpl();
	IphoneObserver observer=new EmailAlertObserver("abc@gmail.com");
	observable.add(observer);
	observable.voidSetData(100);
	
}
}
