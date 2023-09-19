package com.lld.SOLID;

/**
 * @author Ajit
 * 
 * Single responsibility principle is one of SOLID principle of object oriented design pattern which states that 
 * a class should have only one reason to change.
 * 
 * As SingleResponsibilityPrinciple_Employee is having more than one feature manage employee and calculate bonus hence it doesn't follow SRP
 * 
 *   As per SRP we should split the responsibility into separate class
 *   
 *    EX- EmployeeCalculateBonus and EmployeeManage class
 */
public class SingleResponsibilityPrinciple_Employee {
	
	
	
	
	
	String name;
	Double salary;
	
	

	
	public void calculateBonus() {
		
		
		
	}
	
	
}
