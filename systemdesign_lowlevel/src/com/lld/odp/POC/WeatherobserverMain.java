package com.lld.odp.POC;

public class WeatherobserverMain {
public static void main(String[] args) {
	WeatherStationObservable weatherStation=new WeatherStationImpl();
	weatherStation.setTemp(10);
	Displayobserver display=new MobileDisplayObserver("12039304394040404", weatherStation);
	
	weatherStation.add(display);
	weatherStation.notifyObserver();
}
}
