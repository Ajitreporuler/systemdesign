package com.lld.odp.POC;

public class EmailAlertObserver implements IphoneObserver{
String email;

	public EmailAlertObserver(String email) {
	super();
	this.email = email;
}

	@Override
	public void update() {
		notifyUser();
		
	}

	private void notifyUser() {
		System.out.println("email sent to EmailId "+ email);
	}

}
