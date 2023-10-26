package com.lld.odp.POC;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStationObservable{

	Boolean tempChange=false;
	int currentTemp=0;
	
	List<Displayobserver> display=new ArrayList<Displayobserver>();
	
	
	@Override
	public void add(Displayobserver obj) {
		// TODO Auto-generated method stub
		display.add(obj);
		
	}

	@Override
	public void remove(Displayobserver obj) {
		display.remove(obj);
		
	}

	@Override
	public void notifyObserver() {
		display.forEach(n->n.update());
		
	}

	@Override
	public void setTemp(int temp) {
		if(!(currentTemp==temp)) {
			currentTemp=temp;
			notifyObserver();
		}
		
		
	}
	@Override
	public int getCurrentTemp() {
		return currentTemp;
	}


	

}
