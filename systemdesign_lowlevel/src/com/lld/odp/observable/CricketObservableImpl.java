package com.lld.odp.observable;

import java.util.ArrayList;
import java.util.List;

import com.lld.odp.observer.CricketObserver;

public class CricketObservableImpl implements cricketObservable{
List<CricketObserver> crickObserver=new ArrayList<CricketObserver>();
Boolean isStateChange=false;
	@Override
	public void add(CricketObserver observer) {
		crickObserver.add(observer);
		isStateChange=Boolean.TRUE;
	}

	@Override
	public void notifyObserver() {
		for (CricketObserver cricketObserver : crickObserver) {
			cricketObserver.update();
		}
		
	}

	@Override
	public void remove(CricketObserver observer) {
		crickObserver.remove(observer);
		
	}

	@Override
	public void setConditionToNotify() {
		
		if(isStateChange) 
			notifyObserver();
	}

}
