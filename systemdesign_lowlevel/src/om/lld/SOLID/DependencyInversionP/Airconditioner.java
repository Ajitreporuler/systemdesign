package om.lld.SOLID.DependencyInversionP;
/**
 * low level module
 */
public class Airconditioner  implements Switchable{

	@Override
	public boolean turnOnorOff(Boolean flag) {
		
		System.out.println("turnOnorOff method from AC calling...");
		return flag;
	}

	
	

}
