package com.lld.odp.POC;

public class MobileDisplayObserver implements Displayobserver{

	String mobileNo;
	
	WeatherStationObservable wetherStob;
	
	

	public MobileDisplayObserver(String mobileNo, WeatherStationObservable wetherStob) {
		super();
		this.mobileNo = mobileNo;
		this.wetherStob = wetherStob;
	}


	@Override
	public void update() {
		notifyUser();
	}


	private void notifyUser() {
		System.out.println("notified user mobile no : "+mobileNo +" weather is "+wetherStob.getCurrentTemp());
		
	}

}
