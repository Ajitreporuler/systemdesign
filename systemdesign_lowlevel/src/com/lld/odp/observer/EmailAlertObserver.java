package com.lld.odp.observer;

import com.lld.odp.observable.StockObservable;

public class EmailAlertObserver implements NotifyAlertObserver {
	public String emailId;
	StockObservable observable;

	public EmailAlertObserver(String emailId, StockObservable observable) {
		super();
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendEmail(emailId, "Email alert observer");

	}

	private void sendEmail(String email, String message) {
		System.out.println("mail sent to " + email + " and message is, " + message);

	}

}
