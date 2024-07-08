package com.cts.EmployeePredicate;

import java.util.ArrayList;

import com.cts.EmployeePredicate.template.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	static ArrayList<Employee> employees = new ArrayList();
	
	static {
	
		
		employees.add(new Employee(01, "Ritesh" , "Programmer", 30000.0, "Kol"));
		employees.add(new Employee(01, "Rohan" , "Annalyst", 50000.0, "Che"));
		employees.add(new Employee(01, "Boss" , "CEO", 1000000.0, "USA"));
		employees.add(new Employee(01, "Ramesh" , "PT", 18000.0, "Hyd"));
		employees.add(new Employee(01, "Shyam" , "Security", 50000.0, "Bih"));
		employees.add(new Employee(01, "Aditya" , "Programmer", 25000.0, "Kol"));
		employees.add(new Employee(01, "Mukesh" , "Programmer", 60000.0, "Del"));
	}
    public static void main( String[] args )
    {
    	System.out.println(employees);
    	
    }
}
