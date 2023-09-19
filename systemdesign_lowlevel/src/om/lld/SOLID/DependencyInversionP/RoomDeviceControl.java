package om.lld.SOLID.DependencyInversionP;

/**
 * high level module, depends on abstraction
 */
public class RoomDeviceControl {
	
private Switchable devices;

public RoomDeviceControl(Switchable devices) {
	super();
	this.devices = devices;
}
public void switchOnOffDevice(Boolean flag) {
	
	Boolean onOrOff=devices.turnOnorOff(flag);
	System.out.println("is the device on ? " +onOrOff);
}
	
}
