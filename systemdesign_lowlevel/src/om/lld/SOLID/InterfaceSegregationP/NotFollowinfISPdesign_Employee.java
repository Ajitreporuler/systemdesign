package om.lld.SOLID.InterfaceSegregationP;

/**
 * this interface is not following ISP, because implementation class will have to provide implementation for all the method even if it is not needed.
 * for an example;- if a we have to get list of developers, class has to provide implementation for developer,management,functional employee.
 */
public interface NotFollowinfISPdesign_Employee {
	void developer();
	void management();
	void functional();
	void securityGuard();

}
