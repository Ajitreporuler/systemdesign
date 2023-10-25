package com.lld.sdp.VehicleExample;

public class OperatingSystemMain {
public static void main(String[] args) {
	Android ad=new Android();
	Macos macos=new Macos();
	OperatingSystemContext osC=new OperatingSystemContext(macos);
			osC.drive();
}
}
