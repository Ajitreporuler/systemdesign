package com.lld.SOLID;

/**
 * @author Ajit
 * 
 *EmployeeCalculateBonus is having only caculate bonus 
 *SRP
 *
 */
public class EmployeeCalculateBonus {

	
	public void calculateBonus(EmployeeManage em) {
		System.out.println(em.getSalary()*10);
	}
	
	
}
