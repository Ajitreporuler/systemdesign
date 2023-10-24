package com.lld.SOLID.InterfaceSegregationP;

/**
 * @author Ajit
 * 
 * 
 *Interface segregation principle is one of SOLID principle which states , 
 *interface should be design in such a way that client/class should not implement method which is not needed.
 *
 *for an example IsPrincipleMain class will fetch detail of developer and managers hence it will implement developerIterface and managerinterface only.  
 */
public class IsPrincipleMain implements DeveloperInterface,ManagerInterface{

	@Override
	public void manager() {
		System.out.println("Managers detail");
	}

	@Override
	public void developer() {
	System.out.println("developers detail");
		
	}

}
