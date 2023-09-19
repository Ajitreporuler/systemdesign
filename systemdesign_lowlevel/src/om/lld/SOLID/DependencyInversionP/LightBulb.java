package om.lld.SOLID.DependencyInversionP;


/**
 * low level module
 */
public class LightBulb implements Switchable{

	@Override
	public boolean turnOnorOff(Boolean flag) {
		System.out.println("Lightbulb calling......");
		return flag;
	}

}
