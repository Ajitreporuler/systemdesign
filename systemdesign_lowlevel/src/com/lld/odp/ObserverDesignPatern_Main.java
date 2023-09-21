package com.lld.odp;

import com.lld.odp.observable.CricketObservableImpl;
import com.lld.odp.observable.ObservableObject;
import com.lld.odp.observable.StockObservable;
import com.lld.odp.observable.cricketObservable;
import com.lld.odp.observer.AlertToUser;
import com.lld.odp.observer.CricketObserver;
import com.lld.odp.observer.EmailAlertObserver;
import com.lld.odp.observer.MobileAlertObserver;
import com.lld.odp.observer.NotifyAlertObserver;

/**
 * Observer Design Pattern is a behavioural design pattern in Java that defines a
 * one-to-many dependency between objects. In this pattern, one object (the
 * subject) maintains a list of its dependents (observers) and notifies them of
 * any state changes, usually by calling one of their methods. This pattern
 * promotes loose coupling between objects, as the subject doesn't need to know
 * the specific details of its observers.
 */
public class ObserverDesignPatern_Main {

	public static void main(String[] args) {
		StockObservable stockobservable = new ObservableObject();
		NotifyAlertObserver nOb = new EmailAlertObserver("ajitXXXX...", stockobservable);
		NotifyAlertObserver nOb1 = new EmailAlertObserver("prXXXX...", stockobservable);
		NotifyAlertObserver nObMobile = new MobileAlertObserver("90XXXXXXXX...", stockobservable);
		

		stockobservable.add(nOb);
		stockobservable.add(nOb1);
		stockobservable.add(nObMobile);
		stockobservable.setstockcount(105);
		// stockobservable.notifysubscribers();
		System.out.println(stockobservable.getstockcount() + "...........");
		
		
		
		
		cricketObservable crickobservable=new CricketObservableImpl();
		CricketObserver crickObs=new AlertToUser("Ajit", "Score is 305");
		CricketObserver crickObs1=new AlertToUser("ppXXXX", "Score is 310");
		crickobservable.add(crickObs);
		crickobservable.add(crickObs1);
		crickobservable.setConditionToNotify();
		
		

	}
}
