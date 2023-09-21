package com.lld.odp.observer;

public class AlertToUser implements CricketObserver{
	public String userName;
	public String message;
	
	
	public AlertToUser(String userName, String message) {
		super();
		this.userName = userName;
		this.message = message;
	}


	@Override
	public void update() {
		notifyUser();
		
	}


	private void notifyUser() {
		System.out.println("message sent to user "+userName +" and score is "+message);
		
	}
	
	

}
