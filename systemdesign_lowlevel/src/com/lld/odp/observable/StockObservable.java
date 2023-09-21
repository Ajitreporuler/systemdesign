package com.lld.odp.observable;

import com.lld.odp.observer.NotifyAlertObserver;

public interface StockObservable {
	public void add(NotifyAlertObserver observer);

	public void remove(NotifyAlertObserver observer);

	public void notifysubscribers();

	public void setstockcount(int newStockAdded);

	public int getstockcount();

}
