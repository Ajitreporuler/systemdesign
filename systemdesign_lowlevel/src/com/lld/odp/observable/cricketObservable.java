package com.lld.odp.observable;

import com.lld.odp.observer.CricketObserver;

public interface cricketObservable {
public void add(CricketObserver observer);
public void notifyObserver();
public void remove(CricketObserver observer);
public void setConditionToNotify();
}
