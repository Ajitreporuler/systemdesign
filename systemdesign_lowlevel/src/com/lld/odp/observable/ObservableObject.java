package com.lld.odp.observable;

import java.util.ArrayList;
import java.util.List;

import com.lld.odp.observer.NotifyAlertObserver;

public class ObservableObject implements StockObservable {

	List<NotifyAlertObserver> observerList = new ArrayList<NotifyAlertObserver>();
	int stockCount = 0;

	@Override
	public void add(NotifyAlertObserver observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotifyAlertObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifysubscribers() {
		for (NotifyAlertObserver notifyAlertObserver : observerList) {
			notifyAlertObserver.update();
		}

	}

	@Override
	public void setstockcount(int newStockAdded) {
		if (stockCount == 0) {
			notifysubscribers();
		}
		stockCount += newStockAdded;

	}

	@Override
	public int getstockcount() {
		return stockCount;
	}

}
