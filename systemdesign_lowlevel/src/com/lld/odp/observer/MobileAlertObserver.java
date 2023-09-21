package com.lld.odp.observer;

import com.lld.odp.observable.StockObservable;

public class MobileAlertObserver implements NotifyAlertObserver {
	public String mobileNo;
	StockObservable observable;

	public MobileAlertObserver(String mobileNo, StockObservable observable) {
		super();
		this.mobileNo = mobileNo;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMessageOnmobile("9XXX-XXXX", "Mobile Alert observable.......");
	}

	private void sendMessageOnmobile(String mobileNo, String message) {
		System.out.println("message sent to " + mobileNo + " and message is," + message);

	}
}
