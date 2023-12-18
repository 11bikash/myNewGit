package com.acc.lkm.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeUI {

	public static void main(String[] args) {
		List<EmployeeSalary>empList=new ArrayList<EmployeeSalary>();
		empList.add(new EmployeeSalary(12, "Cyril", 80000.00));
		empList.add(new EmployeeSalary(17, "Peter", 56000.00));
		empList.add(new EmployeeSalary(10, "John", 92000.00));
		//For Comparator
		System.out.println("Salary Comparison");
		Collections.sort(empList,new EmployeeSalary(0, null, 0.0));
		for(EmployeeSalary empsalary:empList) {
			System.out.println("EID is:"+empsalary.EID+"\n"+"Name is:"
		    +empsalary.name+"\n"+"Salary is:"+empsalary.salary);
			
		}

	}

}
