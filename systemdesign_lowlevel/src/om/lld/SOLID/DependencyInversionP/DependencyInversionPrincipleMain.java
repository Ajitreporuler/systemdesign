package om.lld.SOLID.DependencyInversionP;

/**
 *  Dependency Inversion Principle is one of solid principle which states,should not be coupling between high level component and low level component
 *  
 *  in other word, class should be dependent of abstract/interface rather than concrete class
 *  
 *  
 *  High level module should not depend on low level module both should depend on abstractions.
 *  Abstraction should not depend on details, details should depend on abstraction.
 *  
 *  
 *  
 *  1. create abstraction/interface which should represent high level concept.
 *  2. implement low level module which should represent low level detail , implementation class.
 *  3. Ensure high level module depends on abstraction/Interface
 */
public class DependencyInversionPrincipleMain {
	
	public static void main(String[] args) {
	Switchable	lightbulb=new LightBulb();
	
	Switchable	ac=new Airconditioner();
	
	//RoomDeviceControl rmd=new RoomDeviceControl(ac);
	
	RoomDeviceControl rmd=new RoomDeviceControl(lightbulb);
	rmd.switchOnOffDevice(true);
	}

}
