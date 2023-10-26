package com.lld.odp.POC;

public interface WeatherStationObservable {
void add(Displayobserver obj);
void remove(Displayobserver obj);
void notifyObserver();
void setTemp(int temp);
int getCurrentTemp();


}
