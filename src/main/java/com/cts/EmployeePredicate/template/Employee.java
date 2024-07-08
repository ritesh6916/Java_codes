package com.cts.EmployeePredicate.template;

public class Employee {

	private int empId;
	private String name;
	private String designation;
	private double salary;
	private String city;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int i, String name, String designation, double salary, String city) {
		super();
		this.empId = i;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", city=" + city + "]";
	}
}
