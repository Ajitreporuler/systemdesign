package com.lld.SOLID;

public class OpenCloseMain {
public static void main(String[] args) {
	Pen pen = new Pen(10);
	System.out.println(pen.calculatePrice());
	OpenClosePrinciple openclose = new OpenClosePrinciple(10);
	System.out.println(openclose.calculatePrice());
}
}
	