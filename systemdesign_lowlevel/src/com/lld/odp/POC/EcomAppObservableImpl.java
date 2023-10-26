package com.lld.odp.POC;

import java.util.ArrayList;
import java.util.List;

public class EcomAppObservableImpl implements EcomAppObservable{
List<IphoneObserver> iphoneObserver=new ArrayList<IphoneObserver>();

int stockCount=0;
	@Override
	public void add(IphoneObserver observer) {
		iphoneObserver.add(observer);
		
	}

	@Override
	public void remove(IphoneObserver observer) {
		iphoneObserver.remove(observer);
		
		
	}

	@Override
	public void notifyobserver() {
		iphoneObserver.forEach(observer->observer.update());
		
	}

	@Override
	public void voidSetData(int stock) {
		if(stockCount==0) {
			
			notifyobserver();
		}
		stockCount=stockCount+stock;
		
		
	}
	

}
