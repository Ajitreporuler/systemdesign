package com.lld.odp.POC;

public interface EcomAppObservable {
	void add(IphoneObserver observer);
	void remove(IphoneObserver observer);
	void notifyobserver();
	void voidSetData(int stock);
	
	

}
