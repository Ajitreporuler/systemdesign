package com.lld.sdp.VehicleExample;

public class OperatingSystemContext {
private OperatingSystem os;

public OperatingSystemContext(OperatingSystem os) {
	super();
	this.os = os;
}

void drive() {
	os.runApplication();
}

}
